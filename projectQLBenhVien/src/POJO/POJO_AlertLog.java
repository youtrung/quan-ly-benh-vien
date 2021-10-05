/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author rongt
 */
public class POJO_AlertLog {
    private long con;
    private String name,value,inst;

    public POJO_AlertLog()
    {
    
    }

    public long getCon() {
        return con;
    }

    public void setCon(long con) {
        this.con = con;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public POJO_AlertLog(long con, String name, String value, String inst) {
        this.con = con;
        this.name = name;
        this.value = value;
        this.inst = inst;
    }
    
    
}
