/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Profiles;
import POJO.POJO_User;
import SqlServerProvider.SQLConnectThrowJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DAO_Profiles {
    public static ArrayList<POJO.POJO_Profiles> getListProfiles()
    {
         ArrayList<POJO_Profiles> list=new ArrayList<POJO_Profiles>();
            SqlServerProvider.SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
            POJO_User user=new POJO_User(); 
        try {
           
            provider.Open(user.getUsername(),user.getPassword(),user.getEnable(),user.getHost(),user.getPort(),user.getSid());
            String query="SELECT distinct  profile,Resource_name, limit \n" +
                            "FROM dba_profiles \n" +
                            "where Resource_name like'CONNECT_TIME'";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Profiles p =  new POJO_Profiles();
                p.setProfiles(rs.getString(1));
                p.setResources_name(rs.getString(2));
                p.setLimit(rs.getString(3));
      
                list.add(p);
            }
            provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Profiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static boolean addProfiles(POJO_Profiles p){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("create profile \" %s\" limit "
                    + "cpu_per_session %s "
                    + "cpu_per_call %s "
                    + "connect_time %s idle_time %s "
                    + "sessions_per_user %s ",p.getProfiles(),p.getCpupersession()
                     ,p.getCpupercall(),p.getConnectTime(),p.getIdleTime(),p.getSessionperuser());
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
    public static boolean dropProfiles(String profilesname){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("drop profile \"%s\" cascade ",profilesname);
                     
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
    public static ArrayList<POJO.POJO_Profiles> searchProfile( String name)
    {
         ArrayList<POJO_Profiles> list=new ArrayList<POJO_Profiles>();
            SqlServerProvider.SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
            POJO_User user=new POJO_User(); 
        try {
           
            provider.Open(user.getUsername(),user.getPassword(),user.getEnable(),user.getHost(),user.getPort(),user.getSid());
            String query=String.format("SELECT distinct  profile,Resource_name, limit \n" +
                            "FROM dba_profiles \n" +
                            "where profile like'%s'",name);
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Profiles p =  new POJO_Profiles();
                p.setProfiles(rs.getString(1));
                p.setResources_name(rs.getString(2));
                p.setLimit(rs.getString(3));
      
                list.add(p);
            }
            provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Profiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
     public static boolean alterProfiles(String name,String bien){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter profile \"%s\" limit %s ",name,bien);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean grantProfiles(String user,String name){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter user %s profile %s ",user,name);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
}
