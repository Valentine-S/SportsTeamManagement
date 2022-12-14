/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.logintest;

import java.sql.Connection;
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

public class RegisterDaoTest {
    
    public RegisterDaoTest() {
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
     * Test of loadDriver method, of class RegisterDao.
     */
    @Test
    public void testLoadDriver() {
        System.out.println("loadDriver");
        String dbDriver = "com.mysql.jdbc.Driver";
        RegisterDao instance = new RegisterDao();
        instance.loadDriver(dbDriver);
        
    }

    /**
     * Test of getConnection method, of class RegisterDao.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        RegisterDao instance = new RegisterDao();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of insert method, of class RegisterDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Admin admin = new Admin("b","password","rob@due.com", "987-990-800", "Robert", "Kim", "King");
        RegisterDao instance = new RegisterDao();
        String expResult = "Data Entered Successfully";
        String result = instance.insert(admin);
        
        assertEquals(expResult, result);
        
    }
    
}