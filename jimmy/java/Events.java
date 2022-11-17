package com.mycompany.webintro;

import java.io.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


public class Events extends HttpServlet {
    
    public ArrayList<Integer> event_id = new ArrayList();
    public ArrayList<String> event_title = new ArrayList();
    public ArrayList<String> event_type = new ArrayList();
    public ArrayList<String> event_details = new ArrayList();
    public ArrayList<String> event_date = new ArrayList();
    public int rowC = 0;
    
    private Connection conn = null;
    private Statement statement = null;
    private ResultSet results = null;
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String ff = "jdbc:mysql://localhost:3306/SportsTeam";
        String usr = "root";
        String pass = "password";
        HttpSession sess = req.getSession();
        
 
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        
        try{
            this.conn = DriverManager.getConnection(ff,usr,pass);
            if(this.conn == null){
                System.out.println("conn null");
            }
            statement = conn.createStatement();
            results = statement.executeQuery("select * from Events");
            
            while(results.next()){
                rowC = rowC + 1;
                
                   System.out.println("Putting database events values in variables");
                   event_id.add(results.getInt(1));
                   event_title.add(results.getString(2));
                   event_type.add(results.getString(3));
                   event_details.add(results.getString(4));
                   event_date.add(results.getString(5));
                   
            }
            sess.setAttribute("eId", event_id);
            sess.setAttribute("eTitle", event_title);
            sess.setAttribute("eType", event_type);
            sess.setAttribute("eDetail", event_details);
            sess.setAttribute("eDate", event_date);
            sess.setAttribute("eRow", rowC);

            RequestDispatcher rd = req.getRequestDispatcher("schedule.jsp");
            rd.forward(req,res);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                conn.close();
                results.close();
            } catch (SQLException ex) {
                Logger.getLogger(Events.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         
    }
   
    
}
