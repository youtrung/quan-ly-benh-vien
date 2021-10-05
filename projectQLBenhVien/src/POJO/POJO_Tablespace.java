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
public class POJO_Tablespace {
    public String name;
    public String name_datafile;
    public String   bytes;

    public  String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public String getName_datafile() {
        return name_datafile;
    }

    public void setName_datafile(String name_datafile) {
        this.name_datafile = name_datafile;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public POJO_Tablespace(String name) {
        this.name = name;
    }

    public POJO_Tablespace() {
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
