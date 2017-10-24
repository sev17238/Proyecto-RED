
package COMIDA_RED;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 18/10/2017
*@version 1.0 
*/
public class Producto {
	//atributos
	private String descripcion;
        private String nombre;
	private double precio;

	public Producto(){
		descripcion = "";
                nombre = "";
		precio = 0.0;
	}
	//metodos
	/**
	*Ingresa los datos de un nuevo producto
	*@param descripcion descripcion del producto que se ingresara(Bebida, COmida, Postre)
        *@param nombre Nombre del producto que se ingresara
	*@param price Precio del producto ingresado
	*/	
	public void setProducto(String descripcion, String nombre, double price){
		this.descripcion = descripcion;
                this.nombre=nombre;
		precio = price;
	}
	/**
	*Devuelve la descripcion del producto
	*@return Descripcion del producto
	*/	
	public String getDescripcionProducto(){
		return descripcion;
	}
        /**
	*Devuelve el nombre del producto
	*@return Descripcion del producto
	*/	
	public String getNombreProducto(){
		return nombre;
	}
	/**
	*Devuelve el precio del producto
	*@return Precio del producto
	*/	
	public double getPrecio(){
		return precio;
	}    
}
