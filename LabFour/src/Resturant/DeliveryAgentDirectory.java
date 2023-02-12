/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resturant;

import java.util.ArrayList;

/**
 *
 * @author cylai
 */
public class DeliveryAgentDirectory {
    ArrayList<DeliveryAgent> agentList;
    
    public DeliveryAgentDirectory(){
        this.agentList = new ArrayList<DeliveryAgent>();
    }

    public ArrayList<DeliveryAgent> getAgentList() {
        return agentList;
    }

    public void setAgentList(ArrayList<DeliveryAgent> agentList) {
        this.agentList = agentList;
    }
    
    
    
    
    
    public DeliveryAgent findById(String id){
        for(DeliveryAgent a: this.agentList){
            if(a.getPersonID().equals(id)){
                return a;
            }
        }
        return null;
    }
    
    
    public DeliveryAgent createAgent(String id, String name, String age){
        DeliveryAgent d = new DeliveryAgent();
        d.setPersonID(id);
        d.setName(name);
        d.setAge(age);
        
        
        this.agentList.add(d);
        return d;
        
    }
    
}
