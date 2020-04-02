/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenalvarocarbajo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Álvaro Carbajo
 */
public class pruebaTest {
    
    public pruebaTest() {
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
     * Test of aProbar method, of class prueba.
     */
    @Test
    public void testAProbar() {
        System.out.println("prueba1");
        int q = -1;
        int expResult = 0;
        int result = prueba.aProbar(q);
        assertEquals(expResult, result);
        
        System.out.println("prueba2");
        q = 0;
        expResult = 0;
        result = prueba.aProbar(q);
        assertEquals(expResult, result);
        
        
        System.out.println("prueba3");
        q = 1;
        expResult = 1;
        result = prueba.aProbar(q);
        assertEquals(expResult, result);

        // fail("The test case is a prototype.");
    }
    
}
