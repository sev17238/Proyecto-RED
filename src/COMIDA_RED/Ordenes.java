
package COMIDA_RED;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 3.0 
*/
@Entity
public class Ordenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        //Atributos propios
        private Usuario usuario;
        private List<Producto> pedido;
        private String hora;
        private String minuto;
        private String identificacion;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        //Metodos Propios 
        public Ordenes(){
            usuario = new Usuario();
            pedido = new ArrayList<Producto>();
            hora = "00";
            minuto = "00";
            identificacion="";
        }
    
        /**
	*Ingresa los datos de una nueva orden de un solo producto.
	*@param user Objeto con los datos de un usuario
        *@param producto la comida, bebida o postre que tiene la orden.
        *@param horas Texto que guardara la hora de entrega del producto
        *@param minutos Texto que guardara los minutos de la hora en que se entregara el producto
	*/	
	public void setOrden(Usuario user, Producto producto, String horas, String minutos){
		usuario = user;		
                pedido.add(producto);
                //this.producto=producto;
                minuto = minutos;
                hora = horas;
                setIDOrden();
	}
        /**
	*Ingresa los datos de una nueva orden de dos productos.
	*@param user Objeto con los datos de un usuario
        *@param producto la comida, bebida o postre que tiene la orden.
        *@param producto2 la segunda comida, bebida o postre que tiene la orden
        *@param horas Texto que guardara la hora de entrega del producto
        *@param minutos Texto que guardara los minutos de la hora en que se entregara el producto
	*/
        public void setOrden2(Usuario user, Producto producto,Producto producto2, String horas, String minutos){
            usuario = user;		
            pedido.add(producto);
            pedido.add(producto2);
            minuto = minutos;
            hora = horas;
            setIDOrden();
        }
        /**
	*Ingresa los datos de una nueva orden de tres productos.
	*@param user Objeto con los datos de un usuario
        *@param producto la comida, bebida o postre que tiene la orden.
        *@param producto2 la segunda comida, bebida o postre que tiene la orden.
        *@param producto3 la tercera comida, bebida o postre que tiene la orden.
        *@param horas Texto que guardara la hora de entrega del producto
        *@param minutos Texto que guardara los minutos de la hora en que se entregara el producto
	*/
        public void setOrden3(Usuario user, Producto producto,Producto producto2,Producto producto3, String horas, String minutos){
            usuario = user;		
            pedido.add(producto);
            pedido.add(producto2);
            pedido.add(producto3);
            minuto = minutos;
            hora = horas;
            setIDOrden();
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
	public List<Producto> getPedido(){
            return pedido;
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
        /**
         * Este método retorna el id de la orden 
         * @return un String con cada orden
         */
        public String getIdOrden(){
            return this.identificacion;
        }
        
    /**
     *Este void da una ID random a cada orden
     */
    public void setIDOrden(){
            int maxID=128000;
            int minID=1;
            int idRandom = (int) (Math.random() *(maxID-minID)+maxID);
            this.identificacion=String.valueOf(idRandom);
        }
    
    //----------------------------------------------------------------------  
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordenes)) {
            return false;
        }
        Ordenes other = (Ordenes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "COMIDA_RED.Ordenes[ id=" + id + " ]";
    }
    
}
