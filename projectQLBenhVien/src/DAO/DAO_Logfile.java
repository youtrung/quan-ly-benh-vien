/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Logfile;
import POJO.POJO_User;
import SqlServerProvider.SQLConnectThrowJDBC;
import SqlServerProvider.SQLProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rongt
 */
public class DAO_Logfile {
    public static ArrayList<POJO.POJO_Logfile> getlistLogfile(){
                ArrayList<POJO_Logfile> listLog=new ArrayList<POJO_Logfile>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="Select * from v$logfile";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Logfile log =  new POJO_Logfile();
                log.setGroup(rs.getLong(1));
                log.setStatus(rs.getString(2));
                log.setType(rs.getString(3));
                log.setMember(rs.getString(4));
                log.setRecovery(rs.getString(5));
                log.setId(rs.getLong(6));
                listLog.add(log);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLog;
            }
}
