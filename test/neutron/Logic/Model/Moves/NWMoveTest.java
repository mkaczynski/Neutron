/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model.Moves;

import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IGameBorder;
import neutron.Logic.Interfaces.IGameBorderGenerator;
import neutron.Logic.Interfaces.IMove;
import neutron.Logic.Model.GameBorderGenerator;
import neutron.Utils.Position;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Marcin
 */
public class NWMoveTest {
    
    public NWMoveTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void move_nw_czysta_plansza_neutron() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder border = gbg.generateNewGame(5); 
    
        IMove m = new NWMove();       
        IGameBorder newBorder = m.Move(border, BorderElementType.Neutron, new Position(2, 2));
        newBorder.write();
        
        assertEquals(BorderElementType.Blank, newBorder.getElement(2, 2));
        assertEquals(BorderElementType.Neutron, newBorder.getElement(1, 1));
        
        assertEquals(BorderElementType.Neutron, border.getElement(2, 2));
        assertEquals(BorderElementType.Blank, border.getElement(1, 1));
    }
    
    @Test
    public void move_nw_czysta_plansza_brak_ruchu() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder border = gbg.generateNewGame(5); 
    
        IMove m = new NWMove();       
        IGameBorder newBorder = m.Move(border, BorderElementType.White, new Position(0, 0));
    
        assertEquals(null, newBorder);
    }
    
    @Test
    public void move_nw_czysta_plansza_ruchy_czarnych() {
        
        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder border = gbg.generateNewGame(5); 
    
        IMove m = new NWMove();       
        IGameBorder newBorder = m.Move(border, BorderElementType.Black, new Position(4, 0));
    
        assertEquals(null, newBorder);
        
        newBorder = m.Move(border, BorderElementType.Black, new Position(4, 1));
        newBorder.write();
        
        assertEquals(BorderElementType.Black, newBorder.getElement(3, 0));
        assertEquals(BorderElementType.Blank, newBorder.getElement(4, 1));
        
        newBorder = m.Move(border, BorderElementType.Black, new Position(4, 2));
        newBorder.write();
        
        assertEquals(BorderElementType.Black, newBorder.getElement(2, 0));
        assertEquals(BorderElementType.Blank, newBorder.getElement(4, 2));
        
        newBorder = m.Move(border, BorderElementType.Black, new Position(4, 3));
        newBorder.write();
        
        assertEquals(BorderElementType.Black, newBorder.getElement(1, 0));
        assertEquals(BorderElementType.Blank, newBorder.getElement(4, 3));
        
        newBorder = m.Move(border, BorderElementType.Black, new Position(4, 4));
        newBorder.write();
        
        assertEquals(BorderElementType.Black, newBorder.getElement(3, 3));
        assertEquals(BorderElementType.Blank, newBorder.getElement(4, 4));
    }
    
    @Test
    public void brak_ruchu_w_kierunku_nw() {

        IGameBorderGenerator gbg = new GameBorderGenerator();
        IGameBorder border = gbg.generateNewGame(5); 
    
        IMove m = new SMove();       
        IGameBorder firstStep = m.Move(border, BorderElementType.Neutron, new Position(2, 2));
    
        m = new NWMove();
        IGameBorder newBorder = m.Move(firstStep, BorderElementType.White, new Position(4, 3));
        
        assertNull(newBorder);
   }
}
