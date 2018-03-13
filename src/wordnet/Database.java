
package wordnet;
import java.sql.*;

public class Database {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public Database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st = con.createStatement();
            
            
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
            
        }
    }
    
    public void getData()
    {
        try
        {
            String query = "SELECT * FROM colours";
            rs = st.executeQuery(query);
            System.out.println("Primary Colours");
            
            while(rs.next())
            {
                String colour = rs.getString("colour");
                System.out.println("Colour: " + colour);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
