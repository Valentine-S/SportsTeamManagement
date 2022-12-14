/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.logintest;
import com.mycompany.logintest.Player;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
/**
 *
 * @author curry
 */
@RunWith(MockitoJUnitRunner.class)
public class PlayerTest extends Mockito{
    
    //Player instance = mock(Player.class);
    @Mock private Player ser = new Player();
    //@Mock private ServletConfig servletCon;
    @Mock private HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock private HttpServletResponse response = mock(HttpServletResponse.class);
    @Mock RequestDispatcher rd;
    public PlayerTest() {
        //this.servletA = new Player();
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
     * Test of loadDriver method, of class Player.
     *
    @Test
    public void testLoadDriver() {
        System.out.println("loadDriver");
        String dbDriver = "com.mysql.jdbc.Driver";
        Player instance = new Player();
        instance.loadDriver(dbDriver);
        
    }

    /**
     * Test of getConnection method, of class Player.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        //Player instance = new Player();
        Connection expResult = null;
        Connection result = ser.getConnection();
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of doGet method, of class Player.
     *
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        
        when(response.getWriter()).thenReturn();

        ser.doGet(request, response);
        response.getWriter().append
        verify(response.).doGet(request, response);
    }

    /**
     * Test of doPost method, of class Player.
     */
    @Test
    public void testDoPost() throws ServletException, IOException, Exception {
        System.out.println("doPost");
        //when(ser.doGet(request, response)).thenReturn("n");
        when(request.getParameter("playerID")).thenReturn("id");
        when(request.getParameter("firstName")).thenReturn("Jim");
        when(request.getParameter("lastName")).thenReturn("last");
        when(request.getParameter("playerPos")).thenReturn("pos");
        when(request.getParameter("playerHand")).thenReturn("hand");
        when(request.getParameter("playerHealth")).thenReturn("health");
        when(request.getParameter("playerDOB")).thenReturn("Jdob");
        when(request.getParameter("playerContact")).thenReturn("content");
        when(request.getParameter("playerSponsor")).thenReturn("sponsor");
        when(request.getParameter("playerStats")).thenReturn("stat");
        when(request.getParameter("option")).thenReturn("Delete");
        when(request.getRequestDispatcher("/players.jsp")).thenReturn(rd);

        Connection connection = mock(Connection.class);
        PreparedStatement ps = mock(PreparedStatement.class);
        ser.doGet(request, response);
        
        verify(request).getParameter("playerID");
        verify(request).getParameter("firstName");
        verify(request).getParameter("lastName");
        verify(request).getParameter("playerPos");
        verify(request).getParameter("playerHand");
        verify(request).getParameter("playerHealth");
        verify(request).getParameter("playerDOB");
        verify(request).getParameter("playerContact");
        verify(request).getParameter("playerSponsor");
        verify(request).getParameter("playerStats");
        verify(request).getParameter("option");
        
        verify(rd).forward(request, response);
        verify(ps).setString(1, "playerID");
        
        
    }
   
}
