package conversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemp {
	
	ConvertirEscalasDeTemperaturas temperatura = new ConvertirEscalasDeTemperaturas();
	
	public void ConvertirTemperatura(double TempInput) {
		String escalasDeTemperatura =(JOptionPane.showInputDialog(null,
				"Elije la escala de temperatura a convertir", "Escalas de Temperaturas:", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { 
						"Grados Celsius a Grados Fahrenheit", "Grados Fahrenheit a Grados Celsius", "Grados Celsius a Kelvin", "Kelvin a Grados Celsius", "Grados Fahrenheit a Kelvin", "Kelvin a Grados Fahrenheit" }, "Seleccion")).toString();
		
		switch (escalasDeTemperatura) {
		case "Grados Celsius a Grados Fahrenheit":
		temperatura.PasarDeGradosCelsiusAGradosFahrenheit(TempInput);
		break;
		case "Grados Fahrenheit a Grados Celsius":
			temperatura.PasarDeGradosFahrenheitAGradosCelsius(TempInput);
			break;
		case "Grados Celsius a Kelvin":
			temperatura.PasarDeGradosCelsiusAKelvin(TempInput);
			break;
		case "Kelvin a Grados Celsius":
			temperatura.PasarDeKelvinaGradosCelsius(TempInput);
			break;
		case "Grados Fahrenheit a Kelvin":
			temperatura.PasarDeGradosFahrenheitAKelvin(TempInput);
			break;
		case "Kelvin a Grados Fahrenheit":
			temperatura.PasarDeKelvinAGradosFahrenheit(TempInput);
			break;
			
		
		}
	}

}
