

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Events</title>
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
                    <th scope="col">#Number</th>
                    <th scope="col">Name of Event</th>
                    <th scope="col">Event Type</th>
                    <th scope="col">Event Detail</th>
                    <th scope="col">Event Date</th>
                    
                    
                </tr>
                <%
                    ArrayList<Integer> id = new ArrayList();
                    ArrayList<String> e_title = new ArrayList();
                    ArrayList<String> e_type = new ArrayList();
                    ArrayList<String> e_details = new ArrayList();
                    ArrayList<String> e_date = new ArrayList();
                    int row ;
                    int co = 0;
                    
                    id = (ArrayList)session.getAttribute("eId");
                    e_title = (ArrayList)session.getAttribute("eTitle");
                    e_type = (ArrayList)session.getAttribute("eType");
                    e_details = (ArrayList)session.getAttribute("eDetail");
                    e_date = (ArrayList)session.getAttribute("eDate");
                    row = (int)session.getAttribute("eRow");
                    
                    while(row != 0){
                        
                %>
                <tr>
                    <td> <%=id.get(co) %> </td>
                    <td> <%=e_title.get(co)%> </td>
                    <td> <%=e_type.get(co)%> </td>
                    <td> <%=e_details.get(co)%> </td>
                    <td> <%=e_date.get(co)%> </td>
                   
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
