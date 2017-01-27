package BDconJava;

import java.sql.Connection;
import java.sql.Statement;

public class LiberarRecursos {

	public LiberarRecursos(){
		
	}
	private void liberarRecursos(Connection conn){
		
		try{
			conn.close();
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Error al liberar la conexion");
		}
		
		
	}
	private void liberarRecursos(Connection conn, Statement stmt){
		
		try{
			stmt.close();
			System.out.println("Se libero el stmt");
			
			conn.close();
		}catch(Exception e2){
			e2.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
		
		
		
	}
	
	private void liberarRecursos(Statement stmt){
		
		try{
			stmt.close();
		}catch (Exception e3){
			
			e3.printStackTrace();
			System.out.println("Error al cerrar el stmt");
		}
		
		
		
	}
	
	
}
