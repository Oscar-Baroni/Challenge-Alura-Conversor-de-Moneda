package conversorDeTemperatura;

public class EscalasDeTemperatura {

	private static double celsius = 0.0; 
	private static double fahrenheit = celsius + 32;
	private static double kelvin = celsius + 273.15;

	public static double getCelsius() {
		return celsius;
	}
	public static double getFahrenheit() {
		return fahrenheit;
	}
	public static double getKelvin() {
		return kelvin;
	}
}

