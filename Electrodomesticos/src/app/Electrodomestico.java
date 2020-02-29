package app;

/**
 * @author Marcelo Albornoz
 * @version 1.0
 */
public class Electrodomestico {

	// Atributos de la Clase
	protected int precioBase;
	protected char consumoEnergetico;
	protected int peso;
	protected String color;

	// Constantes de la Clase
	protected final static int PRECIO_BASE_DEFECTO = 100000;
	protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
	protected final static int PESO_DEFECTO = 5;
	protected final static String COLOR_DEFECTO = "blanco";
	
	/**
     * Contructor por defecto
     */
	public Electrodomestico() {
		this(PRECIO_BASE_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO);
	}

	/**
     * Contructor con precio y peso. El resto por defecto
     * @param precioBase
     * @param peso
     */
	public Electrodomestico(int precioBase, int peso) {
		this(precioBase, CONSUMO_ENERGETICO_DEFECTO, peso, COLOR_DEFECTO);
	}
	
	 /**
     * Constructor con todos los atributos.
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
	public Electrodomestico(int precioBase, char consumoEnergetico, int peso, String color) {
		super();
		this.precioBase = precioBase;
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		comprobarColor(color);
	}

	//Getters y Setters de cada atributo de la clase
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setconsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Metodos de la clase
	
	/**
     * Comprueba cual es consumo energetico del electrodomestico
     * En caso de no coincidir con las alternativas, tomará como el valor por defecto ('A')
     * Solo mayusculas, de lo contrario lo tomara con el valor por defectos ('A')
     * @param consumoEnergetico
     */
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		
		if( consumoEnergetico == 'A' || consumoEnergetico == 'B' || 
			consumoEnergetico == 'C' || consumoEnergetico == 'D' || 
			consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
			
		}else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
	}
	
	/**
     * Comprueba cual es color del electrodomestico
     * En caso de no coincidir con las alternativas, tomará como el valor por defecto ("blanco")
     * No discrimina por mayusculas o minusculas
     * @param color
     */
	public void comprobarColor(String color) {
				
		if(color.equalsIgnoreCase("blanco")) {
			this.color = color;
		}else if(color.equalsIgnoreCase("negro")){
			this.color = color;
		}else if(color.equalsIgnoreCase("rojo")){
			this.color = color;
		}else if(color.equalsIgnoreCase("azul")){
			this.color = color;
		}else if(color.equalsIgnoreCase("gris")){
			this.color = color;
		}else if(color.equalsIgnoreCase(null)){
			this.color = COLOR_DEFECTO;
		}
		
			
	}
	
	/**
	 * Calcula el precio final del electrodomestico Contiene un acumulador, el cual
	 * aumenta con el consumo energetico y el peso
	 *
	 * @return precio base + acumulador (precio final)
	 */
	public int precioFinal() {
		//Variable que acumulara las alzas de precios
		int acumuladorPrecioElectrodomestico = 0;
		
		//Calculos de precio segun consumo energetico
		if(consumoEnergetico == 'A') {
			acumuladorPrecioElectrodomestico += 100;
			
		}else if(consumoEnergetico == 'B') {
			acumuladorPrecioElectrodomestico += 80;
			
		}else if(consumoEnergetico == 'C') {
			acumuladorPrecioElectrodomestico += 60;
			
		}else if(consumoEnergetico == 'D') {
			acumuladorPrecioElectrodomestico += 50;
			
		}else if(consumoEnergetico == 'E') {
			acumuladorPrecioElectrodomestico += 30;
			
		}else if(consumoEnergetico == 'F') {
			acumuladorPrecioElectrodomestico += 10;
			
		}
		
		//Calculos de precio segun peso
		if (peso > 0 && peso < 20) {
			acumuladorPrecioElectrodomestico += 10;

		} else if (peso >= 20 && peso < 50) {
			acumuladorPrecioElectrodomestico += 50;

		} else if (peso >= 50 && peso < 80) {
			acumuladorPrecioElectrodomestico += 80;

		} else if (peso > 80) {
			acumuladorPrecioElectrodomestico += 100;

		}
		
		return precioBase + acumuladorPrecioElectrodomestico;

	}

}
