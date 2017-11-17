
package COMIDA_RED;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
//import javax.swing.JOptionPane;
/**
*@author DavidSoto
*@author AlejandroTejada
*@author DiegoSevilla
*@since 15/08/2017
*@version 3.0 
*/
public class BaseDatosRED {
    public Registro registroRED;
    public Menus menuRED;
    public EntityManagerFactory emf;  // para especificar la Persistent Unit y conexion a la base de datos
    public EntityManager em; // manejador de las entidades en la base de datos
    /**
     * Constructor de la clase.
     */
    public BaseDatosRED(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("COMIDA_REDPU");
        em = emf.createEntityManager();
        registroRED = new Registro(); //registro de tanques vacio
        menuRED = new Menus();
    }
    /**
     * Metodo que concluye los procesos realizados de presistencia de los atributos de esta clase dedicados
     * a eso.
     */
    public void cerrarDB(){
        em.close();
        emf.close();
    }
    /**
     * Metodo que recupera a los usuarios y ordenes guardadas en la base de datos y los almacena en las 
     * listas del objeto registroRED.
     */
    public void recuperarUsersOrdenes(){
        Query q = em.createQuery("select d from Ordenes d");
        List<Ordenes> orders = q.getResultList();
        
        Query q1 = em.createQuery("select nd from Usuario nd");
        List<Usuario> users = q1.getResultList();
        
        registroRED = new Registro(users,orders);
    }
    /**
     * Metodo que recupera a los productos guardados en la base de datos y los almacena en la
     * lista del objeto menuRED.
     */
    public void recuperarProductos(){
        Query q = em.createQuery("select dd from Producto dd");
        List<Producto> productos = q.getResultList();
        
        menuRED = new Menus(productos);
    }
    /**
     * Metodo que ingresa un nuevo usuario a la base de datos y al registro.
     * @param nombre del usuario
     * @param carnet del usuario
     * @param correo del usuario
     * @param contra del usuario
     */
    public void nuevoUsuario(String nombre,String carnet,String correo,String contra){
        Usuario user = new Usuario();
        user.setUsuario(nombre, carnet, correo, contra);
        registroRED.newUsuario(user);
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
    /**
     * Metodo que ingresa un nuevo producto a la base de datos y al registro.
     * @param descripcion del producto
     * @param nombre del producto
     * @param price del producto
     */
    public void nuevoProducto(String descripcion, String nombre, double price){
        Producto prod = new Producto();
        prod.setProducto(descripcion, nombre, price);
        menuRED.newProducto(prod);
        em.getTransaction().begin();
        em.persist(prod);
        em.getTransaction().commit();
    }
    /**
     * Metodo que ingresa una nueva orden a la base de datos y al registro.
     * @param user al que pertence la orden
     * @param producto que ordeno el usuario
     * @param horas a la que se tiene que entregar la orden
     * @param minutos a los que se tiene que entregar la orden
     */
    public void nuevaOrden(Usuario user, Producto producto, String horas, String minutos){
        Ordenes ord = new Ordenes();
        ord.setOrden(user, producto, horas, minutos);
        registroRED.newOrden(ord);
        em.getTransaction().begin();
        em.persist(ord);
        em.getTransaction().commit();
    }
    /**
     * Metodo que ingresa una nueva orden de dos productos a la base de datos y al registro.
     * @param user al que pertence la orden
     * @param producto el que ordeno el usuario
     * @param producto2 el segundo que ordeno el usuario
     * @param horas a la que se tiene que entregar la orden
     * @param minutos a los que se tiene que entregar la orden
     */
    public void nuevaOrden2(Usuario user, Producto producto,Producto producto2, String horas, String minutos){
        Ordenes ord = new Ordenes();
        ord.setOrden2(user, producto, producto2, horas, minutos);
        registroRED.newOrden(ord);
        em.getTransaction().begin();
        em.persist(ord);
        em.getTransaction().commit();
    }
    /**
     * Metodo que ingresa una nueva orden de tres productos a la base de datos y al registro.
     * @param user al que pertence la orden
     * @param producto el que ordeno el usuario
     * @param producto2 el segundo que ordeno el usuario
     * @param producto3 el tercero que ordeno el producto
     * @param horas a la que se tiene que entregar la orden
     * @param minutos a los que se tiene que entregar la orden
     */
    public void nuevaOrden3(Usuario user, Producto producto,Producto producto2,Producto producto3, String horas, String minutos){
        Ordenes ord = new Ordenes();
        ord.setOrden3(user, producto, producto2, producto3, horas, minutos);
        registroRED.newOrden(ord);
        em.getTransaction().begin();
        em.persist(ord);
        em.getTransaction().commit();
    }
    /**
     * Metodo que returna el atributo de tipo Registro de esta clase
     * @return el atributo
     */
    public Registro getRegistroRED(){
        return registroRED;
    }
    /**
     * Metodo que retorna el atributo de tripo Menus de esta clase.
     * @return 
     */
    public Menus getMenuRED(){
        return menuRED;
    }
    /**
     * Elimina la orden a la que pertenece la ID ingresada como parametro
     * @param ID de la orden que se quiere borrar.
     */
    public void eliminarOrdenIdDB(String ID){
        Query q = em.createQuery("select d from Ordenes d where d.identificacion = :id");
            q.setParameter("id", ID);
            Ordenes ord = (Ordenes) q.getSingleResult();
            if(ord != null){
                registroRED.borrarOrdenId(ID);
                em.getTransaction().begin();// grabar el tanque en la base de datos
                em.remove(ord);
                em.getTransaction().commit();
            } 
    }
    /**
     * Elimina la orden en cola en cuestion.
     * @param numero de la orden
     */
    public void eliminarOrdenDB(int numero){        
        String ID = registroRED.getIDborrarOrden(numero);
        Query q = em.createQuery("select d from Ordenes d where d.identificacion = :id");
        q.setParameter("id", ID);
        Ordenes ord = (Ordenes) q.getSingleResult();
        if(ord != null){
            registroRED.borrarOrden(numero);
            em.getTransaction().begin();// grabar el tanque en la base de datos
            em.remove(ord);
            em.getTransaction().commit();
        }        
    }
    
}
