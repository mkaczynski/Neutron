/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neutron.Logic.Model;

import java.security.InvalidParameterException;
import neutron.Logic.Interfaces.BorderElementType;
import neutron.Logic.Interfaces.IPlayer;
import neutron.Logic.Interfaces.PlayerNumber;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * @author Marcin
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void get_player_number() {

        IPlayer instance = new Player(PlayerNumber.Player2, BorderElementType.Black);
        PlayerNumber expResult = PlayerNumber.Player2;
        
        PlayerNumber result = instance.getPlayerNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void get_pawns_color() {
        
        IPlayer instance = new Player(PlayerNumber.Player2, BorderElementType.Black);
        BorderElementType expResult = BorderElementType.Black;
        
        BorderElementType result = instance.getPawnsColor();
        assertEquals(expResult, result);
    }
    
    @Test
    public void try_create_invalid_player() {
        
        boolean wasException = false;
        try
        {
            IPlayer instance = new Player(PlayerNumber.Player2, BorderElementType.Neutron);
        }
        catch(InvalidParameterException ex)
        {
            wasException = true;
        }
        
        assertEquals(true, wasException);
    }
}
