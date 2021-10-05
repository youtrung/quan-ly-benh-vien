/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.POJO_Controlfile;
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
public class DAO_Controlfile {
    public static ArrayList<POJO.POJO_Controlfile> getlistControlfile(){
                ArrayList<POJO_Controlfile> listCtrl=new ArrayList<POJO_Controlfile>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="Select name from v$controlfile";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Controlfile ctrlf =  new POJO_Controlfile();
                ctrlf.setName(rs.getString(1));
                listCtrl.add(ctrlf);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCtrl;
            }

    public ArrayList<POJO_Controlfile> getlistDatafile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
