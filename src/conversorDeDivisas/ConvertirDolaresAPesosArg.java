package conversorDeDivisas;

import javax.swing.JOptionPane;

import cotizacionesDeDivisas.CotizacionDelDolar;

public class ConvertirDolaresAPesosArg extends CotizacionDelDolar{

	public void PasarDolarOficialAPesosArg(double cantidadDeDolarOficial) {
		double dolarOficialAPesosArg =  getDolarOficial() * cantidadDeDolarOficial ;
		dolarOficialAPesosArg = (double) Math.round(dolarOficialAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarOficial + " Dolares al tipo de cambio Oficial obtienes $ " + dolarOficialAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarBlueAPesosArg(double cantidadDeDolarBlue) {
		double dolarBlueAPesosArg =  getDolarBlue() * cantidadDeDolarBlue ;
		dolarBlueAPesosArg = (double) Math.round(dolarBlueAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarBlue + " Dolares al tipo de cambio Blue obtienes $ " + dolarBlueAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarTarjetaAPesosArg(double cantidadDeDolarTarjeta) {
		double dolarTarjetaAPesosArg =  getDolarTarjeta() * cantidadDeDolarTarjeta ;
		dolarTarjetaAPesosArg = (double) Math.round(dolarTarjetaAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarTarjeta + " Dolares al tipo de cambio Tarjeta obtienes $ " + dolarTarjetaAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarTuristaAPesosArg(double cantidadDeDolarTurista) {
		double dolarTuristaAPesosArg =  getDolarTurista() * cantidadDeDolarTurista ;
		dolarTuristaAPesosArg = (double) Math.round(dolarTuristaAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarTurista + " Dolares al tipo de cambio Turista obtienes $ " + dolarTuristaAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarMEPAPesosArg(double cantidadDeDolarMEP) {
		double dolarMEPaPesosArg =  getDolarMEP() * cantidadDeDolarMEP ;
		dolarMEPaPesosArg = (double) Math.round(dolarMEPaPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarMEP + " Dolares al tipo de cambio MEP obtienes $ " + dolarMEPaPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarCLLAPesosArg(double cantidadDeDolarCLL) {
		double dolarCLLaPesosArg =  getDolarCCL() * cantidadDeDolarCLL ;
		dolarCLLaPesosArg = (double) Math.round(dolarCLLaPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarCLL + " Dolares al tipo de cambio CLL obtienes $ " + dolarCLLaPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarDolarMayoristaAPesosArg(double cantidadDeDolarMayorista) {
		double dolarMayoristaAPesosArg =  getDolarMayorista() * cantidadDeDolarMayorista ;
		dolarMayoristaAPesosArg = (double) Math.round(dolarMayoristaAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con U$S " + cantidadDeDolarMayorista + " Dolares al tipo de cambio Mayorista obtienes $ " + dolarMayoristaAPesosArg + " Pesos Argentinos.");
	}
}
