package EjemplosExtra;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SubierSueldo {
//Hacer que el sueldo de los empleados de departamento administracion se les suba un 20%+.
	
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		ResultSet rset = null;
		Statement stmt =null;
		
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		
			stmt = conn.createStatement();
			
			//No se ejecuta lo sgte.
		stmt.execute("UPDATE EMPLOYEES SET SALARY = (SALARY*1.2) WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME ='Administration')");	
		
		rset = stmt.executeQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = 10");
		while(rset.next()){
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getString(3)+" "+rset.getString(8));
		}
		
		conn.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally
		{
			if(rset!=null){try{rset.close();}catch (Exception e2){e2.printStackTrace();}}
			if(stmt!=null){try {stmt.close();}catch(Exception e2){ e2.printStackTrace();}}
			
			if(conn!=null){try {conn.close();}catch (Exception e3){ e3.printStackTrace();}}			
		
		}
		
		
	}
}
	
	
	

