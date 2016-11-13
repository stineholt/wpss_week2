<%-- 
    Document   : ShowFormResult
    Created on : 13-11-2016, 16:34:09
    Author     : sbh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/jspStyles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
               
        <div class="menubar">
            Logget ind som: <%= request.getParameter("firstname")%>
        </div>
        
        <div class="form">
            <table><tbody>
                <tr><td>Fornavn:</td><td><%= request.getParameter("firstname")%></td></tr>
                <tr><td>Efternavn:</td><td><%= request.getParameter("lastname")%></td></tr>
                <tr><td>By:</td><td><%= request.getParameter("city")%></td></tr>
                <tr><td>E-mail:</td><td><%= request.getParameter("mail")%></td></tr>
                <tr><td>mobil:</td><td><%= request.getParameter("mobil")%></td></tr>
                <tr><td>Fødselsår:</td><td><%= request.getParameter("birth")%></td></tr>
                <tr><td>Køn:</td><td><%= request.getParameter("sex")%></td></tr>
                <tr><td>Beskrivelse:</td><td><%= request.getParameter("description")%></td></tr>
            </tbody></table>
            
            <img style="width: 200px" src="<%= request.getParameter("image")%>"/>

        </div>
    </body>
</html>
