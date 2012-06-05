/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model.Heuristics;

import neutron.Logic.Interfaces.*;
import neutron.Utils.Position;

/**
 *
 * @author programer
 */
public class Heuristic implements IHeuristicsComplexed {
    
    IGameState m_gameState;
    IGameBorder m_gameBorder;
    IPlayer m_actualPlayer;
    BorderElementType[][] m_Board;
    int m_lastBoardIndex; //ostatni index planszy
    int[] m_iaTypes = {1, 2, 3};
    int m_iType = 1;
    
    private static final int[] UP = {0,1}; //{x,y}
    private static final int[] DOWN = {0,-1};
    private static final int[] LEFT = {-1,0};
    private static final int[] RIGHT = {1,0};
    private static final int[] UPLEFT = {-1,1};
    private static final int[] UPRIGHT = {1,1};
    private static final int[] DOWNLEFT = {-1,-1};
    private static final int[] DOWNRIGHT = {1,-1};
    
    private static final int[][] MOVES = {UP, DOWN, LEFT, RIGHT, UPLEFT, UPRIGHT, DOWNLEFT, DOWNRIGHT};
	
    
    
    @Override
    public void setHeuristicType(int type){
        m_iType = type;
    }
    
    @Override
    public int[] getHeuristicsTypes(){
        return m_iaTypes;
    }
    
    @Override
    public double heuristicsValue(IGameState gameState){
        m_gameState = gameState;
        m_gameBorder = gameState.getGameBorder();
        m_actualPlayer = gameState.getActualPlayer();
        m_Board = m_gameBorder.getBorder();
        m_lastBoardIndex = m_gameBorder.getBorderSize()-1;
        
        switch(m_iType){
            case 1:
                return heuristic1();
            case 2:
                
                break;
                
            case 3:
            default:
                
                break;
        }
        
        return -100;
    }
    
    private double heuristic1(){

       //-neutron u przeciwnika
       int y = m_gameBorder.getNeutronPosition().getX();
       if(y == ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ?  0 : m_lastBoardIndex))
           return 0;
       if(y == ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? m_lastBoardIndex : 0))
            return 100;
            
        //-pionki przeciwnika zablokowane
       if(enemyBlocked())
           return 75;
      
        
       if(canNeutronReachEnemyEdge(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? UP : DOWN)))
               return 0;
       if(canNeutronReachEnemyEdge(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? UPLEFT : DOWNLEFT)))
               return 0;
       if(canNeutronReachEnemyEdge(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? UPRIGHT : DOWNRIGHT)))
               return 0;

       
      if(canNeutronReachOurLine(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ?  DOWN : UP)))
               return 25;
       if(canNeutronReachOurLine(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? DOWNLEFT : UPLEFT)))
               return 25;
       if(canNeutronReachOurLine(m_gameBorder.getNeutronPosition(), ((m_actualPlayer.getPawnsColor() == BorderElementType.Black) ? DOWNRIGHT : UPRIGHT)))
               return 25;
       
       
       //w kazdym innym przypadku
       return 10;
    }
    
    
    private boolean canNeutronReachOurLine(Position neutron, int[] move){
        
        int x, y;
        x= neutron.getY();
        y= neutron.getX();
        
        for(int i=0; i<((move[1]>0) ? (m_lastBoardIndex-y) : y); ++i){
            if(x+move[0]<0 || x+move[0]>m_lastBoardIndex || y+move[1]<0 || y+move[1]>m_lastBoardIndex) return false;
            if(m_Board[x+move[0]][y+move[1]] != BorderElementType.Blank) return false;
            x+=move[0];
            y+=move[1];
        }
        return true;
        
    }
    
    
    private boolean enemyBlocked(){
    
        int x,y;
        for(int i=0; i<5; ++i) //dla kazdego pionka
            for(int j=0; j<5; ++j){
                if(m_Board[i][j] == ((m_actualPlayer.getPawnsColor()==BorderElementType.Black) ? BorderElementType.White : BorderElementType.Black))
                {
                    for(int m=0; m<8; ++m){
                        x=i+MOVES[m][0];
                        y=j+MOVES[m][1];
                        
                        if(x>= 0 && x<=m_lastBoardIndex && y>=0 && y<=m_lastBoardIndex){
                            if(m_Board[x][y]==BorderElementType.Blank) return false;
                        }
                    }
                }
            }
        return true;
    }
    
    
    
    private boolean canNeutronReachEnemyEdge(Position neutronPosition, int[] move){
        
        int x,y, lastBordIndex;//Board is square
        x=neutronPosition.getY();
        y=neutronPosition.getX();
        lastBordIndex = m_gameBorder.getBorderSize()-1;
        int condition = ((move[1]>0) ? (lastBordIndex - y) : (y));
        
        
        for(int i=0; i < condition; ++i){
            
            if(x+move[0]<0 || x+move[0]>lastBordIndex || y+move[1]<0 || y+move[1]>lastBordIndex) return false;
            if(m_Board[x+move[0]][y+move[1]] != BorderElementType.Blank) return false;
            x+=move[0];
            y+=move[1];
        }
        
        return true;
    }
    
}
