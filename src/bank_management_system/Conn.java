package bank_management_system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try{
           // Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem1","root","Ashlok@123");
            s=c.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
