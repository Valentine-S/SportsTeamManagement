/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.logintest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curry
 */
public class AuthTest {
    
    public AuthTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserName method, of class Auth.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Auth instance = new Auth();
        String expResult = "Name";
        instance.setUserName(expResult);
        String result = instance.getUserName();
        
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserName method, of class Auth.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String UserName = "name";
        Auth instance = new Auth();
        instance.setUserName(UserName);
        String result = instance.getUserName();
        
        assertEquals(UserName, result);
    }

    /**
     * Test of getPassword method, of class Auth.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Auth instance = new Auth();
        String expResult = "name";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class Auth.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "pass";
        Auth instance = new Auth();
        instance.setPassword(Password);
        String result = instance.getPassword();
        
        assertEquals(Password, result);
    }
    
}
