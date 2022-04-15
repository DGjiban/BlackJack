/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SheridanFundamentalsGroupProject;

import java.util.ArrayList;
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
public class DeckClassTest {
    
    public DeckClassTest() {
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
     * Test of createDeck method, of class DeckClass.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        DeckClass instance = new DeckClass();
        instance.createDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleDeck method, of class DeckClass.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        DeckClass instance = new DeckClass();
        instance.shuffleDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class DeckClass.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        DeckClass instance = new DeckClass();
        CardsClass expResult = null;
        CardsClass result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class DeckClass.
     */
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        ArrayList<CardsClass> cards = null;
        DeckClass instance = new DeckClass();
        instance.addCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearDeck method, of class DeckClass.
     */
    @Test
    public void testClearDeck() {
        System.out.println("clearDeck");
        DeckClass instance = new DeckClass();
        instance.clearDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
