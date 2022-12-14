
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
public class LoginDaoTest {
    
    public LoginDaoTest() {
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
     * Test of loadDriver method, of class LoginDao.
     */
    @Test
    public void testLoadDriver() {
        System.out.println("loadDriver");
        String dbDriver = "com.mysql.jdbc.Driver";
        LoginDao instance = new LoginDao();
        instance.loadDriver(dbDriver);
        
      
    }

    /**
     * Test of getConnection method, of class LoginDao.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        LoginDao instance = new LoginDao();
        Connection expResult = null;
        Connection result = instance.getConnection();
        
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of validate method, of class LoginDao.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Auth login = new Auth("jim" , "aa");
        LoginDao instance = new LoginDao();
        boolean expResult = true;
        boolean result = instance.validate(login);
        
        assertEquals(expResult, result);
        
        
    }
    
}

