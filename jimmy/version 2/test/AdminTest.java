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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of getUname method, of class Admin.
     */
    @Test
    public void testGetUname() {
        System.out.println("getUname");
        Admin instance = new Admin();
        String expResult = "Jimmy";
        instance.setUname(expResult);
        String result = instance.getUname();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUname method, of class Admin.
     */
    @Test
    public void testSetUname() {
        System.out.println("setUname");
        String uname = "Jimmy";
        Admin instance = new Admin();
        instance.setUname(uname);
        String result = instance.getUname();
        
        assertEquals(uname, result);
    }

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = new Admin();
        String expResult = "password";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class Admin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password";
        Admin instance = new Admin();
        instance.setPassword(password);
        String result = instance.getPassword();
        
        assertEquals(password, result);
    }

    /**
     * Test of getEmail method, of class Admin.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Admin instance = new Admin();
        String expResult = "email";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class Admin.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "email";
        Admin instance = new Admin();
        instance.setEmail(email);
        String result = instance.getEmail();
        
        assertEquals(email, result);
    }

    /**
     * Test of getPhone method, of class Admin.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Admin instance = new Admin();
        String expResult = "Phone";
        instance.setPhone(expResult);
        String result = instance.getPhone();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPhone method, of class Admin.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "phone";
        Admin instance = new Admin();
        instance.setPhone(phone);
        String result = instance.getPhone();
        
        assertEquals(phone, result);
    }

    /**
     * Test of getFirstName method, of class Admin.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Admin instance = new Admin();
        String expResult = "First";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFirstName method, of class Admin.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Admin instance = new Admin();
        instance.setFirstName(firstName);
        String result = instance.getFirstName();
        
        assertEquals(firstName, result);
    }

    /**
     * Test of getLastName method, of class Admin.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Admin instance = new Admin();
        String expResult = "last";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLastName method, of class Admin.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "last";
        Admin instance = new Admin();
        instance.setLastName(lastName);
        String result = instance.getLastName();
        
        assertEquals(lastName, result);
        
    }

    /**
     * Test of getDetails method, of class Admin.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Admin instance = new Admin();
        String expResult = "detail";
        instance.setDetails(expResult);
        String result = instance.getDetails();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDetails method, of class Admin.
     */
    @Test
    public void testSetDetails() {
        System.out.println("setDetails");
        String details = "tail";
        Admin instance = new Admin();
        instance.setDetails(details);
        String result = instance.getDetails();
        
        assertEquals(details, result);
    }
    
}
