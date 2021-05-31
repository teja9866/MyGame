/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tejar
 */
public class GameTest {
    
    public GameTest() {
        long timeStart = System.currentTime();
        timeCounter = 50;
        parser = new Parser();
        player = new Player();
        roons = new RoomCreation();
        currentRoom = room.getRoom("castle");
    }

    /**
     * Test of getCurrentRoom method, of class Game.
     */
    @Test
    public void testGetCurrentRoom() {
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
    }

    /**
     * Test of processCommand method, of class Game.
     */
    @Test
    public void testProcessCommand() {
    }
    
}
