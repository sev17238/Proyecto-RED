
package COMIDA_RED;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 1.0 
*/
public class Ordenes{
	//atributos
	private Usuario usuario;
	private Comidas comida;
        private Bebidas bebida;

	public Ordenes(){
		usuario = new Usuario();
		comida = new Comidas();
                bebida = new Bebidas();
	}
	//metodos
	/**
	*Ingresa los datos de una nueva orden
	*@param user Objeto con los datos de un usuario
	*@param menu Objeto con los datos de una comida del menu
        *@param bebida Objeto con los datos de una bebida del menu
	*/	
	public void setOrden(Usuario user, Comidas menu, Bebidas bebida){
		usuario = user;
		comida = menu;
                this.bebida = bebida;
	}
	/**
	*Devuelve el objeto con los datos de un usuario
	*@return Objeto con los datos de un usuario
	*/	
	public Usuario getUsuario(){
		return usuario;
	}
	/**
	*Devuelve el objeto con los datos de una comida del menu
	*@return Objeto con los datos de una comida del menu
	*/	
	public Comidas getComida(){
		return comida;
	}
        /**
	*Devuelve el objeto con los datos de una comida del menu
	*@return Objeto con los datos de una comida del menu
	*/	
	public Bebidas getBebida(){
		return bebida;
	}
}