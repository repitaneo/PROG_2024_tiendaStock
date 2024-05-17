package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import error.PreciosMismathException;

public class JoinLista {

	public static List<Producto> join(Map<String, Producto> datosF1, Map<String, Producto> datosF2) {
		
		List<Producto> datosFusionados = new ArrayList<Producto>();
		
		// recorro los datos del fichero 1 cogiendo las keys
		Set<String> keys1 = datosF1.keySet();
		for(String s: keys1) {
			
			// voy a avanzar por todas las keys del F1
			if(datosF2.containsKey(s)) {
				
				// hay coincidencia con F2 rescato los Producto de cada map
				Producto pf1 = datosF1.get(s);
				Producto pf2 = datosF2.get(s);
				// lo borro del segundo map
				datosF2.remove(s);

				try {
					// fusiono y añado si no hubo problemas
					Producto fusionado = fusionar(pf1,pf2);
					datosFusionados.add(fusionado);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				
				Producto p = datosF1.get(s);
				datosFusionados.add(p);
			}
		}
		
		// añadir los datos del F2 que queden a datosFusionados
		Collection<Producto> productosF2 = datosF2.values();
		datosFusionados.addAll(productosF2);
		
		
		
		
		return datosFusionados;
	}

	
	
	
	private static Producto fusionar(Producto pf1, Producto pf2) throws PreciosMismathException {

		Producto p = new Producto();
		
		if(pf1.getPrecio()==pf2.getPrecio()) {
			
			p.setCodigo(pf1.getCodigo());
			p.setNombre(pf1.getNombre());
			p.setPrecio(pf1.getPrecio());
			p.setCantidad(pf1.getCantidad()+pf2.getCantidad());
			 
			return p;
		}
		throw new PreciosMismathException("precios distintos para ["+pf1.getCodigo()+"]");
	}

	
	
	
}
