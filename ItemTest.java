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
public class ItemTest {
    Item item;
    
    public ItemTest() {
        item = new Item("bullet","this is a bullet",10);
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        String expected = "bullet";
        String actual = item.getName();
        assertEquals(expected, actual);
    }

    /**
     * Test of getDescription method, of class Item.
     */
    @Test
    public void testGetDescription() {
        String expected = "this is a bullet";
        String actual = item.getDescription();
        assertEquals(expected, actual);
    }

    /**
     * Test of getPower method, of class Item.
     */
    @Test
    public void testGetPower() {
        int expected = 10;
        int actual = item.getPower();
        assertEquals(expected, actual);
    }
    
}
