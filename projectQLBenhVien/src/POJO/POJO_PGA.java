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
public class POJO_PGA {
    private long maxpga,allocatpga,usedpga;
    private String name,value;

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

    public POJO_PGA() {
    }

    public long getMaxpga() {
        return maxpga;
    }

    public void setMaxpga(long maxpga) {
        this.maxpga = maxpga;
    }

    public long getAllocatpga() {
        return allocatpga;
    }

    public void setAllocatpga(long allocatpga) {
        this.allocatpga = allocatpga;
    }

    public long getUsedpga() {
        return usedpga;
    }

    public void setUsedpga(long usedpga) {
        this.usedpga = usedpga;
    }
    
}
