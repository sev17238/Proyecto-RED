
package COMIDA_RED;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 1.0 
*/
public class Comidas{
	//atributos
	private String comida;
	private double precio;

	public Comidas(){
		comida = "";
		precio = 0.0;
	}
	//metodos
	/**
	*Ingresa los datos de un nuevo alimento
	*@param alimento Nombre del alimento que se ingresara
	*@param price Precio del alimento ingresado 
	*/	
	public void setComida(String alimento, double price){
		comida = alimento;
		precio = price;
	}
	/**
	*Devuelve el nombre del alimento
	*@return Nombre del alimento
	*/	
	public String getNombreComida(){
		return comida;
	}
	/**
	*Devuelve el precio del alimento
	*@return Precio del alimento
	*/	
	public double getPrecio(){
		return precio;
	}
}