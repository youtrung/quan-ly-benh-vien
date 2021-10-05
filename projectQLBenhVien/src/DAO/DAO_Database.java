/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Database;
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
public class DAO_Database {
    public static ArrayList<POJO_Database> getlistDatabase(){
          ArrayList<POJO_Database> listS=new ArrayList<>();
            SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
            POJO_User u=new POJO_User();
        
        try { 
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid());
            String sql="select Name,DATABASE_ROLE,CONTROLFILE_TIME,CREATED  from v$database";
            ResultSet rs=provider.executeQuery(sql);
            while (rs.next())
            {
                POJO_Database d=new POJO_Database();
                d.setName(rs.getString(1));
                d.setDatabaserole(rs.getString(2));
                d.setControlfiletime(rs.getString(3));
                d.setCreated(rs.getString(4));
                listS.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }
}
