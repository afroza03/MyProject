/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="b")
public class b {
    
    
    public String book(){
        return "reservation";
    }
      public String suc(){
        return "sucessfull";
    }
    
}
