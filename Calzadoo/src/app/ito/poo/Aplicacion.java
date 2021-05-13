package app.ito.poo;
import clases.ito.poo.Calzado;
import clases.ito.poo.Calzados;

public class Aplicacion {
	static Calzados c;
	static void run() {
		c=new Calzados();
		c.addCalzado(new Calzado(55, "Cuero", "7", 200, "Blanco"));
		c.addCalzado(new Calzado(6, "Cuero", "5", 700, "Gris"));
		c.addCalzado(new Calzado(100, "Cuero", "6", 500, "Cafe"));
		
		System.out.println(c.isFree());
		
		for(int i=0;i<c.getSize();i++)
			System.out.println(c.getCalzado(i));
	}
}
