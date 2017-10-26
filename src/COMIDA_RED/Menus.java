
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

public class Menus{
	//atributos
	private final ArrayList<Producto> menu;

	//Constructor 
	public Menus(){
		menu = new ArrayList<Producto>();
	} 

	//Metodos
        /**
	*Agrega una comida al menu de alimentos
        *@param descripcion la descripcion del producto (Comida, Bebida, Postre)
	*@param nombre nombre del producto
	*@param precio Precio de la bebida ingresada
	*/	
	public void agregarProductos(String descripcion,String nombre, double precio){
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
        public String[] retornarListaBebidas(){
            String[] a= new String[menu.size()];
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);                
                if(b.getDescripcionProducto().equals("Bebida")){
                    a[i]=b.getNombreProducto();
                }
            }
            return a;
        }
        /**
         * Este metodo retorna una lista con las comidas en esta clase
         * @return un vector STring con la lista de comidas
         */
        public String[] retornarListaComidas(){
            String[] a= new String[menu.size()];
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);
                if(b.getDescripcionProducto().equals("Comida")){
                    a[i]=b.getNombreProducto();
                }
            }
            return a;
            }
        /**
         * Este metodo retorna una lista con las bebidas en esta clase
         * @return un vector STring con la lista de bebidas
         */
        public String[] retornarListaPostres(){
            String[] a= new String[menu.size()];
            Producto b= new Producto();
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);                
                if(b.getDescripcionProducto().equals("Postre")){
                    a[i]=b.getNombreProducto();
                }
            }
            return a;
        }
}
