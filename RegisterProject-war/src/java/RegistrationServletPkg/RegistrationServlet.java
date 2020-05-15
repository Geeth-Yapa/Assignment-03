/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationServletPkg;

import entityBeanPkg.Registry;
import entityBeanPkg.RegistryFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author geethyapa
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {
    
    @EJB
    private RegistryFacadeLocal registryFacade;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             String strName;
        String strPassword;
        String errmsg = " ";
        Boolean validData = true;
        
        strName    = request.getParameter("name");
        strPassword     = request.getParameter("password");
        
        Registry registry = new Registry();
         
        if (validData) {
           
            registry.setName(strName);
            registry.setPassword(strPassword);
            registryFacade.create(registry);
             
            request.setAttribute("name", strName);
            request.setAttribute("password",  strPassword);

            getServletContext()
                .getRequestDispatcher("/RegistrationConfirmation.jsp")
                .forward(request, response);
        }
        else {
        request.setAttribute("errmsg", errmsg);
        getServletContext()
                .getRequestDispatcher("/registrationForm.jsp")
                .forward(request, response);
            
        }
        }
    }

 
}
