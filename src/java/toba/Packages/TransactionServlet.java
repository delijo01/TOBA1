package toba.Packages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.Beans.Account;
import toba.Data.AccountDB;

/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
public class TransactionServlet extends HttpServlet {

    /**
     * 1. This page will allow the user to post a transaction. 
     * 2. Just add a header for now
     * 
     * Sample doPost method
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set the Content Type
        response.setContentType("text/html;charset=UTF-8");
        //set url variable
        String url;
        //create the session scope
        HttpSession session = request.getSession();
        // store data in Account object
        Account account = new Account();
        //insertng the account info in the account DB
        AccountDB.insert(account);
        //apply page to url string
        url = "/Account_activity.jsp";
        //set the account Attributes to sesson scope        
        session.setAttribute("account", account);
        
        //get the information from the form
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        
        // get parameters from the request
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TransactionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TransactionServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    /**
     * Sample doGet method
     *
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Call the doPost method
        doPost(request, response);
    }

}
