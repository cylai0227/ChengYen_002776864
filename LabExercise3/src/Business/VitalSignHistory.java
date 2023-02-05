/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cylai
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;
    
    
    public VitalSignHistory()
    {
        vitalSignHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    

   public VitalSigns addVitals()
   {
       VitalSigns vs = new VitalSigns();
       vitalSignHistory.add(vs);
       return vs;
   }
    
   public void deleteVitals(VitalSigns v)
   {
       vitalSignHistory.remove(v);
   }
   
   
    public VitalSigns findVitalSign(String pod) {
        for (VitalSigns prod : this.vitalSignHistory) {
            if (prod.getDate() == pod) {
                return prod;
            }
        }
        return null;
    }
   
   
   
}
