package Json;

import com.google.gson.Gson;

public class mainJson {
public static void main(String[] args) {
	
	/*
	 * Juan es un chico madrile�o que se trabaja de recadero. Su d�a a d�a se resume en conectarse a internet y consultar la lista de recados que le han ido dejando por una web (http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados) para despu�s ir haci�ndolos uno a uno hasta que llega la noche.
	*Es un tipo tan vago que ha decidido contratar una app a medida para que nada m�s se encienda el tel�fono, le aparezca la lista de tareas. Proponed un dise�o que permita:
	*que la app se inicie automaticamente al encender el m�vil y muestre la lista de tareas ordenadas por fecha y hora
	*Consejo: Enumera las partes de tu app antes de escribir una sola l�nea ( Qu� clases necesitas y de qu� se encarga cada cual) y describe el proceso de comunicaci�n y ejecuci�n de forma que te ayude a visualizar la soluci�n
	*GITHUB de la parte remota (sobre todo por si os viene bien la clase Recado a la hora de deserializar en Android)
	*https://github.com/Valexx55/CICE_RECADERO
	*URL del Servicio (Servlet)

	*http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados
	*ENTREGA L�MITE : Para el pr�ximo viernes a las 23:59
	 */
	
	
	Gson gson = new Gson();
	Persona p = new Persona("Maria",false,true,40,4);
	String result= gson.toJson(p);

	System.out.println(result);

	Persona p2 = new Persona("Nira", false, false, 30, 2);
	p2 =gson.fromJson(result, Persona.class);

	String res2= p2.getnM();
	
	System.out.println(res2);
	
	//gson.fromJson(json, classOfT);
	
}	
	
	
	
}
