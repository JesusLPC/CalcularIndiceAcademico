/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Nota;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
public class CalcularServlet extends HttpServlet {

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
        
        String nc1 = request.getParameter("nc1");
        String nc2 = request.getParameter("nc2");
        String nc3 = request.getParameter("nc3");
        String nc4 = request.getParameter("nc4");
        String nc5 = request.getParameter("nc5");
        String nc6 = request.getParameter("nc6");
        
        Double cc1 = Double.parseDouble(request.getParameter("cc1"));
        Double cc2 =Double.parseDouble(request.getParameter("cc2"));
        Double cc3 = Double.parseDouble(request.getParameter("cc3"));
        Double cc4 = Double.parseDouble(request.getParameter("cc4"));
        Double cc5 = Double.parseDouble(request.getParameter("cc5"));
        Double cc6 = Double.parseDouble(request.getParameter("cc6"));
        
        Double notac1 = Double.parseDouble(request.getParameter("notac1"));
        Double notac2 = Double.parseDouble(request.getParameter("notac2"));
        Double notac3 = Double.parseDouble(request.getParameter("notac3"));
        Double notac4 = Double.parseDouble(request.getParameter("notac4"));
        Double notac5 = Double.parseDouble(request.getParameter("notac5"));
        Double notac6 = Double.parseDouble(request.getParameter("notac6"));
        
        
       Double sumaCreditos = cc1 + cc2 + cc3 + cc4 + cc5 + cc6;
       
       Double creditoNota1 = cc1*notac1 ;
       Double creditoNota2 = cc2 * notac2;
       Double creditoNota3  = cc3 * notac3;
       Double creditoNota4  = cc4 * notac4;
       Double creditoNota5  = cc5 * notac5;
       Double creditoNota6  = cc6 * notac6;
       
       Double sumaCreditoNota= creditoNota1 + creditoNota2 + creditoNota3 +creditoNota4 + creditoNota5 + creditoNota6;
                
        Double indice = sumaCreditoNota/sumaCreditos;
        
         List<Nota> list = new ArrayList();
         
         list.add(new Nota(1, nc1, notac1, cc1));
         list.add(new Nota(2, nc2, notac2, cc2));
         list.add(new Nota(3, nc3, notac3, cc3));
         list.add(new Nota(4, nc4, notac4, cc4));
         list.add(new Nota(5, nc5, notac5, cc5));
         list.add(new Nota(6, nc6, notac6, cc6));
         
         request.setAttribute("listaCursos", list);
        request.setAttribute("respuesta", indice);
        
        try (PrintWriter out = response.getWriter()) {

            request.getRequestDispatcher("Indice.jsp").forward(request, response);
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
