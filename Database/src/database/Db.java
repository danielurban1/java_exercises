package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zawody_bjj","root","123Fokus456p");
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery("select*from dane_os");
			while(rs.next()){
				System.out.printf("%-10s",rs.getInt(1));
				System.out.printf("%-30s", rs.getString(2));
				System.out.printf("%-40s", rs.getString(3));
				System.out.println();
			}
			con.close();
			} 
		catch(Exception e){
			System.out.println(e);
			}
}
}