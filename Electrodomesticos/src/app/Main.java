package app;

/**
 * Clase Main Instancia las clases y ejecuta el programa
 * 
 * @author Marcelo Albornoz
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		int totalElectrodomesticos = 0;
		int totalTelevisores = 0;
		int totalLavadoras = 0;

//	Television samsung = new Television(precioBase, consumoEnergetico, peso, color, resolucion, sintonizadorTDT);
//			
//	Lavadora mademsa = new Lavadora(precioBase, consumoEnergetico, peso, color, carga);

		electrodomesticos[0] = new Television(250000, 'B', 34, "gris", 20, false);
		electrodomesticos[1] = new Electrodomestico(120000, 'D', 24, "AZUL");
		electrodomesticos[2] = new Electrodomestico(183000, 'E', 94, "rojo");
		electrodomesticos[3] = new Lavadora();
		electrodomesticos[4] = new Electrodomestico(95000, 14);
		electrodomesticos[5] = new Lavadora(290000, 'C', 34, "negro", 60);
		electrodomesticos[6] = new Lavadora(345990, 'D', 102, "gris", 80);
		electrodomesticos[7] = new Electrodomestico(87000, 'B', 27, "negro");
		electrodomesticos[8] = new Television(420000, 'C', 34, "negro", 70, true);
		electrodomesticos[9] = new Electrodomestico(125000, 'E', 66, "negro");

		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				totalElectrodomesticos += electrodomesticos[i].precioFinal();
			}

			if (electrodomesticos[i] instanceof Lavadora) {
				totalLavadoras += electrodomesticos[i].precioFinal();
			}

			if (electrodomesticos[i] instanceof Television) {
				totalTelevisores += electrodomesticos[i].precioFinal();
			}
		}
	
		System.out.println("El precio total de todos los electrodomesticos es: " + totalElectrodomesticos);
		System.out.println("El precio total de las Lavadoras es: " + totalLavadoras);
		System.out.println("El precio total de los Televisores es: " + totalTelevisores);

	}
}
