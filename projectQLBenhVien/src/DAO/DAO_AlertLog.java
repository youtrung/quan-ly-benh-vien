/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.POJO_AlertLog;
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
public class DAO_AlertLog {
    public static ArrayList<POJO.POJO_AlertLog> getlistAlertlog(){
                ArrayList<POJO_AlertLog> listAlert=new ArrayList<POJO_AlertLog>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select * from v$diag_info";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_AlertLog alertl =  new POJO_AlertLog();
                alertl.setInst(rs.getString(1));
                alertl.setName(rs.getString(2));
                alertl.setValue(rs.getString(3));
                alertl.setCon(rs.getLong(4));
                listAlert.add(alertl);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAlert;
            }
}
