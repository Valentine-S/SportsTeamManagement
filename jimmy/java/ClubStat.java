
package com.mycompany.webintro;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;


public class ClubStat extends HttpServlet {
    public ArrayList<Integer> club_id = new ArrayList();
    public ArrayList<String> club_statistic = new ArrayList();
    public ArrayList<String> club_statType = new ArrayList();
    public ArrayList<String> club_player = new ArrayList();
    public ArrayList<String> club_season = new ArrayList();
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
            results = statement.executeQuery("select * from ClubStats");
            
            while(results.next()){
                rowC = rowC + 1;
                
                   System.out.println("Putting database events values in variables");
                   club_id.add(results.getInt(1));
                   club_statistic.add(results.getString(2));
                   club_statType.add(results.getString(3));
                   club_player.add(results.getString(4));
                   club_season.add(results.getString(5));
            }
            sess.setAttribute("cId", club_id);
            sess.setAttribute("cStat", club_statistic);
            sess.setAttribute("cStatType", club_statType);
            sess.setAttribute("cPlayer", club_player);
            sess.setAttribute("cSeason", club_season);
            sess.setAttribute("cRow", rowC);
            
            RequestDispatcher rd = req.getRequestDispatcher("club.jsp");
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
