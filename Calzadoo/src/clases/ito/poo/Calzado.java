package clases.ito.poo;

public class Calzado implements Comparable<Calzado>{
	public int clave = 0;
	public String Material = "";
	public String troquelado = "";
	public int cantProducida = 0;	
	public String colores = "";

	public int compareTo(Calzado o) {
		return 0;
	}
	
	public int CompareTo(Calzado o) {
		int compare=0;
		if(this.clave<o.getClave())
			compare =-1;
		else if(this.clave>o.getClave())
			compare=1;
		return compare;
	}
		
	public Calzado(int clave, String material, String troquelado, int cantDia, String colores) {
		super();
		this.clave = clave;
		this.Material = material;
		this.troquelado = troquelado;
		this.cantProducida = cantDia;
		this.colores = colores;
	}

	public Calzado() {
		// Start of user code constructor for Calzado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoxLote.
	 * @param costoxUnida 
	 * @return 
	 */
	public float costoxLote(float costoxUnida) {
		// Start of user code for method costoxLote
		float costoxLote = 0F;
		return costoxLote;
		// End of user code
	}

	// Start of user code (user defined methods for Calzado)

	// End of user code
	/**
	 * Returns clave.
	 * @return clave 
	 */
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.Material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.Material = newMaterial;
	}

	/**
	 * Returns troquelado.
	 * @return troquelado 
	 */
	public String getTroquel() {
		return this.troquelado;
	}

	/**
	 * Sets a value to attribute troquelado. 
	 * @param newTroquelado 
	 */
	public void setTroquel(String newTroquel) {
		this.troquelado = newTroquel;
	}

	/**
	 * Returns cantProducida.
	 * @return cantProducida. 
	 */
	public int getCantProducida() {
		return this.cantProducida;
	}

	/**
	 * Sets a value to attribute cantProducida. 
	 * @param newCantProducida 
	 */
	public void setCantProducida(int newCantProducida) {
		this.cantProducida = newCantProducida;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public String getColores() {
		return this.colores;
	}

	/**
	 * Sets a value to attribute colores. 
	 * @param newColores 
	 */
	public void setColores(String newColores) {
		this.colores = newColores;
	}

	@Override
	public String toString() {
		return "Calzado [clave=" + clave + ", material=" + Material + ", troquel=" + troquelado + ", canDia="
				+ cantProducida + ", colores=" + colores + "]";
	}

}
