/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.web;

import com.example.model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author makri
 */
public class login extends HttpServlet {

    //private Object result;

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
       // response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         String barcode = request.getParameter("barcode");
         String name = request.getParameter("name");
         String color = request.getParameter("color");
         String description = request.getParameter("description");
         MyDb db = new MyDb();
         Connection con =  db.getCon();
         Statement stmt = con.createStatement();
         stmt.executeUpdate("insert into product_data (barcode, name, color, description) values('"+barcode+"', '"+name+"', '"+color+"', '"+description+"')");
         //out.println("Your Product's Page !<br>");
         //out.println("<br>Barcode is " + barcode);
         //out.println("<br>Name is " + name);
         //out.println("<br>Color is " + color);
         //out.println("<br>Description is " + description);
        } catch (SQLException ex) {
        }
        /*request.setAttribute("barcode", result);
        request.setAttribute("name", result);
        request.setAttribute("color", result);
        request.setAttribute("description", result);*/
        
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
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
