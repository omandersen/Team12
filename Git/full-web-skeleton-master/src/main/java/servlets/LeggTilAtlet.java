package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.repository.UserRepository;
import models.UserModel;

@WebServlet(name = "LeggTilAtlet", urlPatterns = {"/LeggTilAtlet"})
public class LeggTilAtlet extends AbstractAppServlet {
    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        writeResponse(request, response, "Servlet");
    }

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        out.println("<h1>Legg til Atlet her</h1>");
        out.println("<form action='AtletMottat' method='POST'>");
        out.println("  <label for='AtletID'>AtletID:</label>");
        out.println("  <input type='number' name='AtletID'/>");
        out.println("<br>");
        out.println("<br>");
        out.println("  <label for='Alder'>Alder:</label>");
        out.println("  <input type='number' name='Alder'/>");
        out.println("<br>");
        out.println("<br>");
        out.println("  <label for='Navn'>Navn:</label>");
        out.println("  <input type='text' name='Navn'/>");
        out.println("<br>");
        out.println("<br>");
        out.println("  <label for='KlubbID'>KlubbID:</label>");
        out.println("  <input type='number' name='KlubbID'/>");
        out.println("<br>");
        out.println("<br>");
        out.println("  <label for='KlasseID'>KlasseID:</label>");
        out.println("  <input type='number' name='KlasseID'/>");
        out.println("<br>");
        out.println("<br>");
        out.println("  <input type='submit' />");
        out.println("</form>");

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
