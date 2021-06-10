package com.practice.JdbcConn;

import java.sql.*;     

public class JdbcConnectivity {    
   public static void main(String[] args) {
      try {
         //Connection object
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root", "password");    
 
         //Statement object
         Statement stmt = conn.createStatement();
       
         // executes an update statement
        
         int countUpdated = stmt.executeUpdate("update cakes set price = price + 10.0 where id = 1");
         System.out.println(countUpdated + " records affected ");
 
         
         // INSERT multiple records
         int countInserted = stmt.executeUpdate("insert into cakes values (4, 'rainbow cake',70.0),(5, 'white forest',85.5)");
         System.out.println(countInserted + " records inserted.\n");
         
         // DELETE records with id = 3
         int countDeleted = stmt.executeUpdate("delete from cakes where id = 3");
         System.out.println(countDeleted + " records deleted.\n");
 
         // display contents
        
         ResultSet result = stmt.executeQuery("select * from cakes");
         while(result.next()) {   
            System.out.println(result.getInt("id") + ", "
                    + result.getString("name") + ", "
                    + result.getDouble("price"));
                    
         }
         
      }
      
      catch(SQLException ex) {
         ex.printStackTrace();
      } 
   }
}