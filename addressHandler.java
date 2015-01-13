import java.sql.*;
import javax.swing.*;

public class addressHandler {
	
	//add lines to database
	public void addLine(Connection con) {
		
	}

	//add data from a file to database
	public void addDataFile(Connection con, File f) {

	}

	//delete lines from database
	public void remove(Connection con) {

	}

	//retrieve lines from database
	public void retrieve(Connection con) {

	}
	
	//edit an entry in the database
	public void edit(Connection con) {

	}

	public static void main(String[] args) {
		String url = "";
		try {
			Connection con = DriverManager.getConnection(url);
		} catch (SQLException e) {

		}
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		String title = "Address Handler";
		String[] initialOptions = {"Add", "Delete", "Edit", "View"};
		int choice = JOptionPane.showOptionDialog(frame, "Would you like to add, delete, edit, or view an entry?", title, JOptionPane.DEFAULT_OPTION,
												  JOptionPane.QUESTION_MESSAGE, null, initialOptions, initialOptions[0]);
		String[] forms = {"Using a file", "Using the manual method"};
		if (choice == 0) {
			int form = JOptionPane.showOptionDialog(frame, "How would you like to add data?", title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
													null, forms, forms[0]);
			if (form == 0) {
				addDataFile(con, File f);
			} else {
				addLine(con);
			}
		} else if (choice == 1) {
			remove(con);
		} else if (choice == 2) {
			edit(con);
		} else {
			retrieve(con);
		}
	}	
}
