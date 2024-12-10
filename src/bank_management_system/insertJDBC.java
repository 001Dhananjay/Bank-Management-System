
package bank_management_system;
import java.sql.*;


public class insertJDBC {

    public static void main(String args[]) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Ashlok@123");
             
           String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null , tcity varchar(400))";
           
           Statement stmt = con.createStatement();
           stmt.executeUpdate(q);
           System.out.println("table create in database....");
           con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
