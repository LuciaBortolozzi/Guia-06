public class Promedio<T extends Number> {
	
	private T[] nros;

	Promedio(T[] o) {
		nros = o;
	}

	double promedio() {
		double sum = 0.0;
		for (int i = 0; i < nros.length; i++)
			sum += nros[i].doubleValue();
		return sum / nros.length;
	}

	public static void main(String args[]) {

		Integer NInt[] = { 1, 2, 3, 4, 5 };

		Promedio<Integer> int_obj = new Promedio<Integer>(NInt);
		double v = int_obj.promedio();
		System.out.println("Promedio Objeto Entero: " + v);

		Double NDou[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Promedio<Double> dob_obj = new Promedio<Double>(NDou);
		v = dob_obj.promedio();
		System.out.println("Promedio Objeto Double: " + v);
		System.out.printf("Promedio de %d al %d es %-1.2f \n\n", NInt[0], NInt[4], int_obj.promedio());
		System.out.printf("Promedio de %1.3f al %1.3f es %-1.3f \n\n", NDou[0], NDou[4], dob_obj.promedio());
	}
}
