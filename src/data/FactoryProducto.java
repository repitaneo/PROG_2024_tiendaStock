package data;

public class FactoryProducto {

	public static Producto createProducto(	String codigo, 
											String nombre, 
											String cantidad, 
											String precio) {
		
		Producto p = new Producto();
		
		p.setCodigo(codigo);
		p.setNombre(nombre);
		p.setCantidad(Integer.parseInt(cantidad));
		p.setPrecio(Float.parseFloat(precio));
		
		return p;
	}

}
