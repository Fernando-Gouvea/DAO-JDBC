package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			
			rs = st.executeQuery("select * from biblioteca.livro");
			
			while (rs.next()) {
				System.out.println(rs.getInt("cod_livro") + "," + rs.getString("titulo") + "," + rs.getString("nome_editora"));
				
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}
}

	


