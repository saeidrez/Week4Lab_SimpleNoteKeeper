<%-- 
    Document   : viewnote
    Created on : Sep 30, 2020, 3:45:40 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <b>Title:</b> ${note.title}<br><br>
        <b>Contents: </b> ${note.content}  <br><br>
        <a href="note?edit">Edit</a>
        
       
     
      
    </body>
</html>
