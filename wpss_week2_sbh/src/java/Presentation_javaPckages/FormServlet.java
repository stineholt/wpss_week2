/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_javaPckages;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sbh
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/FormServlet"})
public class FormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String city = request.getParameter("city");
        String mail = request.getParameter("mail");
        String mobil = request.getParameter("mobil");
        String birth = request.getParameter("birth");
        String sex = request.getParameter("sex");
        String description = request.getParameter("description");
        String image = request.getParameter("image");
        String imageurl = request.getParameter("image");
                
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\"background-color: gainsboro; height: 30px; text-align: right; font-family: Verdana; font-size: 20px;padding: 10px;\">");
                out.println("Logget ind som: "+firstname+"");
            out.println("</div>");
            out.println("<h1>Indtastet data</h1>");
            out.println("<table>");
            out.println("<tbody>");
                out.println("<tr><td>Fornavn:</td><td>"+firstname+"</td></tr>");
                out.println("<tr><td>Efternavn:</td><td>"+lastname+"</td></tr>");
                out.println("<tr><td>By:</td><td>"+city+"</td></tr>");
                out.println("<tr><td>E-mail:</td><td>"+mail+"</td></tr>");
                out.println("<tr><td>mobil:</td><td>"+mobil+"</td></tr>");
                out.println("<tr><td>Fødselsår:</td><td>"+birth+"</td></tr>");
                out.println("<tr><td>Køn:</td><td>"+sex+"</td></tr>");
                out.println("<tr><td>Beskrivelse:</td><td>"+description+"</td></tr>");
            out.println("</tbody></table>");
            out.println("<img style=\"width: 200px\" src=\""+imageurl+"\"/>");
            out.println("</body>");
            out.println("</html>");
            
            RequestDispatcher rd = request.getRequestDispatcher("ShowFormResult.jsp");
            rd.forward (request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
