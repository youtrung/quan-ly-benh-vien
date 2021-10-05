/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Session;
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
public class DAO_Session {
   
     public static ArrayList<POJO_Session> getlistSession() {
         ArrayList<POJO_Session> listS=new ArrayList<POJO_Session>();
             SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
             POJO_User u=new POJO_User();
         try {
            
             provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid());
             String query="SELECT p.spid,s.sid, s.serial#,s.username,p.program \n" +
                           "FROM v$session s, v$process p\n" +
                           "WHERE s.paddr=p.addr and type!='BACKGROUND'";
             ResultSet rs=provider.executeQuery(query);
             while (rs.next())
             {
                 POJO_Session ses=new POJO_Session();
                 ses.setSpid(rs.getString(1));
                 ses.setSid(rs.getString(2));
                 ses.setSerial(rs.getString(3));
                 ses.setUsername(rs.getString(4));
                 ses.setProgram(rs.getString(5));
                 listS.add(ses);
             }
             provider.Close();
         } catch (SQLException ex) {
             Logger.getLogger(DAO_Instance.class.getName()).log(Level.SEVERE, null, ex);
         }
         return listS;
     }
      public static boolean killSession(String sid,String serial) throws SQLException
      {
             boolean kq=false;
             SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
             POJO_User u=new POJO_User(); 
        
             provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid());
             String query=String.format("alter system kill session '%s,%s' ",sid,serial);
             int n= provider.executeUpdate(query);
                provider.Close();
             
         
         return kq;
      }
}
