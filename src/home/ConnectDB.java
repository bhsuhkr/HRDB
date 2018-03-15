package home;
import java.sql.*;

public class ConnectDB {
	
	private static final String USERNAME="root";
    private static final String PASSWORD="qhgus9857";
    private static final String URL="jdbc:mysql://localhost:3306/sakila";
    private static Connection conn=null;
    
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement myStmt = conn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from actor");
			
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}


