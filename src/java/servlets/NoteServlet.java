package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author PC
 */
public class NoteServlet extends HttpServlet {

  

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title = br.readLine();
        String content = br.readLine();
        String check = request.getParameter("edit");
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        
        
            if (check == null) {
            getServletContext().getRequestDispatcher("/viewnote.jsp").forward(request, response);   
        } else {
            getServletContext().getRequestDispatcher("/editnote.jsp").forward(request, response);   
      
            }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title1");
        String content = request.getParameter("content1");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        pw.println(title);
        pw.println(content);
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        pw.flush();  
        pw.close();  
       
        getServletContext().getRequestDispatcher("/viewnote.jsp")
                    .forward(request, response);
    
    }


}
