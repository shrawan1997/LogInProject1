/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.login.dao;

import com.project.login.model.Login;


public interface LoginDAO {
    public Login search(String username, String password);

}

