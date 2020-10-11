/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.Model;

import com.project.login.DAO.loginDAO;
import com.project.login.DAO.loginDAOImpl;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        loginDAO log = new loginDAOImpl();
        Login login = log.search("Admin", "12345");
        System.out.println("First Name: " +login.getFirstName());
        System.out.println("Last Name: " +login.getLastName());
        
    }
}
