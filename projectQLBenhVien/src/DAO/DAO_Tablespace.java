/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import POJO.POJO_Tablespace;
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
public class DAO_Tablespace {
     public static ArrayList<POJO_Tablespace> getlistDetailDatafile(){
                ArrayList<POJO_Tablespace> listData=new ArrayList<POJO_Tablespace>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select a.name as \"TableSpace\",b.name,b.bytes  from v$tablespace a Left JOIN v$datafile b on a.TS#=b.TS#";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Tablespace data =  new POJO_Tablespace();
                data.setName(rs.getString(1));
                data.setName_datafile(rs.getString(2));
                data.setBytes(rs.getString(3));
                listData.add(data);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listData;
            }
     public static boolean addDatafile(String nametbl,String size){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("create tablespace %s datafile 'D:\\ORACLE\\ORCL\\%s.DBF' size %s",nametbl,nametbl,size);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean kiemtraNameTblspace(String nametbl){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select count(name) from v$tablespace where name like '%" +nametbl +"%'";
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean kiemtraNameDatafile(String datafile){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select count(name) from v$datafile where name like '%" +datafile +"%'";
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean addDatafileOnly(String nametbl,String namedatafile,String size){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter tablespace %s add datafile 'D:\\ORACLE\\ORCL\\%s.DBF' size %s",nametbl,namedatafile,size);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean deleteDatafile(String nametbl,String namedatafile){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter tablespace %s drop datafile '%s' ",nametbl,namedatafile);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static boolean deleteTablespace(String name){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("Drop tablespace %s including contents and datafiles ",name);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
     public static ArrayList<POJO_Tablespace> searchTablespace(String name){
                ArrayList<POJO_Tablespace> listData=new ArrayList<POJO_Tablespace>();
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query="select a.name as \"TableSpace\",b.name  from v$tablespace a ,v$datafile b where a.TS#=b.TS# and a.name like '%"+ name + "%'";
            ResultSet rs=provider.executeQuery(query);
            while (rs.next())
            {
                POJO_Tablespace data =  new POJO_Tablespace();
                data.setName(rs.getString(1));
                data.setName_datafile(rs.getString(2));
                listData.add(data);
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listData;
            }
     public static boolean AlterDatafile(String namedatafile,String size){
                 boolean kq=false ;
                SQLConnectThrowJDBC provider =new SQLConnectThrowJDBC();
                POJO_User u=new POJO_User();
       
        try {
            provider.Open(u.getUsername(),u.getPassword(),u.getEnable(),u.getHost(),u.getPort(),u.getSid()); 
            String query=String.format("alter database datafile '%s' resize %s",namedatafile,size);
            int n=provider.executeUpdate(query);
            if (n==1)
            {
                kq=true;
            }
                provider.Close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SGA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
            }
}
