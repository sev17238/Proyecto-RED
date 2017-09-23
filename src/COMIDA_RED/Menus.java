
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
	private ArrayList<Comidas> menu;
        private ArrayList<Bebidas> menu2;

	//Constructor 
	public Menus(){
		menu = new ArrayList<Comidas>();
                menu2 = new ArrayList<Bebidas>();
	} 

	//Metodos
	/**
	*Agrega una comida al menu de alimentos
	*@param alimento Comida que se desea ingresar al menu
	*@param precio Precio de la comida ingresada
	*/	
	public void agregarComidas(String alimento, double precio){
		Comidas com = new Comidas();
		com.setComida(alimento, precio);
		menu.add(com);
	}
        /**
	*Agrega una comida al menu de alimentos
	*@param bebida Bebida que se desea ingresar al menu
	*@param precio Precio de la bebida ingresada
	*/	
	public void agregarBebidas(String bebida, double precio){
		Bebidas beb = new Bebidas();
		beb.setBebida(bebida, precio);
		menu2.add(beb);
	}        
	/**
	*Muestra los alimentos que hay dentro del menu
	*/	
	public void mostrarMenus(){
		int i = 0;
		Iterator<Comidas> iterator = menu.iterator();
		while (iterator.hasNext()){
			i= i + 1;
			Comidas prueba = iterator.next();
			System.out.println(i +"."+prueba.getNombreComida()+". Su precio es de: "+ prueba.getPrecio());
		}
	}
	/**
	*Busca un alimento dentro de la lista de menus que se desea ordenar
	*@param opcion Posicion del menu que se desea buscar para obtener sus datos
	*@return Objeto con los datos de la comida que se desea ordear
	*/	
	/*public Comidas buscarMenu(int opcion){
		int i = opcion;
		Comidas prueba = new Comidas();
		Iterator<Comidas> iterator = menu.iterator();
		while (iterator.hasNext()){
			i= i + 1;
			prueba = iterator.next();
			if(i==opcion){
				return prueba;
			}
		}
		return prueba;
	}*/

	/**
	*Busca un alimento dentro de la lista de menus que se desea ordenar
	*@return Objeto con los datos de la comida que se desea ordear
	*/	
	public Comidas buscarComida(String nombre){
		Comidas prueba = new Comidas();
		//Iterator<Comidas> iterator = menu.iterator();		
		for (int i = 0;i<menu.size();i++) {
			prueba = menu.get(i);
			if (nombre.equals(prueba.getNombreComida())) {
				return prueba;
			}else{
				prueba = null;
			}
		}
		return prueba;
	}
        /**
	*Busca una bebida dentro de la lista de menus2 que se desea ordenar
	*@return Objeto con los datos de la bebida que se desea ordear
	*/	
	public Bebidas buscarBebida(String nombre){
		Bebidas prueba = new Bebidas();
		//Iterator<Bebidas> iterator = menu.iterator();		
		for (int i = 0;i<menu2.size();i++) {
			prueba = menu2.get(i);
			if (nombre.equals(prueba.getNombreBebida())) {
				return prueba;
			}else{
				prueba = null;
			}
		}
		return prueba;
	}	
	 
}
