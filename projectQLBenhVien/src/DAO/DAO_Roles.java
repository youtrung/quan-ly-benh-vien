/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Roles;
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
public class DAO_Roles {
    public static ArrayList<POJO_Roles> getlistRoles(){
        ArrayList<POJO_Roles> list=new ArrayList<POJO_Roles>();
            SqlServerProvider.SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
            POJO_User user=new POJO_User();
        try {
            provider.Open(user.getUsername(),user.getPassword(),user.getEnable(),user.getHost(),user.getPort(),user.getSid());
            String query="select role,authentication_type from dba_roles";
            ResultSet rs=provider.executeQuery(query);
            while(rs.next())
            {
                POJO_Roles role=new POJO_Roles();
                role.setRoles(rs.getString(1));
                role.setAuthenticationtype(rs.getString(2));
                list.add(role);
            }
            provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Roles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static boolean addRoles(String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("create role \"%s\" not identified",name);
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
     public static boolean dropRoles(String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("drop role \"%s\" ",name);
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
     public static boolean grantPrivileges(String privileges,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("grant %s to  \"%s\" ",privileges,name);
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
     public static boolean revokePrivileges(String privileges,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("revoke %s from  \"%s\" ",privileges,name);
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
      public static boolean grantPrivileges_WithAdmin(String privileges,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("grant %s to  \"%s\" with admin option ",privileges,name);
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
      public static boolean grantObjName(String privileges,String table_name,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("grant %s on %s  to \"%s\" ",privileges,table_name,name);
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
