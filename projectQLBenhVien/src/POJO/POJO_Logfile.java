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
public class POJO_Logfile {
    private long group,id;
    private String status,type,member,recovery;
    
    public POJO_Logfile(){
    }

    public long getGroup() {
        return group;
    }

    public void setGroup(long group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public POJO_Logfile(long group, long id, String status, String type, String member, String recovery) {
        this.group = group;
        this.id = id;
        this.status = status;
        this.type = type;
        this.member = member;
        this.recovery = recovery;
    }
    
    
}
