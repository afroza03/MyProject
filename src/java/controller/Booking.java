/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="booking")
@SessionScoped

public class Booking implements Serializable{
    
    String destination;
    Date check_in;
    Date check_out;
    String person;
    String child;
    String room;
    String capacity;
    int price;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }


    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
       public List<String> Aucomplete(String input){
         List<String> items=new ArrayList<>();
        List<String> mc=new ArrayList<>();
        items.add("1+1");
        items.add("1+2");
        items.add("2+1");
         items.add("2+2");
        for(String dis: items){
            if(dis.contains(input)){
                mc.add(dis);
            }
        }
        return items;
    }
         public List<String> complete(String input){
         List<String> items=new ArrayList<>();
        List<String> mc=new ArrayList<>();
        items.add("Dhaka to Cox'Bazar");
        items.add("Dhaka to Chittagong");
        items.add("Dhaka to Patuakhali");
        
        for(String dis: items){
            if(dis.contains(input)){
                mc.add(dis);
            }
        }
        return items;
    }
         public String page(){
             return "bookingResult";
         }
    
}
