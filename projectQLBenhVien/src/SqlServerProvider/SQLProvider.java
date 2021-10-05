/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SqlServerProvider;

import POJO.POJO_User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author trung
 */
public class SQLProvider {
    String driver="oracle.jdbc.OracleDriver";
          
    String urlConnection="jdbc:oracle:thin:@localhost:1521:orcl";
    Connection connection=null;
    public void Open(String name,String pass) throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        connection=DriverManager.getConnection(urlConnection,name,pass);
        
    }
    public void Close() throws SQLException{
        connection.close();
    }
    public ResultSet executeQuery(String sql) throws SQLException 
    {
        Statement statement=connection.createStatement();
        ResultSet rs =statement.executeQuery(sql);
        return rs;
    }
      public int executeUpdate(String sql) throws SQLException
    {
        int n=-1;
        Statement stm=connection.createStatement();
        n=stm.executeUpdate(sql);
        return n;
    }
    
}
