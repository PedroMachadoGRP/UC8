/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioarraylist;

/**
 *
 * @author PEDROMACHADODASILVA
 */
public class Contacts {
    
    private String name;
    private String phone;
    
    public Contacts(String name,String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void  setPhone(String phone){
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return name + "-" + phone;
    }
}
