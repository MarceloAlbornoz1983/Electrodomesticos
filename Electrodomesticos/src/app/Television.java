package app;

/**
 * @author Marcelo Albornoz
 * @version 1.0
 */

public class Television extends Electrodomestico {

	private int resolucion;
	private boolean sintonizadorTDT;

	private final static int RESOLUCION_DEFECTO = 20;
	private final static boolean SINTONIZADOR_TDT_DEFECTO = false;

	/**
	 * Contructor por defecto
	 */
	public Television() {
		this(PRECIO_BASE_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO, RESOLUCION_DEFECTO,
				SINTONIZADOR_TDT_DEFECTO);
	}

	/**
	 * Contructor con precio y peso. El resto por defecto
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, int peso) {
		this(precioBase, CONSUMO_ENERGETICO_DEFECTO, peso, COLOR_DEFECTO, RESOLUCION_DEFECTO, SINTONIZADOR_TDT_DEFECTO);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con todos los atributos.
	 * 
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(int precioBase, char consumoEnergético, int peso, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, consumoEnergético, peso, color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Calcula el precio final del Televisor Contiene un acumulador, el cual aumenta
	 * segun su resolucion y sintonizador
	 * 
	 * @see Electrodomestico#precioFinal()
	 * @return acumuladorPrecioTelevision
	 */
	public int precioFinal() {
		int acumuladorPrecioTelevision = super.precioFinal();
		;

		if (resolucion > 40) {
			acumuladorPrecioTelevision += (int) ((precioBase * 30) / 100);
		}
		if (sintonizadorTDT) {
			acumuladorPrecioTelevision += 50;
		}

		return acumuladorPrecioTelevision;

	}

}
