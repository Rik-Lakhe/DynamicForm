/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.df.dao;

/**
 *
 * @author LAKHE
 */
public interface LoginDAO {
    public boolean checkLogin(String userName, String userPassword);
}
