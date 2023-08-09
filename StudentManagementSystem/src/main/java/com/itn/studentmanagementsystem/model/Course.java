/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itn.studentmanagementsystem.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author hunter
 */
public class Course implements Serializable{
    
    private static final long serialVersionUID = 125634645633L;
    
    private int id;
    private String name;
    private String duration;
    private String timing;
    private String type;
    private double fee;
    
    public Course() {}

    public Course(int id, String name, String duration, String timing, double fee) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.timing = timing;
        this.type = type;
        this.fee = fee;
    }

    public Course(double fee) {
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", duration=" + duration + ", timing=" + timing + ", type=" + type + ", fee=" + fee + '}';
    }
    
    

   
    
    
}
