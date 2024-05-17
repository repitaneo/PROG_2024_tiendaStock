package data;

public class Producto {

	private String codigo;
	private String nombre;
	private int cantidad;
	private float precio;
	
	
	
	
	
	public Producto(String codigo, String nombre, int cantidad, float precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public Producto() {
		
	}
	
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "{[" + codigo + "] " + nombre + " <" + cantidad + "> (" + precio+ ")}";
	}
	
	
	
	
	
}
