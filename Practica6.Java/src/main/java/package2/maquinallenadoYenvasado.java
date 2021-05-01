/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package package2;

import package2.Maquinas;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of maquinallenadoYenvasado.
 * 
 * @author josueMM
 */

public class maquinallenadoYenvasado extends Maquinas {
	public maquinallenadoYenvasado(HashSet<String> descripcion, HasSet<LocalDate> Fechaadquisicion, HashSet<Float> costo, int envasesllenados, int militros) {
		super (descripcion, fechaadquisicion, costo);
		Envasesllenados = envasesllenados;
		Mililitros = mililitros;
		
	}
	/**
	 * Description of the property envasesllenados.
	 */
	public float envasesllenados = 0F;

	/**
	 * Description of the property mililitros.
	 */
	public int mililitros = 0;

	/**
	 * Description of the property maquinas.
	 */
	public Maquinas maquinas = null;

	// Start of user code (user defined attributes for maquinallenadoYenvasado)

	// End of user code

	/**
	 * The constructor.
	 */
	public maquinallenadoYenvasado() {
		// Start of user code constructor for maquinallenadoYenvasado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costodellenado.
	 * @param costo 
	 * @param botellasmin 
	 */
	public void costodellenado(float costo, float botellasmin) {
		// Start of user code for method costodellenado
		float costo,botellas=botellasmin/envasesllenados;
		costo=(costo*0.0025F)*botellas;
	
		
		return costo;
		// End of user code
	}

	// Start of user code (user defined methods for maquinallenadoYenvasado)

	// End of user code
	/**
	 * Returns envasesllenados.
	 * @return envasesllenados 
	 */
	public float getEnvasesllenados() {
		return this.envasesllenados;
	}

	/**
	 * Sets a value to attribute envasesllenados. 
	 * @param newEnvasesllenados 
	 */
	public void setEnvasesllenados(float newEnvasesllenados) {
		this.envasesllenados = newEnvasesllenados;
	}

	/**
	 * Returns mililitros.
	 * @return mililitros 
	 */
	public int getMililitros() {
		return this.mililitros;
	}

	/**
	 * Sets a value to attribute mililitros. 
	 * @param newMililitros 
	 */
	public void setMililitros(int newMililitros) {
		this.mililitros = newMililitros;
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
		public String toString(){
			return "maquinallenadoYensado [envasesllenados=" + envasesllenados +"]"
			}
	}

}
