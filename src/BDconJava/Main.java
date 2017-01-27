package BDconJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Main {

	public static void trigger (Connection conexion) {
		Statement stmt = null;
		
	}
	
	public static void updates(Connection conexion){
		Statement stmt = null;
		
		try{
			stmt = conexion.createStatement();
			stmt.execute("UPDATE EMPLOYEES SET SALARY = SALARY + (SALARY*0.2) WHERE DEPARTMENT_ID = 10");
			
			
		}catch(Exception e3){
			e3.printStackTrace();
			System.out.println("Error al ejecutar el update");
		}finally{
			try{
				stmt.close();
			}catch(Exception e4){
				e4.printStackTrace(); System.out.println("Error al cerrar el stmt");
			}
		}
		
		
		
	}
	
	public static void consultas(Connection conexion){
		Statement stmt = null;
		ResultSet aux=null;
		
		try{
			
			stmt = conexion.createStatement();
			aux = stmt.executeQuery("SELECT * FROM AUMENTO_SALARIO");
			
			while(aux.next()){
				System.out.println("Id_Aumento: "+aux.getString(0)+" Fecha: "+aux.getString(1)+" Employee_id: "+aux.getString(2)+" Cantidad_aumento: "+aux.getString(3));
			}
			
		}catch(Exception e){
			
		}finally{
			try{
			aux.close(); System.out.println("Se cerro el Rset");
			
			stmt.close();
		}catch(Exception e2){
			e2.printStackTrace(); System.out.println("Error al cerrar Rset o stmt");
		}
		}
		
		
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexion1 =null;
		Savepoint aux =null;
		
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conexion1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
			
			conexion1.setAutoCommit(false);
			
			
			updates(conexion1);
			
			aux =conexion1.setSavepoint();
			
			consultas(conexion1);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			conexion1.rollback(aux);
		}finally{
			
			conexion1.close();
		}
		
		
	}
}
