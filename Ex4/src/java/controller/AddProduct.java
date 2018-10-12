/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class AddProduct extends HttpServlet {

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
    
            int pid = Integer.parseInt( request.getParameter("pid") );
            String pname = request.getParameter( "pname");
            String pdesc = request.getParameter("pdesc");
            int price = Integer.parseInt(request.getParameter("price"));
            
            //validation code is written in controller
            ArrayList<String> errList = new ArrayList<>();
            
            if(pid < 100){
                errList.add("Product id is invalid");
            }
            if(pname.length()==0){
                errList.add("Please enter product name");
            }
            
            if(pdesc.length()< 5){
                errList.add("Please enter Description properly");
            }
            if(price <= 0){
                errList.add("Price must be > zero");
            }
            
            if(errList.isEmpty()){
                //if errlist is empty go to successpage
             //  response.sendRedirect("Success");
             request.getRequestDispatcher("Success").forward(request, response);
              
              
            }else{
                //go to error page
               // response.sendRedirect("Error");
               request.setAttribute("ErrMsg", errList);
                RequestDispatcher rd = request.getRequestDispatcher("Error");
                rd.forward(request, response);
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProduct at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
