/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package package2;

import package2.Maquinas;
import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of maquinalavado.
 * 
 * @author josueMM
 */

public class maquinalavado extends Maquinas {
	public maquinalavado(HashSet<String> descripcion, HashSet<LocalDate> fechaadquisicion, HashSet<Float> costo, float capacidadlitro, float tiempociclo );
	float capacidadlitro, int tiempociclo){
		super(Descripcion, fechaadquisicion, costo);
			capacidadlitro = Capacidadlitros;
			tiempociclo = Tiempociclo;
		}
	}
	/**
	 * Description of the property capacidadlitro.
	 */
	public float capacidadlitro = 0F;

	/**
	 * Description of the property tiempociclo.
	 */
	public float tiempociclo = 0F;

	/**
	 * Description of the property maquinas.
	 */
	public Maquinas maquinas = null;

	// Start of user code (user defined attributes for maquinalavado)

	// End of user code

	/**
	 * The constructor.
	 */
	public maquinalavado() {
		// Start of user code constructor for maquinalavado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costolavado.
	 * @param costo 
	 * @param botella 
	 */
	public void costolavado(float costo, int botella) {
		// Start of user code for method costolavado
		float a, Costototal;
		a = costo*.005F;
		botella= botella/3;
		Costototal=a*botellas;
		return Costototal
		// End of user code
	}

	// Start of user code (user defined methods for maquinalavado)

	// End of user code
	/**
	 * Returns capacidadlitro.
	 * @return capacidadlitro 
	 */
	public float getCapacidadlitro() {
		return this.capacidadlitro;
	}

	/**
	 * Sets a value to attribute capacidadlitro. 
	 * @param newCapacidadlitro 
	 */
	public void setCapacidadlitro(float newCapacidadlitro) {
		this.capacidadlitro = newCapacidadlitro;
	}

	/**
	 * Returns tiempociclo.
	 * @return tiempociclo 
	 */
	public float getTiempociclo() {
		return this.tiempociclo;
	}

	/**
	 * Sets a value to attribute tiempociclo. 
	 * @param newTiempociclo 
	 */
	public void setTiempociclo(float newTiempociclo) {
		this.tiempociclo = newTiempociclo;
	}

	/**
	 * Returns maquinas.
	 * @return maquinas 
	 */
	public Maquinas getMaquinas() {
		return this.maquinas;
	}

	/**
	 * Sets a value to attribute maquinas. 
	 * @param newMaquinas 
	 */
	public void setMaquinas(Maquinas newMaquinas) {
		if (this.maquinas != null) {
			this.maquinas.set(null);
		}
		this.maquinas.set(this);
		
		public String toString() {
			return "maquinalvado [capacidadlitro=" + capacidadlitro + ", tiempociclo=" + tiempociclo +"]"
	}

}
