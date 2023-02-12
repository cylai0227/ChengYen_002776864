/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author cylai
 */
public class Customer {
    private int ordersTotal;
    String PersonID;
    String Name;
    String Age;
    
    private ArrayList<Order> customerorderlist;
    
    public Customer(){
        super();
        this.customerorderlist = new ArrayList<Order>();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<Order> getCustomerorderlist() {
        return customerorderlist;
    }

    public void setCustomerorderlist(ArrayList<Order> customerorderlist) {
        this.customerorderlist = customerorderlist;
    }
    
   
    public void addorder(Order order){
        this.customerorderlist.add(order);
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

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    
    
    
}
