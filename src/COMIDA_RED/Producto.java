
package COMIDA_RED;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 3.0 
*/
@Entity
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        //Atributos propios
        private String descripcion;
        private String nombre;
        private double precio;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        //Metodos Propios
        public Producto(){
		descripcion = "";
                nombre = "";
		precio = 0.0;
	}
        
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
    
    //--------------------------------------------------------
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "COMIDA_RED.Producto[ id=" + id + " ]";
    }
    
}
