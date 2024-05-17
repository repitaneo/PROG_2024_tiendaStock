package file;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.FactoryProducto;
import data.Producto;




public class FicheroReader {

	
	public static Map<String,Producto> getDatos(String nombreFichero) {

		
		Map<String,Producto> datos = new HashMap<String,Producto>();
		
		try {
			
			// enlaza con un fichero usando las clases de Java
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombreFichero));
			
			// mientras que las lineas existan
			while (ficheroEntrada.ready()) {

				// leo una linea
				String codigo = ficheroEntrada.readLine();
				String nombre = ficheroEntrada.readLine();
				String cantidad = ficheroEntrada.readLine();
				String precio = ficheroEntrada.readLine();
				
				Producto p = FactoryProducto.createProducto(codigo,nombre,cantidad,precio);
				datos.put(p.getCodigo(), p);
				
			}
			ficheroEntrada.close();
		} catch (IOException e) {

			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}
		
		return datos;
	}	
	
}
