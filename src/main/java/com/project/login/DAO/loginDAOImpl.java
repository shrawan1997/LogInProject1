/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.DAO;

import com.project.login.Connector.DatabaseConnector;
import com.project.login.Model.Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class loginDAOImpl implements loginDAO{
    Connection con= null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
    
    @Override
    public Login search(String username, String password) {
        Login login = new Login();
        try {
            String query = "select * from logindb where username=? and password=?";
            
            con=DatabaseConnector.getdatabasecon();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()){
                login.setFirstName(rs.getString("firstname"));
                login.setLastName(rs.getString("lastname"));
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login;
    }    
    
}
