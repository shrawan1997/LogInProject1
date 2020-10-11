/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.dao.impl;

import com.project.login.connectionfactory.DatabaseConnector;
import com.project.login.model.Login;
import com.project.login.dao.LoginDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAOImpl implements LoginDAO {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;


    @Override
    public Login search(String username, String password) {
        Login login = new Login();
        try {
            String query = "select * from logindb where username=? and password=?";

            con = DatabaseConnector.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                login.setFirstName(rs.getString("first_name"));
                login.setLastName(rs.getString("last_name"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login;
    }

}
