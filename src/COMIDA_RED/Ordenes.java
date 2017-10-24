
package COMIDA_RED;

import java.util.ArrayList;

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
        private ArrayList<Producto> pedido;
	private Producto producto;
        private String hora;
        private String minuto;

	public Ordenes(){
		usuario = new Usuario();
                pedido = new ArrayList<Producto>();
		producto = new Producto();
                hora = "00";
                minuto = "00";
	}
	//metodos
	/**
	*Ingresa los datos de una nueva orden
	*@param user Objeto con los datos de un usuario
        *@param producto la comida, bebida o postre que tiene la orden.
        *@param horas Texto que guardara la hora de entrega del producto
        *@param minutos Texto que guardara los minutos de la hora en que se entregara el producto
	*/	
	public void setOrden(Usuario user, Producto producto, String horas, String minutos){
		usuario = user;		
                this.producto = producto;
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
	public Producto getProducto(){
		return producto;
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