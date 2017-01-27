package EjemplosExtra;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SubirSueldo {
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		ResultSet rset = null;
		Statement stmto =null;
		
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		
			stmto = conn.createStatement();
		
		rset = stmto.executeQuery("SELECT * FROM AUMENTO_SALARIO");
		while(rset.next()){
			System.out.println(rset.getString(1)+" "+rset.getString(2)+" "+rset.getString(3)+" "+rset.getString(4));
		}
		
		}catch (Exception e){
			e.printStackTrace();
		}finally
		{
		
			if(rset!=null){try{rset.close();}catch (Exception e2){e2.printStackTrace();}}
			if(stmto!=null){try {stmto.close();}catch(Exception e2){ e2.printStackTrace();}}
			conn.setAutoCommit(true);
			if(conn!=null){try {conn.close();}catch (Exception e3){ e3.printStackTrace();}}			
		
		}
		
		
		
		
		
		
	}
	
}
