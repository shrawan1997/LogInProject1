/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.Controller;

import com.project.login.DAO.loginDAO;
import com.project.login.DAO.loginDAOImpl;
import com.project.login.Model.Login;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet("/select")
public class LogInServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        loginDAO dao = new loginDAOImpl();
        Login login = dao.search(username, password);
        
        request.setAttribute("login", login);
        request.getRequestDispatcher("accesed.jsp").forward(request, response);
    }
    
}
