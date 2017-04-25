/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.Data;

import toba.Beans.Account;
import toba.Data.AccountDB;
import java.io.Serializable; //adding the Serializable libraries
import javax.persistence.CascadeType; //adding the persistence libraries
import javax.persistence.Entity; //adding the persistence libraries
import javax.persistence.FetchType; //adding the persistence libraries
import javax.persistence.GeneratedValue; //adding the persistence libraries
import javax.persistence.GenerationType; //adding the persistence libraries
import javax.persistence.Id; //adding the persistence libraries
import javax.persistence.ManyToOne; //adding the persistence libraries
import javax.persistence.OneToMany; //adding the persistence libraries
import javax.persistence.Temporal; //adding the persistence libraries

/**
    Name: John M Delia Jr
    SPC Student ID: 434299
    Course COP 2806 - Java Web Applications
 */
@Entity
public class Transaction implements Serializable{
    
    @ManyToOne
    private Account account;
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    //private List<LineItem> lineItems;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    //private Date transferDate;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    
    private boolean isProcessed;
    
    
}
