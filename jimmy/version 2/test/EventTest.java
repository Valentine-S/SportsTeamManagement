/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.logintest;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class EventTest extends Mockito{
    @Mock private Event instance = new Event();
    //@Mock private ServletConfig servletCon;
    @Mock private HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock private HttpServletResponse response = mock(HttpServletResponse.class);
    @Mock RequestDispatcher rd;
    
    public EventTest() {
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
     * Test of loadDriver method, of class Event.
     *
    @Test
    public void testLoadDriver() {
        System.out.println("loadDriver");
        String dbDriver = "";
        Event instance = new Event();
        instance.loadDriver(dbDriver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class Event.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of doGet method, of class Event.
     *
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Event instance = new Event();
        instance.doGet(request, response);
        
    }

    /**
     * Test of doPost method, of class Event.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        
        Connection connection = mock(Connection.class);
        PreparedStatement ps = mock(PreparedStatement.class);
        
        when(connection.prepareStatement("delete from Events where EventsID = ?;")).thenReturn(ps);

        when(request.getParameter("eventID")).thenReturn("id");
        when(request.getParameter("eventTitle")).thenReturn("title");
        when(request.getParameter("eventType")).thenReturn("type");
        when(request.getParameter("eventDetails")).thenReturn("detail");
        when(request.getParameter("eventDate")).thenReturn("date");
        when(request.getParameter("option")).thenReturn("delete");
        
        
        instance.doPost(request, response);
        
        verify(request).getParameter("eventID");
        verify(request).getParameter("eventTitle");
        verify(request).getParameter("eventType");
        verify(request).getParameter("eventDetails");
        verify(request).getParameter("eventDate");
        verify(request).getParameter("option");
        
        verify(rd).forward(request, response);
        verify(ps).setString(1, "eventID");
    }
    
}
