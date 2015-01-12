import java.sql.*;
import javax.swing.*;

public class addressHandler {
	
	//add lines to database
	public void add(Connection con) {
		
	}
	
	//delete lines from database
	public void delete(Connection con) {

	}

	//retrieve lines from database
	public void retrieve(Connection con) {

	}

	public static void main(String[] args) {
		
		String url = "";
		try {
			Connection con = DriverManager.getConnection(url);
		} catch (SQLException e) {
				
		}
	}	
}
