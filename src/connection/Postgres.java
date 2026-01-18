package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgres implements IDB {
   
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
         String url="jdbc:postgresql://localhost:5432/test";

         try {
            Class.forName("org.postgresql.Driver");
             Connection con=DriverManager.getConnection(url,"postgres","Ar1.Ar1.");
             return con;
         } catch (Exception e) {
           System.out.println(e);
        return null;}
    }


}
