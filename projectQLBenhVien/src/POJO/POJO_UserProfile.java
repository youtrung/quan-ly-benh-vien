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
public class POJO_UserProfile {
    private String username,password,status,expiry_date,created,profile,default_table,teporary_table,local_temp_table,last_login;

    public POJO_UserProfile()
    {}

    public POJO_UserProfile(String username, String password, String status, String expiry_date, String created, String profile, String default_table, String teporary_table, String local_temp_table, String last_login) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.expiry_date = expiry_date;
        this.created = created;
        this.profile = profile;
        this.default_table = default_table;
        this.teporary_table = teporary_table;
        this.local_temp_table = local_temp_table;
        this.last_login = last_login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDefault_table() {
        return default_table;
    }

    public void setDefault_table(String default_table) {
        this.default_table = default_table;
    }

    public String getTeporary_table() {
        return teporary_table;
    }

    public void setTeporary_table(String teporary_table) {
        this.teporary_table = teporary_table;
    }

    public String getLocal_temp_table() {
        return local_temp_table;
    }

    public void setLocal_temp_table(String local_temp_table) {
        this.local_temp_table = local_temp_table;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    
}
