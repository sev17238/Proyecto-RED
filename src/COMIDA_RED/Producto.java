/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
	private double precio;

	public Producto(){
		descripcion = "";
		precio = 0.0;
	}
	//metodos
	/**
	*Ingresa los datos de un nuevo producto
	*@param producto Nombre del producto que se ingresara
	*@param price Precio del producto ingresado 
	*/	
	public void setComida(String producto, double price){
		descripcion = producto;
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
	*Devuelve el precio del producto
	*@return Precio del producto
	*/	
	public double getPrecio(){
		return precio;
	}    
}
