/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_SGA;
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
public class DAO_SGA {
   
    public static ArrayList<POJO.POJO_SGA> getlistSGA(){
                ArrayList<POJO_SGA> listS=new ArrayList<POJO_SGA>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="Select * from v$sga";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_SGA sga=new POJO_SGA();
                sga.setName(rs.getString(1));
                sga.setValue(rs.getLong(2));
                sga.setID(rs.getLong(3));
                listS.add(sga);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
            }
    
}
