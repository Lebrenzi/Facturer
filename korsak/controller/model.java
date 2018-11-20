/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korsak.controller;
import java.sql.*;

/**
 *
 * @author lebrenzi
 */

public class model{
        
        private Connection myConnection;
        private Statement myStatement;
        private ResultSet rst;
        
	model(){
            try{
            
                myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facturer", "root", "password");
                
                myStatement = myConnection.createStatement();
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            };
           
	};
        
        public String returnAllFromTable(String tableName) throws SQLException
        {
            rst = myStatement.executeQuery("select * from " + tableName);
            StringBuilder str = new StringBuilder();
            int idx = 2;
            rst.next();
            return rst.getString(idx);
        };
        
        
}
        


