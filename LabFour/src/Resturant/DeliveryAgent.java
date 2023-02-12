/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resturant;

import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author cylai
 */
public class DeliveryAgent {
    private int orderCount;
    String PersonID;
    String Name;
    String username;
    String password;
    String age;
    
    private ArrayList<Order> agentOrderlist;
    
    public DeliveryAgent(){
        super();
        this.agentOrderlist = new ArrayList<Order>();
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public ArrayList<Order> getAgentOrderlist() {
        return agentOrderlist;
    }

    public void setAgentOrderlist(ArrayList<Order> agentOrderlist) {
        this.agentOrderlist = agentOrderlist;
    }

    
    
  

    public String getPersonID() {
        return PersonID;
    }

    public void setPersonID(String PersonID) {
        this.PersonID = PersonID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void addDeliveryorder(Order o){
        this.agentOrderlist.add(o);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
    
}
