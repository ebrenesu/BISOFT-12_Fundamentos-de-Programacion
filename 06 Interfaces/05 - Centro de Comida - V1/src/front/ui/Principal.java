package front.ui;

import front.controller.GestorRestaurante;

public class Principal {
	public static void main(String[] args) {
        GestorRestaurante gestor = new GestorRestaurante();

        gestor.CrearComida(null, "Pollo Frito", "Receta de Pollo Frito", "$5.00");
        gestor.CrearComida(null, "Hamburguesa Simple", "Receta de Hamburguesa Simple", "$3.50");
        gestor.CrearComida(null, "Hamburguesa con Queso", "Receta de Hamburguesa con Queso", "$4.00");
        gestor.CrearComida(null, "Cola", "Receta de Cola", "$1.00");
        gestor.CrearComida(null, "Papas", "Receta de Papas", "$2.00");

        String[] menu = gestor.ObtenerMenuRestaurante();
        
        System.out.println("Imprimir Menu");
        int i=0;
        String m="";
        for (String item : menu) {
        	m = i++ +")"+ item;
            System.out.println(m);
        }
    }
}
