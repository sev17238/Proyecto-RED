
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
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        //Atributos Propios
        private String nombre;
	private String carnet;
	private String correo;
	private String contrasena;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
        //Metodos Propios
        public Usuario(){
		nombre = "";
		carnet = "";
		correo = "";
		contrasena = "";

	}
	
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

    //---------------------------------------------------------
        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "COMIDA_RED.Usuario[ id=" + id + " ]";
    }
    
}
