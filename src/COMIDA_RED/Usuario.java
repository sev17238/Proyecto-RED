
package COMIDA_RED;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 1.0 
*/
public class Usuario{
	//atributos
	private String nombre;
	private String carnet;
	private String correo;
	private String contrasena;

	//Constructor
	public Usuario(){
		nombre = "";
		carnet = "";
		correo = "";
		contrasena = "";

	}
	//metodos
	/**
	*Ingresa los datos de un nuevo usuario
	*@param name Nombre del usuario
	*@param carn Carnet del usuario
	*@param corr Correo del usuario
	*@param contra Contrasena del usuario
	*/	
	public void setUsuario(String name, String carn, String corr, String contra){
		nombre = name;
		carnet = carn;
		correo = corr;
		contrasena = contra;
	}
	/**
	*Devuelve el nombre del usuario
	*@return Nombre del usuario
	*/	
	public String getNombre(){
		return nombre;
	}
	/**
	*Devuelve la contrasena del usuario
	*@return Contrasena del usuario
	*/	
	public String getContrasena(){
		return contrasena;
	}
	/**
	*Devuelve el carnet del usuario
	*@return Carnet del usuario
	*/	
	public String getCarnet(){
		return carnet;
	}
	/**
	*Devuelve el correo del usuario
	*@return Correo del usuario
	*/	
	public String getCorreo(){
		return correo;
	}
}

