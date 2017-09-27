
package COMIDA_RED;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 3.0 
*/
public class Ordenes{
	//atributos
	private Usuario usuario;
	private Comidas comida;
        private Bebidas bebida;
        private String hora;
        private String minuto;

	public Ordenes(){
		usuario = new Usuario();
		comida = new Comidas();
                bebida = new Bebidas();
                hora = "00";
                minuto = "00";
	}
	//metodos
	/**
	*Ingresa los datos de una nueva orden
	*@param user Objeto con los datos de un usuario
	*@param menu Objeto con los datos de una comida del menu
        *@param bebida Objeto con los datos de una bebida del menu
        *@param horas Texto que guardara la hora de entrega del producto
        *@param minutos Texto que guardara los minutos de la hora en que se entregara el producto
	*/	
	public void setOrden(Usuario user, Comidas menu, Bebidas bebida, String horas, String minutos){
		usuario = user;
		comida = menu;
                this.bebida = bebida;
                minuto = minutos;
                hora = horas;
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
        /**
	*Devuelve el String con la hora a la que se entregara el pedido
	*@return String con la hora a la que se entregara el producto
	*/	
	public String getHora(){
	        return hora;
        }
        /**
	*Devuelve el String con los minutos de la hora a la que se entregara el pedido
	*@return String con los minutos de la hora a la que se entregara el producto
	*/	
	public String getMinutos(){
	        return minuto;
        }
}