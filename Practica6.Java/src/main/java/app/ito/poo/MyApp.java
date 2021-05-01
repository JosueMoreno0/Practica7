package app.ito.poo;

import package2.Maquinas;
import package2.maquinaempaquetado;
import package2.maquinalavado;
import package2.maquinallenadoYenvasado;

import java.time.LocalDate;

public class MyApp {
	
	
	
	static void run () {
		Maquinas m=new Maquinas();
		
		m.Descripcion.add("Maquina del Empaquetado");
		m.fechaadquisicion.add(LocalDate.of(2021, 4, 19));
		m.costo.add(15000F);
		
		m.Descripcion.add("Maquina del lavado");
		m.fechaadquisicion.add(LocalDate.of(2021, 4, 2));
		m.costo.add(18000F);
		
		m.Descripcion.add("Maquina de Llenado y Envasado");
		m.fechaadquisicion.add(LocalDate.of(2021, 4, 19));
		m.costo.add(20000F);
		
		System.out.println(m);
		
		
	maquinalavado ml= new maquinalavado();
	ml.setCapacidadlitro(1800.21F);
	ml.setTiempociclo(20);
	System.out.println("\n"+ml);
	System.out.println("El costo de lavado por botella es= $" +ml.costolavado(18000, 9));
	
	
	maquinallenadoYenvasado mll= new maquinallenadoYenvasado();
	mll.setEnvasesllenados(15);
	mll.setMililitros(15);
	System.out.println("\n"+mll);
	System.out.println("El costo de llenado y envasado= $" +mll.costodellenado(20000, 30));
	
	
	maquinaempaquetado me=new maquinaempaquetado();
	me.setTipoempaque("Carton");
	me.setCantidadempaques(3);
	System.out.println("\n"+me);
	System.out.println("El costo del empaquetado por botella es de= $" +me.costoempaquetado(15000, 8000));
	}
	

	
	public static void main (String []args) {
		run();
	}	
}
