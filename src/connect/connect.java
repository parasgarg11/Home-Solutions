package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect 
{
	public static Connection con=null;
	
	public static Connection ConnectDB() 
        {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","");
//			System.out.println("Connection Established");
            }
                catch(Exception e)
		{
			e.printStackTrace();
		}
                
            return con;
        
}
        public static void main(String[] args) {
        ConnectDB();
    }
}