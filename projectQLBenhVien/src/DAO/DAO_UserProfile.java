/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.POJO_UserProfile;
import POJO.POJO_User;
import SqlServerProvider.SQLConnectThrowJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rongt
 */
public class DAO_UserProfile {
    public static ArrayList<POJO.POJO_UserProfile> getlistUserProfile(){
                ArrayList<POJO_UserProfile> listUser=new ArrayList<POJO_UserProfile>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select username,account_status,EXPIRY_DATE,CREATED,profile,default_tablespace,TEMPORARY_TABLESPACE,LOCAL_TEMP_TABLESPACE,LAST_LOGIN from DBA_USERS";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_UserProfile userprofile =  new POJO_UserProfile();
                userprofile.setUsername(rs.getString(1));
                userprofile.setStatus(rs.getString(2));
                userprofile.setExpiry_date(rs.getString(3));
                userprofile.setCreated(rs.getString(4));
                userprofile.setProfile(rs.getString(5));
                userprofile.setDefault_table(rs.getString(6));
                userprofile.setTeporary_table(rs.getString(7));
                userprofile.setLocal_temp_table(rs.getString(8));
                userprofile.setLast_login(rs.getString(9));
                listUser.add(userprofile);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
            }
    public static boolean addUser(String nameuser,String pass,String profile,String tbl,String size) throws SQLException
    {
        boolean kq=false;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
                
                    provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("create user %s identified by %s"
                    + " Profile %s "
                    + " Default tablespace %s "
                    + " Temporary Tablespace Temp "
                    + " Quota %s on %s ",nameuser,pass,profile,tbl,size,tbl);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
                
            
                return kq;
    }
    
        public static boolean deleteUser(String nameuser) throws SQLException{
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("drop user %s cascade", nameuser);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        
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
          public static boolean grantTablespace(String tablespace,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter user %s default tablespace %s  ", name,tablespace);
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
   public static boolean grantRoles(String role,String name)
    {
          boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("grant  %s to user %s  ", role,name);
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
