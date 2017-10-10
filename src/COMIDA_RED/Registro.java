
package COMIDA_RED;
/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 1.0 
*/
import java.util.ArrayList;
import java.util.Iterator;

public class Registro{
	//atributos
	private final ArrayList<Usuario> users;
	private final Administrador admin;
	private final ArrayList<Ordenes> ordenes;

	//constructor
	public Registro(){
		users = new ArrayList<>();
		admin = new Administrador(); 
		ordenes = new ArrayList<>();
	}

	//metodos
        /**
         * Metodo para obtener la lista de ordenes del registro.
         * @return la lista de ordenes que se han hecho.
         */
        public ArrayList<Ordenes> getOrdenes(){
            return ordenes;
        }        
	/**
	*Agrega un usuario al registro
	*@param nombre Nombre del usuario nuevo
	*@param carnet Carnet del usuario nuevo
	*@param correo Correo del usuario nuevo
	*@param contrasena Contrasena del usuario nuevo
	*/	
	public void agregarUsuario(String nombre, String carnet, String correo, String contrasena){
		Usuario nuevo = new Usuario();		
		nuevo.setUsuario(nombre,carnet,correo,contrasena);
		users.add(nuevo);
	}
	/**
	*Busca un usuario dentro de los usuario registrados y devuelve un numero que ayudara mostrarle al usuario si esta registrado o no
	*@param correo Correo del usuario registrado
	*@param contrasena Contrasena del usuario registrado 
	*@return Un 1 si el usuario esta registrado y un 0 si el usuario no esta registrado
	*/	
	public int buscarUsuario(String correo, String contrasena){
		Iterator<Usuario> iterator = users.iterator();
		int verificacion = 0;
		while (iterator.hasNext()){
			Usuario prueba = iterator.next();
			String corr = prueba.getCorreo();
			String contra = prueba.getContrasena();
			if ((corr.equals(correo)) && (contra.equals(contrasena))){
				verificacion = 1;
				return verificacion;			
			}
		}
		return verificacion;	
	}
	/**
	*Busca a un usuario dentro del registro para guardarlo en una variable para ser devuelta y se usada como la cuenta a la que se cobrara la orden
	*@param correo Correo del usuario registrado
	*@param contrasena Contrasena del usuario registrado
	*@return El dato tipo usuario al que se le cobrara la orden
	*/	
	public Usuario buscarUsuario2(String correo, String contrasena){ 
		Iterator <Usuario> iterator = users.iterator();
		Usuario prueba = new Usuario();
		while (iterator.hasNext()){
			prueba = iterator.next();
			String corr = prueba.getCorreo();
			String contra = prueba.getContrasena();
			if ((corr.equals(correo)) && (contra.equals(contrasena))){
				return prueba;
			}else{
				System.out.print("");
			}
		}
		return prueba;
	}
	/**
	*Comprueba si los datos ingresados de la cuenta administrador son los correctos para ingresar como administrador
	*@param nombre Nombre del administrador registrado
	*@param contrasena Contrasena del administrador registrado
	*@return Devuelve un 1 si la cuenta administrador es el correcta y 0 si la cuenta es incorrecta 
	*/	
	public int buscarAdministrador(String nombre, String contrasena){
		int verificacion = 0;
		String name = admin.getNombre();
		String contra = admin.getContrasena();
		if((nombre.equals(name)) && (contrasena.equals(contra))){
			verificacion = 1;
			return verificacion;
		}else{
			System.out.print("");
		}
		return verificacion;
	}
	/**
	*Muestra las ordenes que se deben despachar por el administrador
	*/	
	public void mostrarOrdenes(){
		System.out.println("");
		System.out.println("Las ordenes son: ");
		int i = -1;
		Iterator <Ordenes> iterator = ordenes.iterator();
		while(iterator.hasNext()){
			i = i + 1;
			Ordenes prueba = iterator.next();
			Usuario prueba1 = prueba.getUsuario();
			Comidas prueba2 = prueba.getComida();
			System.out.println(i+".Usuario: "+prueba1.getNombre()+", Carnet: "+prueba1.getCarnet()+", pidio: "+prueba2.getNombreComida()+", con precio de: "+prueba2.getPrecio());
		}
	}
	/**
	*Muestra las ordenes hechas por un usuario especifico
	*@param contrasena La contrasena del usuario que desea ver sus ordenes
	*/	
	public void mostrarOrdenesPropias(String contrasena){
		Iterator<Ordenes> iterator = ordenes.iterator();
		int i = -1;
		while(iterator.hasNext()){
			i = i + 1;
			Ordenes prueba = iterator.next();
			Usuario prueba1 = prueba.getUsuario();
			String prueba3 = prueba1.getContrasena();
			Comidas prueba2 = prueba.getComida();
			if(contrasena.equals(prueba3)){
				System.out.println(i+".Menu: "+prueba2.getNombreComida()+", debe pagar: "+prueba2.getPrecio()+ " por este menu");
			}
		}	
	}
	/**
	*Crea una nueva orden en el registro de los ordenes por despachar
	*@param cuenta El usuario que recibira la cuenta de lo gastado en la orden
	*@param pedido La comida que el usuario desea elegir
        *@param pedido2 La bebida que el usuario desea elegir
        *@param hora La hora a la que se entregara el pedido
        *@param minuto Los minutos de la hora a la que se entregara el pedido
	*/	
	public void meterOrden(Usuario cuenta, Comidas pedido, Bebidas pedido2, String hora, String minuto){
		Ordenes nueva = new Ordenes();
		nueva.setOrden(cuenta,pedido,pedido2,hora,minuto);
		ordenes.add(nueva);
	}
	/**
	*Borra la orden que ya es despachada y se desea ya no tener en el registro de ordenes a despachar
	*@param numero Numero de orden que se desea eliminar 
	*/	
	public void borrarOrden(int numero){
		ordenes.remove(numero);
	} 
        /**
         * Metodo que retorna una lista con los carnets de los usuarios en el registro.
         * @return 
         */
        public String[] retornarListaUsuariosCarnet(){
            String[] list = new String[users.size()];
            Usuario user = new Usuario();
            for (int i = 0; i < users.size(); i++) {
                user = users.get(i);
                String carnet = user.getCarnet(); 
                list[i]= carnet;                
            }
            return list;
        }
        
}