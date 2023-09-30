package logicOperators;

public class Exercise {
	
	public static void main(String[] args) {
		////Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iPhone 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obtén un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente? Cuesta $20,000 pesos
		
		int precioiPhone = 20000;
		System.out.println("Calculando cuenta de 3 iPhone...");
		double total = precioiPhone * 3;
		System.out.println("El costo total sin descuento es de $" + total + " pesos.");
		
		System.out.println("Evaluando si se aplicarán promociones...");
		if (total > 25000) {
			total = aplicarDescuento(total);
			System.out.println("El costo final con 10% de descuento aplicado es de $" + total + " pesos");
		}else {
			System.out.println("No aplica descuento :(");
		}
		
		System.out.println("Calculando mensualidades a MSI con TDC...");
		System.out.println("El costo de cada mensualidad seria de $" + pagoAMeses(total) + " pesos.");
		
	}
	
	public static double aplicarDescuento(double totalCompra) {
		double descuento = 0.10f;
		double totalConDescuento = totalCompra * (1 - descuento);
		return totalConDescuento;
	}
	
	public static double pagoAMeses(double total) {
		return total / 12;
	}
	
	
}
