/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMIDA_RED;

/**
 *
 * @author SDiego
 */
public class Bebidas{
    private String bebida;
    private double precio;

	public Bebidas(){
		bebida = "";
		precio = 0.0;
	}
	//metodos
	/**
	*Ingresa los datos de un nuevo alimento
	*@param bebida Nombre de la bebida que se ingresara
	*@param price Precio de la bebida ingresada
	*/	
	public void setBebida(String bebida, double price){
		this.bebida = bebida;
		precio = price;
	}
	/**
	*Devuelve el nombre de al bebida
	*@return Nombre del alimento
	*/	
	public String getNombreBebida(){
		return bebida;
	}
	/**
	*Devuelve el precio de la bebida
	*@return Precio del alimento
	*/	
	public double getPrecio(){
		return precio;
	}    
}
