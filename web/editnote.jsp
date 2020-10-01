<%-- 
    Document   : editnote
    Created on : Sep 30, 2020, 3:45:49 PM
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
        <h2>Edit Note</h2>
        <form action="note" method="post">
        Title: 
        <input type="text" name="title1" value=${note.title}><br><br>
        Contents:</b <br><br>
        
    
    <textarea rows="4" cols="50" name="content1"> ${note.content}</textarea><br>
      <input type="submit" value="Save">
        </form>
</html>
