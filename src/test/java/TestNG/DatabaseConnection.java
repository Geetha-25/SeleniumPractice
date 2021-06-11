package TestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnection {

	@Test
	public void db() throws SQLException, ClassNotFoundException
	{
		String host="localhost";
		String port="3306";
	
		String query="SELECT * FROM PARTY_SUBSCRIPTION_PLAN WHERE PARTY_ID='h';";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/ofbiz","root","");
		
 	   Statement stmt = con.createStatement();					

			
  		ResultSet rs= stmt.executeQuery(query);							
  		
			while (rs.next()){
		        		String myName = rs.getString("PARTY_ID");								        
                     					                               
                     System. out.println(myName);		
             }		
			 	
			con.close();		
		
	}
}
