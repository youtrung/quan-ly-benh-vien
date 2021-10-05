/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Instance;
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
public class DAO_Instance {
     public static ArrayList<POJO.POJO_Instance> getlistIntance() {
         ArrayList<POJO_Instance> listS=new ArrayList<POJO_Instance>();
             SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
             POJO_User u=new POJO_User();
         try {
            
             provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid());
             String query="select version,host_name,Startup_time,INSTANCE_NAME from v$instance";
             ResultSet rs=provider.executeQuery(query);
             while (rs.next())
             {
                 POJO_Instance instance=new POJO_Instance();
                 instance.setVersion(rs.getString(1));
                 instance.setHostname(rs.getString(2));
                 instance.setStartuptime(rs.getString(3));
                 instance.setInstancename(rs.getString(4));
                 listS.add(instance);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAO_Instance.class.getName()).log(Level.SEVERE, null, ex);
         }
         return listS;
     }
}
