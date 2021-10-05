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
public class POJO_Dictionary {
    private String name,comment;

    public POJO_Dictionary()
    {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public POJO_Dictionary(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
    
}
