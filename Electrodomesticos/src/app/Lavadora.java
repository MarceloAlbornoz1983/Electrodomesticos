package app;

/**
 * @author Marcelo Albornoz
 * @version 1.0
 */

public class Lavadora extends Electrodomestico{
	
	private int carga;
	
	private final static int CARGA_DEFECTO = 5;

	/**
     * Contructor por defecto
     */
	public Lavadora() {
		this(PRECIO_BASE_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO,COLOR_DEFECTO, CARGA_DEFECTO);
	}

	/**
     * Contructor con precio y peso. El resto por defecto
     * @param precioBase
     * @param peso
     */
	public Lavadora(int precioBase, int peso) {
		this(precioBase, CONSUMO_ENERGETICO_DEFECTO, peso, COLOR_DEFECTO,CARGA_DEFECTO);
		// TODO Auto-generated constructor stub
	}

	/**
     * Constructor con todos los atributos.
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
	public Lavadora(int precioBase, char consumoEnergético, int peso, String color, int carga) {
		super(precioBase, consumoEnergético, peso, color);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * Calcula el precio final de la Lavadora Contiene un acumulador, el cual
	 * aumenta segun su capacidad de carga
	 * 
	 * @see Electrodomestico#precioFinal()
	 * @return acumuludarPrecioLavadora
	 */
	public int precioFinal() {
		
		int acumuludarPrecioLavadora = super.precioFinal();
		
		if(carga > 30) {
			acumuludarPrecioLavadora += 50;
		}
		
		return acumuludarPrecioLavadora;
	}
}
