/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itn.studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hunter
 */
public class UserDao extends DBConfig{
    
    public boolean verifyUser(String username, String password){
    boolean verified = false;
    String sql = "select username,password,role from user_table where "
            + "username = ?";
    
    Connection conn = null;
    
    try
    {
    Class.forName(Driver_Class);
    conn = DriverManager.getConnection(URL,USER,PASS);
    
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, username);
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
    if(rs.getString("username").equals(username) && rs.getString("password").equals(password)){
        verified = true;
    }
    }
   
    }   catch (ClassNotFoundException | SQLException e ) {
            System.out.println(e);
    }finally{
    try
    {
    if(conn!=null){
    conn.close();
    }
    }catch (Exception e){
        System.out.println(e);
    }
    }
    
    return verified;
    }
    
}
