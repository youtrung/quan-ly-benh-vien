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
public class POJO_User {
   public  static  String username,password,enable,host,port,sid;
   public String login_time,last_logon;

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }

    public String getLast_logon() {
        return last_logon;
    }

    public void setLast_logon(String last_logon) {
        this.last_logon = last_logon;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        POJO_User.host = host;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        POJO_User.port = port;
    }

    public static String getSid() {
        return sid;
    }

    public static void setSid(String sid) {
        POJO_User.sid = sid;
    }
  

    public static String getEnable() {
        return enable;
    }

    public static void setEnable(String enable) {
        POJO_User.enable = enable;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        POJO_User.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        POJO_User.password = password;
    }

    

    public POJO_User() {
    }

   
    
    
    
    
}
