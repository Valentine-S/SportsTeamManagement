/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.logintest;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author curry
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginTest extends Mockito{
    @Mock private Login instance = new Login();
    //@Mock private ServletConfig servletCon;
    @Mock private HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock private HttpServletResponse response = mock(HttpServletResponse.class);
    @Mock RequestDispatcher rd;
    
    public LoginTest() {
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
     * Test of doGet method, of class Login.
     *
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Login instance = new Login();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class Login.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
       
        when(request.getParameter("uname")).thenReturn("id");
        when(request.getParameter("password")).thenReturn("pass");
        
        instance.doPost(request, response);
        
        verify(request).getParameter("uname");
        verify(request).getParameter("password");
        verify(rd).forward(request, response);
    }
    
}
