
package com.itn.studentmanagementsystem.dao;

import com.itn.studentmanagementsystem.model.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class CourseDao extends DBConfig{
    public Course getCourseByID(int id){
      Course course = null;
      Connection conn = null;
      
      try{
          Class.forName(Driver_Class);
          conn = DriverManager.getConnection(URL,USER,PASS);
          String sql = "select * from Course_db where id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1,id);
          ResultSet rs = ps.executeQuery();
          if(rs.next())
          {
              course = new Course();
              course.setId(rs.getInt("id"));
              course.setName(rs.getString("name"));
              course.setTiming(rs.getString("timing"));
              course.setType(rs.getString("type"));
              course.setFee(rs.getDouble("fee"));
          }
          
      } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally{
          try
          {
          if(conn!=null)
          {
              conn.close();
          }
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      
      return course;
    }
    
    public ArrayList<Course> getAllCourse()
    {
        ArrayList<Course> cl = null;
        Connection conn = null;
        try
        {
            Class.forName(Driver_Class);
            conn = DriverManager.getConnection(URL,USER,PASS);
            String sql = "select * from user_table";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Course course = new Course();
                course.setId(rs.getInt("id"));
                course.setName(rs.getString("name"));
                course.setDuration(rs.getString("duration"));
                course.setTiming(rs.getString("timing"));
                course.setType(rs.getString("type"));
                course.setFee(rs.getInt("fee"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
            try
            {
                if(conn!=null)
            {
                conn.close();
            }
                
            }
            catch (SQLException e)
                {
                    e.printStackTrace();
                }
        }
        
        return cl;
    }
    
    
    
    public boolean addCourse(Course course)
    {
    boolean added = false;
    Connection conn = null;
    
    try
    {
        Class.forName(Driver_Class);
        conn = DriverManager.getConnection(URL,USER,PASS);
        String sql = "insert into user_table (name,duration,timing,type,fee) " +
                "values(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,course.getName());
        ps.setString(2,course.getDuration());
        ps.setString(3,course.getTiming());
        ps.setString(4,course.getType());
        ps.setDouble(5,course.getFee());
        
        if(ps.executeUpdate()==1)
        {
            added = true;
        }
        
    }   catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    
    
    return added;
    }
    
    public boolean updateCourse(Course course)
    {
        boolean updated = false;
        Connection conn = null;

        try{
            Class.forName(Driver_Class);
            conn = DriverManager.getConnection(URL,USER,PASS);
            String sql = "UPDATE user_table set name=?,duration = ?,timing = ?,type = ?,fee = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,course.getName());
            ps.setString(2,course.getDuration());
            ps.setString(3,course.getTiming());
            ps.setString(4,course.getType());
            ps.setDouble(5,course.getFee());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return updated;
    }
}




