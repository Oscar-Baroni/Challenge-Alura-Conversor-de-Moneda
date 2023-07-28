package conversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConvertirEscalasDeTemperaturas extends EscalasDeTemperatura{
	
	public void PasarDeGradosCelsiusAGradosFahrenheit(double valorGrados) {
		double deCelsiusAFahrenheit = (valorGrados*1.8) + getFahrenheit();
		deCelsiusAFahrenheit = (double) Math.round(deCelsiusAFahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Celsius (Centigrados) equivalen a " + deCelsiusAFahrenheit + " grados en la escala Fahrenheit");
	}
	
	public void PasarDeGradosFahrenheitAGradosCelsius(double valorGrados) {
		double deFahrenheitACelsius = (valorGrados - getFahrenheit())*0.55555555555556;
		deFahrenheitACelsius = (double) Math.round(deFahrenheitACelsius *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Fahrenheit equivalen a " + deFahrenheitACelsius + " grados en la escala Celsius (Centigrados)");
	}
	
	public void PasarDeGradosCelsiusAKelvin(double valorGrados) {
		double deCelsiusAKelvin = valorGrados + getKelvin();
		deCelsiusAKelvin = (double) Math.round(deCelsiusAKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Celsius (Centigrados) equivalen a " + deCelsiusAKelvin + " grados en la escala Kelvin");
	}
	
	public void PasarDeKelvinaGradosCelsius(double valorGrados) {
		double deKelvinACelsius = valorGrados - getKelvin();
		deKelvinACelsius = (double) Math.round(deKelvinACelsius *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Kelvin equivalen a " + deKelvinACelsius + " grados en la escala Celsius (Centigrados)");
	}
	
	public void PasarDeGradosFahrenheitAKelvin(double valorGrados) {
		double deFahrenheitAKelvin = (((valorGrados - getFahrenheit())*0.55555555555556) + getKelvin());
		deFahrenheitAKelvin = (double) Math.round(deFahrenheitAKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Fahrenheit equivalen a " + deFahrenheitAKelvin + " grados en la escala Kelvin");
	}
	
	public void PasarDeKelvinAGradosFahrenheit(double valorGrados) {
		double deKelvinAFahrenheit = ((((valorGrados - getKelvin())*1.8) + getFahrenheit()));
		deKelvinAFahrenheit = (double) Math.round(deKelvinAFahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, valorGrados + " grados Kelvin equivalen a " + deKelvinAFahrenheit + " grados en la escala Fahrenheit");
	}

}
