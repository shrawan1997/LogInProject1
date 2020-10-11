/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.DAO;

import com.project.login.Model.Login;


public interface loginDAO {
    public Login search(String username, String password);
    
    
    
}

