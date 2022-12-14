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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author curry
 */
@RunWith(MockitoJUnitRunner.class)
public class RegisterTest extends Mockito{
    @Mock private Player instance = new Player();
    //@Mock private ServletConfig servletCon;
    @Mock private HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock private HttpServletResponse response = mock(HttpServletResponse.class);
    
    
    public RegisterTest() {
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
     * Test of doGet method, of class Register.
     *
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Register instance = new Register();
        instance.doGet(request, response);
        
    }

    /**
     * Test of doPost method, of class Register.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        when(request.getParameter("uname")).thenReturn("uname");
        when(request.getParameter("password")).thenReturn("pass");
        when(request.getParameter("email")).thenReturn("email");
        when(request.getParameter("phone")).thenReturn("phone");
        when(request.getParameter("firstName")).thenReturn("fname");
        when(request.getParameter("lastName")).thenReturn("lname");
        when(request.getParameter("details")).thenReturn("detai");
        when(request.getParameter("adminCode")).thenReturn("code");
        
        instance.doPost(request, response);
        verify(request).getParameter("uname");
        verify(request).getParameter("password");
        verify(request).getParameter("email");
        verify(request).getParameter("phone");
        verify(request).getParameter("firstName");
        verify(request).getParameter("lastName");
        verify(request).getParameter("details");
        verify(request).getParameter("adminCode");
        
    }
    
}
