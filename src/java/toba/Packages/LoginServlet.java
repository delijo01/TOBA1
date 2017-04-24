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

import toba.Beans.User; //import the Java beans Class library
import toba.Data.UserDB; //import the Java Data Class library

/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
public class LoginServlet extends HttpServlet {

    /**
     * 1. Code the servlet to retrieve the username and password form the form
     * we added to login.html. Have the servlet check that the username is equal
     * to jsmith@toba.com and the password is equal to "letmein". Make sure you
     * use these values. If the username and password match, the servlet to 
     * forward the request to the account_activity.html page. If it is incorrect,
     * it should forward the request to the login_failure.html page.
     * 
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    //Create the doPost method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set the Content Type
        response.setContentType("text/html;charset=UTF-8");
        
        // get parameters from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //set the url
        String url = "/index.jsp";
        //set the userid
        String userid = "jsmith@toba.com";
        //set the password
        String pw = "letmein";
        //Create a condition to look for the username and password specified
        if( username.equals(userid) && password.equals(pw) ) {
            //set the url
            url = "/Account_activity.jsp";
        } else {
            //set the url
            url = "/Login_failure.jsp";
        }
        //get the information from the form
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    //Create the doGet Method
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Call the doPost method
        doPost(request, response);
    }


}
