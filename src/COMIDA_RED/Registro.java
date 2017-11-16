
package COMIDA_RED;
/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 2.0 
*/
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro{
	//atributos
	private ArrayList<Usuario> users;
	private Administrador admin;
	private ArrayList<Ordenes> ordenes;

	//constructor
	public Registro(){
		users = new ArrayList<>();
		admin = new Administrador(); 
		ordenes = new ArrayList<>();
	}
        /**
         * Constructor secundario de la clase usado en BaseDatosRED para recuperar los usuarios
         * y ordenes guardados en la base de datos.
         * @param usuarios lista de usuarios
         * @param listaordenes
         */
        public Registro(List<Usuario> usuarios,List<Ordenes> listaordenes){
            Usuario user = new Usuario();
            for(int i=0;i<usuarios.size();i++){
                user = usuarios.get(i);
                users.add(user);
            }
            Ordenes ord = new Ordenes();
            for(int i=0;i<listaordenes.size();i++){
                ord = listaordenes.get(i);
                ordenes.add(ord);
            }
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
			Producto prueba2 = new Producto();
			System.out.println(i+".Usuario: "+prueba1.getNombre()+", Carnet: "+prueba1.getCarnet()+", pidio: ");
                        for(int e=0;e<prueba.getPedido().size();e++){
                            prueba2 = prueba.getPedido().get(e);
                            System.out.println(" - "+prueba2.getNombreProducto()+", con precio de: "+prueba2.getPrecio());
                        }
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
			Producto prueba2 = new Producto();
			if(contrasena.equals(prueba3)){
                            
                            for(int k=0;k<prueba.getPedido().size();k++){ 
                            prueba2 = prueba.getPedido().get(k);
                            System.out.println(i+".Menu: "+prueba2.getNombreProducto()+", debe pagar: "+prueba2.getPrecio()+ " por este menu");
                            }
                        }
		}	
	}
	/**
	*Crea una nueva orden en el registro de los ordenes por despachar
	*@param cuenta El usuario que recibira la cuenta de lo gastado en la orden
	*@param pedido El alimento que el usuario desea elegir
        *@param hora La hora a la que se entregara el pedido
        *@param minuto Los minutos de la hora a la que se entregara el pedido
	*/	
	public void meterOrden(Usuario cuenta, Producto pedido, String hora, String minuto){
		Ordenes nueva = new Ordenes();
		nueva.setOrden(cuenta,pedido,hora,minuto);
		ordenes.add(nueva);
	}
        /**
	*Crea una nueva orden con 2 alimentos en el registro de los ordenes por despachar
	*@param cuenta El usuario que recibira la cuenta de lo gastado en la orden
	*@param pedido El alimento que el usuario desea elegir
        *@param pedido2 El segundo alimento que el usuario desea elegir
        *@param hora La hora a la que se entregara el pedido
        *@param minuto Los minutos de la hora a la que se entregara el pedido
	*/	
	public void meterOrden2(Usuario cuenta, Producto pedido,Producto pedido2, String hora, String minuto){
		Ordenes nueva = new Ordenes();
		nueva.setOrden2(cuenta,pedido,pedido2,hora,minuto);
		ordenes.add(nueva);
	}
        /**
	*Crea una nueva orden con 3 alimentos en el registro de los ordenes por despachar
	*@param cuenta El usuario que recibira la cuenta de lo gastado en la orden
	*@param pedido El alimento que el usuario desea elegir
        *@param pedido2 El segundo alimento que el usuario desea elegir
        *@param pedido3 El tercer alimento que el usuario desea elegir
        *@param hora La hora a la que se entregara el pedido
        *@param minuto Los minutos de la hora a la que se entregara el pedido
	*/	
	public void meterOrden3(Usuario cuenta, Producto pedido,Producto pedido2,Producto pedido3, String hora, String minuto){
		Ordenes nueva = new Ordenes();
		nueva.setOrden3(cuenta,pedido,pedido2,pedido3,hora,minuto);
		ordenes.add(nueva);
	}
	/**
	*Borra la orden que ya es despachada y se desea ya no tener en el registro de ordenes a despachar
	*@param numero Numero de orden que se desea eliminar 
	*/	
	public void borrarOrden(int numero){
            try {
                ordenes.remove(numero);
                JOptionPane.showMessageDialog(null, "Orden Entregada");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ya no hay ordenes para entregar.");
            }
	} 
        /**
	* Este metodo se usara en conjunto con borrarOrden() para retornar la id de la orden que se borrara y 
        * asi poder usar dicha id para eliminar la orden en la base de datos.
	*@param numero Numero de orden de la que se desea la ID. 
        * @return  
	*/	
	public String getIDborrarOrden(int numero){
            try {
                String ident = ordenes.get(numero).getIdOrden();
                return ident;
            }catch (Exception e) {
                //  JOptionPane.showMessageDialog(null, "Ya no hay ordenes para entregar.");
                return null;
            }
	} 
        
        /**
         * Este método borra una orden si le mandan el ID de la orden
         * @param idOrden un string con el id d ela orden
         */
        public void borrarOrdenId(String idOrden){
            try {
                Ordenes orden= new Ordenes();
            for (int i = 0; i < ordenes.size(); i++) {
                orden=ordenes.get(i);
                if (orden.getIdOrden().equals(idOrden)) {
                    ordenes.remove(orden);
                }
            }
            JOptionPane.showMessageDialog(null, "Orden Borrada");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "No se pudo borrar la orden, intentelo de nuevo.");
            }
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
        /**
         * Busca a los 3 usuarios que han hecho mas prestamos en la biblioteca
         * @return Texto con los 3 usuario que mas han prestado en la biblioteca
         */
        public String MejoresUsuario(){
            Iterator<Ordenes> iterator = ordenes.iterator();
            String texto = "";
            Ordenes[] mejores = new Ordenes[ordenes.size()];
            while(iterator.hasNext()){
                Ordenes nuevo = iterator.next();
                for(int i=0; i<ordenes.size(); i++){
                    mejores[i]=ordenes.get(i);
                }
            }
            Ordenes nuevo1;
            for(int i=0; i<mejores.length;i++){
                for(int j =i+1; j<mejores.length;j++){
                    int mejores1 = Integer.parseInt(mejores[i].getHora());
                    int mejores2 = Integer.parseInt(mejores[j].getHora());
                    if(mejores1<mejores2){
                        nuevo1 = mejores[i];
                        mejores[i]=mejores[j];
                        mejores[j]=nuevo1;
                    }
                }
            }
            texto = "Lista ordenada";
            return texto;
        }      
        
        //Metodos agregados para la interaccion con la base de datos.
        public void nuevoUsuario(Usuario user){
            users.add(user);
        }
        
        public void nuevaOrden(Ordenes ord){
            ordenes.add(ord);
        }
}