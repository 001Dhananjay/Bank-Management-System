
package bank_management_system;

import java.sql.*;
import java.io.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class inserstion_dy {
    public static void main(String args[]) {
        // TODO code application logic here
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Ashlok@123");
             
          // String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null , tcity varchar(400))";
           String q= "insert into table1(tName, tCity) value (?,?)";
           
         
           PreparedStatement pstmt =con.prepareStatement(q);
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter your Name : ");
           String name=br.readLine();
           
            System.out.println("Enter City :");
           String city=br.readLine();
           
           //set the value to query
           pstmt.setString(1, name);
           pstmt.setString(2, city);
           
           
           
           pstmt.executeUpdate();
           System.out.println("inserted....");
         
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
