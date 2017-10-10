
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
	private final ArrayList<Comidas> menu;
        private final ArrayList<Bebidas> menu2;

	//Constructor 
	public Menus(){
		menu = new ArrayList<>();
                menu2 = new ArrayList<>();
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
	*@return Objeto con los datos de la comida que se desea ordear
        *@param nombre es el nombre de la comida
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
        *@param nombre es el string con el nombre
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
        
        /**
         * Este metodo retorna una lista con las bebidas en esta clase
         * @return un vector STring con la lista de bebidas
         */
        public String[] retornarListaBebidas(){
            String[] a= new String[menu2.size()];
            Bebidas b= new Bebidas();
            for (int i = 0; i < menu2.size(); i++) {
                b=menu2.get(i);
                a[i]=b.getNombreBebida();
            }
            return a;
        }
        /**
         * Este metodo retorna una lista con las comidas en esta clase
         * @return un vector STring con la lista de comidas
         */
        public String[] retornarListaComidas(){
            String[] a= new String[menu.size()];
            Comidas b= new Comidas();
            int m=0;
            for (int i = 0; i < menu.size(); i++) {
                b=menu.get(i);
                a[i]=b.getNombreComida();
            }
            return a;
        }

	 
}
