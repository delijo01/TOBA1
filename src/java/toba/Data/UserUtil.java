/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.Data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author delijo01
 */
public class UserUtil {
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("emailListPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
