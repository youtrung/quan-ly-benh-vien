/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author trung
 */
public class POJO_SGA {
    private String Name;
    private long value;
    private long ID;

    public POJO_SGA() {
    }
    
    
    public POJO_SGA(String Name) {
        this.Name = Name;
    }
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public double getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
}
