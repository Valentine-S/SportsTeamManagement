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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author curry
 */
@RunWith(MockitoJUnitRunner.class)
public class StatisticTest extends Mockito{
    @Mock private Statistic instance = new Statistic();
    //@Mock private ServletConfig servletCon;
    @Mock private HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock private HttpServletResponse response = mock(HttpServletResponse.class);
    @Mock RequestDispatcher rd;
    
    public StatisticTest() {
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
     * Test of loadDriver method, of class Statistic.
     *
    @Test
    public void testLoadDriver() {
        System.out.println("loadDriver");
        String dbDriver = "";
        Statistic instance = new Statistic();
        instance.loadDriver(dbDriver);
        
    }

    /**
     * Test of getConnection method, of class Statistic.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of doGet method, of class Statistic.
     *
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Statistic instance = new Statistic();
        instance.doGet(request, response);
        
    }

    /**
     * Test of doPost method, of class Statistic.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        System.out.println("doPost");
        
        Connection connection = mock(Connection.class);
        PreparedStatement ps = mock(PreparedStatement.class);
        
        when(connection.prepareStatement("delete from ClubStats where StatID = ?;")).thenReturn(ps);

        when(request.getParameter("statID")).thenReturn("id");
        when(request.getParameter("statistic")).thenReturn("title");
        when(request.getParameter("statType")).thenReturn("type");
        when(request.getParameter("player")).thenReturn("detail");
        when(request.getParameter("season")).thenReturn("date");
        when(request.getParameter("option")).thenReturn("delete");
        
        
        instance.doPost(request, response);
        
        verify(request).getParameter("statID");
        verify(request).getParameter("statistic");
        verify(request).getParameter("statType");
        verify(request).getParameter("player");
        verify(request).getParameter("season");
        verify(request).getParameter("option");
        
        verify(rd).forward(request, response);
        verify(ps).setString(1, "statID");
        
    }
    
}
