
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
import java.util.List;

public class Menus{
	//atributos
	private ArrayList<Producto> menu;

	//Constructor 
	public Menus(){
            menu = new ArrayList<Producto>();
	} 
        /**
         * Constructo secunadario de la clase usado en la clase BaseDatosRED para recuperar los productos 
         * guardados en la base de datos.
         * @param productos 
         */
        public Menus(List<Producto> productos){
            menu = new ArrayList<Producto>();
            Producto prod = new Producto();
            for(int i=0;i<productos.size();i++){
                prod = productos.get(i);
                menu.add(prod);
            }
        }
        
	//Metodos
        /**
	*Agrega una comida al menu de alimentos
        *@param descripcion la descripcion del producto (Comida, Bebida, Postre)
	*@param nombre nombre del producto
	*@param precio Precio de la bebida ingresada
	*/	
	public void agregarProducto(String descripcion,String nombre, double precio){
		Producto prod = new Producto();
		prod.setProducto(descripcion, nombre, precio);
		menu.add(prod);
	}        
	/**
	*Muestra los alimentos que hay dentro del menu
	*/	
	public void mostrarMenus(){
		int i = 0;
		Iterator<Producto> iterator = menu.iterator();
		while (iterator.hasNext()){
			i= i + 1;
			Producto prueba = iterator.next();
			System.out.println(i +"."+prueba.getNombreProducto()+". Su precio es de: "+ prueba.getPrecio());
		}
	}
	/**
	*Busca un alimento dentro de la lista de menus que se desea ordenar
	*@return Objeto con los datos de la comida que se desea ordear
        *@param nombre es el nombre de la comida
	*/	
	public Producto buscarProducto(String nombre){
		Producto prueba = new Producto();
		//Iterator<Comidas> iterator = menu.iterator();		
		for (int i = 0;i<menu.size();i++) {
			prueba = menu.get(i);
			if (nombre.equals(prueba.getNombreProducto())) {
				return prueba;
			}else{
				prueba = null;
			}
		}
		return prueba;
	}
        /**
         * Este metodo retorna una lista con las bebidas en esta clase
         * @return un vector STring con la lista de bebidas
         */
        public ArrayList<String> retornarListaBebidas(){
            ArrayList<String> a= new ArrayList<>();
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);                
                    if(b.getDescripcionProducto().equals("Bebida")){
                    a.add(b.getNombreProducto());
                }
            }
            return a;
        }
        /**
         * Este metodo retorna una lista con las comidas en esta clase
         * @return un vector STring con la lista de comidas
         */
        public ArrayList<String> retornarListaComidas(){
           ArrayList<String> a= new ArrayList<>();
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);
                if(b.getDescripcionProducto().equals("Comida")){
                    a.add(b.getNombreProducto());
                }
            }
            return a;
            }
        /**
         * Este metodo retorna una lista con las bebidas en esta clase
         * @return un vector STring con la lista de bebidas
         */
        public ArrayList<String> retornarListaPostres(){
            ArrayList<String> a= new ArrayList<>();
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);                
                if(b.getDescripcionProducto().equals("Postre")){
                    a.add(b.getNombreProducto());
                }
            }
            return a;
        }
        //Metodo agregado para interaccion con la base de datos
        public void newProducto(Producto prod){
            menu.add(prod);
        }
}
