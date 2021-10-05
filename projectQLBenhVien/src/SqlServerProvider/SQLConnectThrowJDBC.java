/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SqlServerProvider;

import java.sql.ResultSet;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Properties;
import static javafx.beans.binding.Bindings.and;



/**
 *
 * @author trung
 */
public class SQLConnectThrowJDBC {
    Properties prop = new Properties();
    OracleDataSource ods;
    OracleConnection connection;
    Statement stm;
    public void Open(String user,String pass,String enable,String host,String port,String sid) throws SQLException{
      prop.setProperty("user",user);
      prop.setProperty("password",pass);
     
      prop.setProperty("prelim_auth",enable);
      ods = new OracleDataSource();
     ods.setConnectionProperties(prop);
     ods.setURL("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)"
             + "(HOST=" +host+")"
             + "(PORT="+port+"))"
             + "(CONNECT_DATA=(SERVICE_NAME="+sid+")))");
      connection = (OracleConnection)ods.getConnection();
      System.out.println("Connected");
    }
    public void startup() throws SQLException
    {
        connection.startup(OracleConnection.DatabaseStartupMode.NO_RESTRICTION);
        System.out.println("Instance started");
      
    }
    public void shutdownAbort() throws SQLException
    {
        connection.shutdown(OracleConnection.DatabaseShutdownMode.ABORT);
        System.out.println("shutdown abort");
      
    }
     public void shutdownImmed() throws SQLException
    {
        connection.shutdown(OracleConnection.DatabaseShutdownMode.IMMEDIATE);
        System.out.println("shutdown immediate");
      
    }
      public void shutdownFinal() throws SQLException
    {
        connection.shutdown(OracleConnection.DatabaseShutdownMode.FINAL);
        System.out.println("shutdown Final");
      
    }
     public void shutdownTransc() throws SQLException
    {
        connection.shutdown(OracleConnection.DatabaseShutdownMode.TRANSACTIONAL);
        System.out.println("shutdown TRANSACTIONAL");
      
    }
     public void shutdownNormal() throws SQLException
    {
    connection.shutdown(OracleConnection.DatabaseShutdownMode.CONNECT);
        System.out.println("shutdown normal");
      
    }
    
    
     public ResultSet executeQuery(String sql) throws SQLException 
    {
        stm=connection.createStatement();
        ResultSet rs =stm.executeQuery(sql);
        return rs;
    }
     public int executeUpdate(String sql) throws SQLException
    {
        int n=-1;
        stm=connection.createStatement();
        n=stm.executeUpdate(sql);
        return n;
        
    }
      public int closeStm() throws SQLException
    {
        int n=-1;
        stm.close();
        return n;
        
    }
    
     public void Close() throws SQLException{
         ods.close();
        connection.close();
         System.out.println("disconnect");
    }
    
}
