
package COMIDA_RED;
/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 1.0 
*/
public class Administrador{
	//atributos
	private String nombre;
	private String contrasena;

	//Constructor
	public Administrador(){
		nombre = "administradorRED";
		contrasena = "1234567";
	}
	//metodos
	/**
	*Devuelve el nombre del administrador
	*@return Nombre del administrador
	*/	
	public String getNombre(){
		return nombre;
	}
	/**
	*Devuelve la contraseña del administrador
	*@return Contrasena del administrador 
	*/	
	public String getContrasena(){
		return contrasena;
	}
}
