/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.POJO_Dictionary;
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
public class DAO_Dictionary {
    public static ArrayList<POJO.POJO_Dictionary> getlistDictionary(){
                ArrayList<POJO_Dictionary> listDictionary=new ArrayList<POJO_Dictionary>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select * from dictionary";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Dictionary dictionary =  new POJO_Dictionary();
                dictionary.setName(rs.getString(1));
                dictionary.setComment(rs.getString(2));
                listDictionary.add(dictionary);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDictionary;
            }
}
