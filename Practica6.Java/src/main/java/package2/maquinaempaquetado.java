/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package package2;

import package2.Maquinas;
import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of maquinaempaquetado.
 * 
 * @author josueMM
 */
public class maquinaempaquetado extends Maquinas{
	public maquinaempaquetado(HashSet<String> descripcion, HashSet<LocalDate> fechaaqdquisicion,  HashSet<Float> costo, int envasesllenados, int militros) {
            String tipoempaque, int cantidadempaques) {
            	super(Descripcion, fechaadquisicion, costo);
            	tipoempaque = Tipoempaque;
            	cantidadempaques = Cantidadempaques;
            }
		
	}
	/**
	 * Description of the property tipoempaque.
	 */
	public int tipoempaque = 0;

	/**
	 * Description of the property cantidadempaques.
	 */
	public int cantidadempaques = 0;

	/**
	 * Description of the property maquinas.
	 */
	public Maquinas maquinas = null;

	// Start of user code (user defined attributes for maquinaempaquetado)

	// End of user code

	/**
	 * The constructor.
	 */
	public maquinaempaquetado() {
		// Start of user code constructor for maquinaempaquetado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoempaquetado.
	 * @param costo 
	 * @param parametro 
	 */
	public void costoempaquetado(float costo, int parametro) {
		// Start of user code for method costoempaquetado
		// End of user code
	}

	// Start of user code (user defined methods for maquinaempaquetado)

	// End of user code
	/**
	 * Returns tipoempaque.
	 * @return tipoempaque 
	 */
	public int getTipoempaque() {
		return this.tipoempaque;
	}

	/**
	 * Sets a value to attribute tipoempaque. 
	 * @param string 
	 */
	public void setTipoempaque(String string) {
		this.tipoempaque = string;
	}

	/**
	 * Returns cantidadempaques.
	 * @return cantidadempaques 
	 */
	public int getCantidadempaques() {
		return this.cantidadempaques;
	}

	/**
	 * Sets a value to attribute cantidadempaques. 
	 * @param newCantidadempaques 
	 */
	public void setCantidadempaques(int newCantidadempaques) {
		this.cantidadempaques = newCantidadempaques;
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
			return "maquinaempaquetado [tipoempaque=" + tipoempaque + ", cantidadempaques=" + cantidadempaques +"]"
	}

}
