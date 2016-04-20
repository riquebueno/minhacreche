package modelo;

import java.util.ArrayList;

public class ModeloPrincipal {

	public ArrayList listarTodos(){
		
		ArrayList lista = new ArrayList();
		
		lista.add(new Creche("creche1"));
		lista.add(new Creche("creche2"));
		lista.add(new Creche("creche3"));
		
		return lista;
		
	}
	
}
