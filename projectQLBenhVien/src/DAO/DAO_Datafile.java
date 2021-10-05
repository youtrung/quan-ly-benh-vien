/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Datafile;
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
public class DAO_Datafile {
    public static ArrayList<POJO.POJO_Datafile> getlistDatafile(){
                ArrayList<POJO_Datafile> listData=new ArrayList<POJO_Datafile>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select name from v$datafile";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Datafile data =  new POJO_Datafile();
                data.setName(rs.getString(1));
                listData.add(data);
            }
                provider.Close();
       
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listData;
            }
}
