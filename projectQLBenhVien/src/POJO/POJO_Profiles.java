/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Admin
 */
public class POJO_Profiles {
    private  String profiles,resources_name,limit;
    public  String cpupercall,cpupersession,sessionperuser,idleTime,connectTime;

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    public String getResources_name() {
        return resources_name;
    }

    public void setResources_name(String resources_name) {
        this.resources_name = resources_name;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getCpupercall() {
        return cpupercall;
    }

    public void setCpupercall(String cpupercall) {
        this.cpupercall = cpupercall;
    }

    public String getCpupersession() {
        return cpupersession;
    }

    public void setCpupersession(String cpupersession) {
        this.cpupersession = cpupersession;
    }

    public String getSessionperuser() {
        return sessionperuser;
    }

    public void setSessionperuser(String sessionperuser) {
        this.sessionperuser = sessionperuser;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    

    public String getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(String connectTime) {
        this.connectTime = connectTime;
    }

    

    
}
