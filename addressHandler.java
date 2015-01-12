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
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		String title = "Address Handler";
		String[] initialOptions = {"Add", "Delete", "Edit"};
		int choice = JOptionPane.showOptionDialog(frame, "Would you like to add, delete, or edit an entry?", title, JOptionPane.DEFAULT_OPTION,
												  JOptionPane.QUESTION_MESSAGE, null, initialOptions, initialOptions[0]);
		String[] forms = {"Using a file", "Using the manual method"};
		if (choice == 0) {
			int form = JOptionPane.showOptionDialog(frame, "How would you like to add data?", title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
													null, forms, forms[0]);
			if (form == 0) {
				
			} else {
				
			}
		} else {

		}
		String url = "";
		try {
			Connection con = DriverManager.getConnection(url);
		} catch (SQLException e) {
				
		}
	}	
}
