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
                System.out.println("Байланыс орнатылды!");
                Statement st = con.createStatement();
                String sql="SELECT * FROM users";
                ResultSet rs=st.executeQuery(sql);

                System.out.println("list of users:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String surname = rs.getString("surname");
                    System.out.println("ID: " + id + ", Аты: " + name + ", Жөні: " + surname);
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Қате: " + e.getMessage());
        }
        finally{
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Байланыс жабылды.");
                }
            } catch (Exception e) {
                System.out.println("Байланысты жабу кезінде қате: " + e.getMessage());
            }
        }
    }
}