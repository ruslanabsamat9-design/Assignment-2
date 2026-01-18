package connection;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet; 
public class TestConnection {
    public static void main(String[] args) {
        Postgres db = new Postgres();
        Connection con=null;
        
        try {
            con = db.getConnection(); 
            if (con != null) {
                System.out.println("Connect created!");
                Statement st = con.createStatement();
                String sql="SELECT * FROM users";
                ResultSet rs=st.executeQuery(sql);

                System.out.println("list of users:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String surname = rs.getString("surname");
                    System.out.println("ID: " + id + ", Name: " + name + ", Surname: " + surname);
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Connect closed");
                }
            } catch (Exception e) {
                System.out.println("Error during closing connect" + e.getMessage());
            }
        }
    }
}