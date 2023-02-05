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
public class MedicineCatalog {
    
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    
    
    public Medicine addMedicine()
   {
       Medicine m = new Medicine();
       medicineList.add(m);
       return m;
   }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
           medicine.setMedicineName(name);
           medicine.setDosage(dosage);
           
           this.medicineList.add(medicine);
           
           return medicine;
           
    }
    
    //check if medicine already exists
    
   
    
    /*
    public Boolean checkIfMedicineUnique(String name){
        for(Medicine med: this.medicineList){
            if(med.getMedicineName()== name)){
                return false;
            }
        }
        return true;
    }
    
    
    */
    
    
    public void deleteMedicine(Medicine m)
   {
       medicineList.remove(m);
   }
    
    
    
    public Medicine findMedicine(String pid) {
        for (Medicine prod : this.medicineList) {
            if (prod.getMedicineName() == pid) {
                return prod;
            }
        }
        return null;
    }
    
    
}
