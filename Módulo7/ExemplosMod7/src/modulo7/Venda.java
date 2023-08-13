package modulo7;

/**
 * @author kellson
 * 
 */
public class Venda {
	
	private float valor;
	
	
	private String marca;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @deprecated
	 * O médoto String produto () está depreciado.
	 */
	public String produto () {
		return "Liquidificador da marca XYZ";
		
	}

	
	

}
