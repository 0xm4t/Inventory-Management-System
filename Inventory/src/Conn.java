import java.sql.*;

public class Conn {

	Connection c = null;
	Statement stmt = null;
	
	Conn()
	{}
	public Connection getDBConnection()
	{
		try{
			 this.c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/inventory?user=root&password=alpollon");
			 return c;
		}
		catch (Exception e) {
			System.err.println(e);
		}
		return c;
	}
}
