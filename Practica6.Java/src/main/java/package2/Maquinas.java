/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package package2;

import java.time.LocalDate;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Maquinas.
 * 
 * @author josueMM
 */
public class Maquinas {
	public Maquinas(String descripcion, int fechaadquisicion, float costo) {
		super();
		Descripcion = descripcion;
		this.fechaadquisicion = fechaadquisicion;
		this.costo = costo;
		
	}

	/**
	 * Description of the property Descripcion .
	 */
	public String Descripcion = "";

	/**
	 * Description of the property fechaadquisicion.
	 */
	public int fechaadquisicion = 0;

	/**
	 * Description of the property costo.
	 */
	public float costo = 0F;

	// Start of user code (user defined attributes for Maquinas)

	// End of user code

	/**
	 * The constructor.
	 */
	public Maquinas() {
		// Start of user code constructor for Maquinas)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Maquinas)

	// End of user code
	/**
	 * Returns Descripcion .
	 * @return Descripcion  
	 */
	public String getDescripcion() {
		return this.Descripcion;
	}

	/**
	 * Sets a value to attribute Descripcion . 
	 * @param newDescripcion  
	 */
	public void setDescripcion(String newDescripcion) {
		this.Descripcion = newDescripcion;
	}

	/**
	 * Returns fechaadquisicion.
	 * @return fechaadquisicion 
	 */
	public int  getFechaadquisicion() {
		return this.fechaadquisicion;
	}

	/**
	 * Sets a value to attribute fechaadquisicion. 
	 * @param newFechaadquisicion 
	 */
	public void setFechaadquisicion(int newFechaadquisicion) {
		this.fechaadquisicion = newFechaadquisicion;
	}

	/**
	 * Returns costo.
	 * @return costo 
	 */
	public float getCosto() {
		return this.costo;
	}

	/**
	 * Sets a value to attribute costo. 
	 * @param newCosto 
	 */
	public void setCosto(float newCosto) {
		this.costo = newCosto;
	}

	public void set(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Maquinas [Descripcion=" + Descripcion + ", fechaadquisicion=" + fechaadquisicion + ", costo=" + costo
				+ "]";
	}

}
