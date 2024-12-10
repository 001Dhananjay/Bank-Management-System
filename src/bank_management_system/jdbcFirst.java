
package bank_management_system;

import java.sql.*;
public class jdbcFirst {

    public static void main(String args[]) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Ashlok@123");
             
            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection Created.......");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
