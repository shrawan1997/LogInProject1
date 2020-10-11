/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.controller;

import com.project.login.dao.LoginDAO;
import com.project.login.dao.impl.LoginDAOImpl;
import com.project.login.model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Dell
 */
@WebServlet("/select")
public class LogInServlet extends HttpServlet {

    private final LoginDAO loginDAO = new LoginDAOImpl();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        Login login = loginDAO.search(username, password);

        request.setAttribute("login", login);
        request.getRequestDispatcher("accesed.jsp").forward(request, response);
    }

}
