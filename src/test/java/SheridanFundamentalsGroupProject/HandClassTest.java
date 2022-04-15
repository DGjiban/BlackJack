/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class HandClassTest {
    
    public HandClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of drawDeck method, of class HandClass.
     */
    @Test
    public void testDrawDeck() {
        System.out.println("drawDeck");
        DeckClass deck = null;
        HandClass instance = new HandClass();
        instance.drawDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueHand method, of class HandClass.
     */
    @Test
    public void testGetValueHand() {
        System.out.println("getValueHand");
        HandClass instance = new HandClass();
        int expResult = 0;
        int result = instance.getValueHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class HandClass.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int i = 0;
        HandClass instance = new HandClass();
        CardsClass expResult = null;
        CardsClass result = instance.getCard(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearHand method, of class HandClass.
     */
    @Test
    public void testClearHand() {
        System.out.println("clearHand");
        HandClass instance = new HandClass();
        instance.clearHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HandClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HandClass instance = new HandClass();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
