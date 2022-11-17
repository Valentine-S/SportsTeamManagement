
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Club</title>
    <style>
            table,th,td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        
        <div>
            <table>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Statistic</th>
                    <th scope="col">Statistic Type</th>
                    <th scope="col">Player</th>
                    <th scope="col">Season</th>
                    
                    
                </tr>
                <%
                    
                    ArrayList<Integer> c_id = new ArrayList();
                    ArrayList<String> c_stat = new ArrayList();
                    ArrayList<String> c_statType = new ArrayList();
                    ArrayList<String> c_player = new ArrayList();
                    ArrayList<String> c_season = new ArrayList();
                    int co = 0;
                    int row;
                    
                    c_id = (ArrayList)session.getAttribute("cId");
                    c_stat = (ArrayList)session.getAttribute("cStat");
                    c_statType = (ArrayList)session.getAttribute("cStatType");
                    c_player = (ArrayList)session.getAttribute("cPlayer");
                    c_season = (ArrayList)session.getAttribute("cSeason");
                    row = (Integer)session.getAttribute("cRow");

                    while(row != 0){
                        
                        
                %>
                <tr>
                    <td> <%=c_id.get(co)%> </td>
                    <td> <%=c_stat.get(co)%> </td>
                    <td> <%=c_statType.get(co)%> </td>
                    <td> <%=c_player.get(co)%> </td>
                    <td> <%=c_season.get(co)%> </td>
                </tr>
                <%      
                    co = co + 1;
                    row =  row - 1;
                    }
                
                %>
                
            </table>
        </div>
    </body>
</html>
