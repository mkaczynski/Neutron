package neutron.GUI;

import java.util.ArrayList;
import java.util.List;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IFirstMove;
import neutron.Logic.Model.FirstMove;
import neutron.Logic.Model.Moves.*;
import neutron.Utils.Position;

/**
 * @author Marcin
 */
public class FirstMovesList {
    
    private List<IFirstMove> list;
    
    public FirstMovesList() {
        list = new ArrayList<IFirstMove>();
        registerMoves();
    }
    
    public List<IFirstMove> getMoves() {
        return list;
    }
    
    private void registerMoves() {
        
        list.add(new FirstMove(BorderElementType.White, new Position(0,0), new SMove(), "Czerwony - 1 - S"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,0), new SEMove(), "Czerwony - 1 - SE"));

        list.add(new FirstMove(BorderElementType.White, new Position(0,1), new SMove(), "Czerwony - 2 - S"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,1), new SEMove(), "Czerwony - 2 - SE"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,1), new SWMove(), "Czerwony - 2 - SW"));

        list.add(new FirstMove(BorderElementType.White, new Position(0,2), new SMove(), "Czerwony - 3 - S"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,2), new SEMove(), "Czerwony - 3 - SE"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,2), new SWMove(), "Czerwony - 3 - SW"));
        
        list.add(new FirstMove(BorderElementType.White, new Position(0,3), new SMove(), "Czerwony - 4 - S"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,3), new SEMove(), "Czerwony - 4 - SE"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,3), new SWMove(), "Czerwony - 4 - SW"));
        
        list.add(new FirstMove(BorderElementType.White, new Position(0,4), new SMove(), "Czerwony - 5 - S"));
        list.add(new FirstMove(BorderElementType.White, new Position(0,4), new SWMove(), "Czerwony - 2 - SW"));
        
        list.add(new FirstMove(BorderElementType.Black, new Position(4,0), new NMove(), "Zielony - 1 - N"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,0), new NEMove(), "Zielony - 1 - NE"));
        
        list.add(new FirstMove(BorderElementType.Black, new Position(4,1), new NMove(), "Zielony - 2 - N"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,1), new NEMove(), "Zielony - 2 - NE"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,1), new NWMove(), "Zielony - 2 - NW"));
        
        list.add(new FirstMove(BorderElementType.Black, new Position(4,2), new NMove(), "Zielony - 3 - N"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,2), new NEMove(), "Zielony - 3 - NE"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,2), new NWMove(), "Zielony - 3 - NW"));

        list.add(new FirstMove(BorderElementType.Black, new Position(4,3), new NMove(), "Zielony - 4 - N"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,3), new NEMove(), "Zielony - 4 - NE"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,3), new NWMove(), "Zielony - 4 - NW"));
    
        list.add(new FirstMove(BorderElementType.Black, new Position(4,4), new NMove(), "Zielony - 5 - N"));
        list.add(new FirstMove(BorderElementType.Black, new Position(4,4), new NWMove(), "Zielony - 5 - NW"));
    }
}
