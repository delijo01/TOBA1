/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.Data;

/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
public class Account {
    
    private String user;
    private double balance;
    private double Checking;
    private double Savings;
    public enum Checking{      
    }
    public enum Savings{
    }

    public Account(){
        user = "";
        balance = 0;
    }
    
    public Account(String user, double balance){
        this.user = user;
        this.balance = balance;
        
        
    }
    public static double credit(double creditBal){
        double cbal = ++creditBal;
        
        return cbal;
    }
    
    public static double debit(double debitBal){
        double dbal = --debitBal;
        
        return dbal;
    }
    
    public double getSavings(){
        return Savings;
    }
    
    public double setSavings(double Savings){
        this.Savings = Savings;
        return Savings;
    }

    public double getChecking(){
        return Checking;
    }
    
    public double setChecking(double Checking){
        this.Checking = Checking;
        return Checking;
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
}
