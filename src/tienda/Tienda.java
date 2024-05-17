package tienda;

import java.util.List;
import java.util.Map;

import data.JoinLista;
import data.Producto;
import file.FicheroReader;

public class Tienda {

	private final String NOMBRE_FICHERO_1 = "stock1.txt";
	private final String NOMBRE_FICHERO_2 = "stock2.txt";

	
	public Tienda() {
		
	}
	
	
	
	public void go() {
		
		Map<String,Producto> datosF1 = FicheroReader.getDatos(NOMBRE_FICHERO_1);
		Map<String,Producto> datosF2 = FicheroReader.getDatos(NOMBRE_FICHERO_2);
		
		List<Producto> listaFinalProductos = JoinLista.join(datosF1,datosF2);
		System.out.println(listaFinalProductos);
		
		
	}
	
	
}
