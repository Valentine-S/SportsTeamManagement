
<%@page import="com.mycompany.webintro.Player"%>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profiles</title>
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
                    <th scope="col">Number</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Player Position</th>
                    <th scope="col">Dominant Hand</th>
                    <th scope="col">Player Health</th>
                    <th scope="col">Date Of Birth</th>
                    <th scope="col">Contact Information</th>
                    <th scope="col"> Sponsor Name</th>
                    <th scope="col"> Player Statics </th>
                    
                </tr>
                <%
                    ArrayList<Integer> p_id = new ArrayList();
                    ArrayList<String> p_fName = new ArrayList();
                    ArrayList<String> p_lName = new ArrayList();
                    ArrayList<String> p_position = new ArrayList();
                    ArrayList<String> p_domHand = new ArrayList();
                    ArrayList<String> p_health= new ArrayList();
                    ArrayList<String> p_dateOB = new ArrayList();
                    ArrayList<String> p_cInfo = new ArrayList();
                    ArrayList<String> p_sponsor = new ArrayList();
                    ArrayList<String> p_status = new ArrayList();
                    int co = 0;
                    int row ;
                    
                    p_id = (ArrayList)session.getAttribute("pId");
                    p_fName = (ArrayList)session.getAttribute("pFname");
                    p_lName = (ArrayList)session.getAttribute("pLname");
                    p_position = (ArrayList)session.getAttribute("pPosition");
                    p_domHand = (ArrayList)session.getAttribute("pDom");
                    p_health = (ArrayList)session.getAttribute("pHealth");
                    p_dateOB = (ArrayList)session.getAttribute("pDateOB");
                    p_cInfo = (ArrayList)session.getAttribute("pcInfo");
                    p_sponsor = (ArrayList)session.getAttribute("pSponsor");
                    p_status = (ArrayList)session.getAttribute("pStatus");
                          
                    row = (Integer)session.getAttribute("pRow");
                    System.out.println(p_fName.get(1)+ "this is here!  " + row);
                    while(row != 0){
                       
                %>
               <tr>
                    
                    <td> <%=p_id.get(co) %> </td>
                    <td> <%=p_fName.get(co) %> </td>
                    <td> <%=p_lName.get(co) %> </td>
                    <td> <%=p_position.get(co) %> </td>
                    <td> <%=p_domHand.get(co) %> </td>
                    <td> <%=p_health.get(co) %> </td>
                    <td> <%=p_dateOB.get(co) %> </td>
                    <td> <%=p_cInfo.get(co) %> </td>
                    <td> <%=p_sponsor.get(co) %> </td>
                    <td> <%=p_status.get(co) %> </td>
                    
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
