/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_PGA;
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
 * @author trung
 */
public class DAO_PGA {
    public static ArrayList<POJO.POJO_PGA> getlistPGA() {
                ArrayList<POJO_PGA> listS=new ArrayList<POJO_PGA>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                 POJO_User u=new POJO_User();
        try {
            
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select  name,display_value from v$parameter where name like '%pga%' ";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_PGA pga=new POJO_PGA();
                pga.setName(rs.getString(1));
                pga.setValue(rs.getString(2));
                listS.add(pga);
            }
                provider.Close();
        
        } catch (SQLException ex) {
            Logger.getLogger(DAO_PGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
            }
    public static boolean alterPga(String name,String size) throws SQLException
    {
        boolean kq=false ;
        SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
                 provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
              String query=String.format("Alter system set %s = %s",name,size);
              int n=provider.executeUpdate(query);
               if (n==1)
            {
                kq=true;
            }
                provider.Close();
                return kq;
    }
}
