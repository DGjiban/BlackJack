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
public class PlayersClassTest {
    
    public PlayersClassTest() {
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
     * Test of blackJackGG method, of class PlayersClass.
     */
    @Test
    public void testBlackJackGG() {
        System.out.println("blackJackGG");
        PlayersClass instance = new PlayersClassImpl();
        boolean expResult = false;
        boolean result = instance.blackJackGG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class PlayersClass.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        PlayersClass instance = new PlayersClassImpl();
        HandClass expResult = null;
        HandClass result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class PlayersClass.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        HandClass hand = null;
        PlayersClass instance = new PlayersClassImpl();
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class PlayersClass.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PlayersClass instance = new PlayersClassImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class PlayersClass.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        PlayersClass instance = new PlayersClassImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayHand method, of class PlayersClass.
     */
    @Test
    public void testDisplayHand() {
        System.out.println("displayHand");
        PlayersClass instance = new PlayersClassImpl();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayersClassImpl extends PlayersClass {
    }
    
}
