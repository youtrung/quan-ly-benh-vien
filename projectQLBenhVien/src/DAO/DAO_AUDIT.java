/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_AUDIT;
import POJO.POJO_User;
import SqlServerProvider.SQLConnectThrowJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class DAO_AUDIT {
     public static ArrayList<POJO_AUDIT> getlist()
     {
         ArrayList<POJO_AUDIT> list=new ArrayList<POJO_AUDIT>();
         SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
         POJO_User u=new POJO_User();
         try { 
             provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid());
             String query="select OBJECT_SCHEMA,OBJECT_NAME,POLICY_OWNER,POLICY_NAME,ENABLED,POLICY_TEXT,POLICY_COLUMN,AUDIT_TRAIL,POLICY_COLUMN_OPTIONS"
                     + " From DBA_AUDIT_POLICIES";
              ResultSet rs=provider.executeQuery(query);
              while (rs.next())
              {
                  POJO_AUDIT audit=new POJO_AUDIT();
                  audit.setOBJECT_SCHEMA(rs.getString(1));
                  audit.setOBJECT_NAME(rs.getString(2));
                  audit.setPOLICY_OWNER(rs.getString(3));
                  audit.setPOLICY_NAME(rs.getString(4));
                  audit.setENABLED(rs.getString(5));
                  audit.setPOLICY_TEXT(rs.getString(6));
                  audit.setPOLICY_COLUMN(rs.getString(7));
                  audit.setAUDIT_TRAIL(rs.getString(8));
                  audit.setPOLICY_COLUMN_OPTIONS(rs.getString(9));
                  list.add(audit);
              }
              provider.Close();
         } catch (SQLException ex) {
             Logger.getLogger(DAO_AUDIT.class.getName()).log(Level.SEVERE, null, ex);
         }
         return list;
     }
    
}
