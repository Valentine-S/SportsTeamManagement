
package com.mycompany.webintro;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Player extends HttpServlet {
    
    
    public ArrayList<Integer> player_id = new ArrayList();
    public ArrayList<String> player_fName = new ArrayList();
    public ArrayList<String> player_lName = new ArrayList();
    public ArrayList<String> player_position = new ArrayList();
    public ArrayList<String> player_domHand = new ArrayList();
    public ArrayList<String> player_health= new ArrayList();
    public ArrayList<String> player_dateOB = new ArrayList();
    public ArrayList<String> player_cInfo = new ArrayList();
    public ArrayList<String> player_sponsor = new ArrayList();
    public ArrayList<String> player_status = new ArrayList();
    
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
            results = statement.executeQuery("select * from Players");
            
            //ResultSetMetaData rm = results.getMetaData();
            //int cols = rm.getColumnCount();
            
            while(results.next()){
                rowC = rowC + 1;
                
                   System.out.println("Putting database player values in variables");
                   player_id.add(results.getInt(1));
                   player_fName.add(results.getString(2));
                   player_lName.add(results.getString(3));
                   player_position.add(results.getString(4));
                   player_domHand.add(results.getString(5));
                   player_health.add(results.getString(6));
                   player_dateOB.add(results.getString(7));
                   player_cInfo.add(results.getString(8));
                   player_sponsor.add(results.getString(9));
                   player_status.add(results.getString(10));
                    
                
            }
            
            sess.setAttribute("pId", player_id);
            sess.setAttribute("pFname", player_fName);
            sess.setAttribute("pLname", player_lName);
            sess.setAttribute("pPosition", player_position);
            sess.setAttribute("pDom", player_domHand);
            sess.setAttribute("pHealth", player_health);
            sess.setAttribute("pDateOB", player_dateOB);
            sess.setAttribute("pcInfo", player_cInfo);
            sess.setAttribute("pSponsor", player_sponsor);
            sess.setAttribute("pStatus", player_status);
            
            sess.setAttribute("pRow", rowC);
            
            RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
            rd.forward(req,res);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                conn.close();
                results.close();
            } catch (SQLException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
      
        
    }
    
}
