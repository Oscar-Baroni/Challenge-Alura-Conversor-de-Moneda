package conversorDeDivisas;

import javax.swing.JOptionPane;
import cotizacionesDeDivisas.CotizacionDelDolar;

public class ConvertirPesosArgADolares extends CotizacionDelDolar{
	

	public void PasarPesosArgADolarOficial(double cantidadPesosArg) {
		double cotizacionDolarOficial = cantidadPesosArg / getDolarOficial() ;
		cotizacionDolarOficial = (double) Math.round(cotizacionDolarOficial *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $ " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarOficial + " Dolares al tipo de cambio Oficial en Argentina.");
	}
	
	public void PasarPesosArgADolarBlue(double cantidadPesosArg) {
		double cotizacionDolarBlue = cantidadPesosArg / getDolarBlue();
		cotizacionDolarBlue = (double) Math.round(cotizacionDolarBlue *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarBlue + " Dolares al tipo de cambio Blue en Argentina.");
	}
	
	public void PasarPesosArgADolarTarjeta(double cantidadPesosArg) {
		double cotizacionDolarTarjeta = cantidadPesosArg / getDolarTarjeta();
		cotizacionDolarTarjeta = (double) Math.round(cotizacionDolarTarjeta *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarTarjeta + " Dolares al tipo de cambio Tarjeta en Argentina.");
	}
	
	public void PasarPesosArgADolarTurista(double cantidadPesosArg) {
		double cotizacionDolarTurista = cantidadPesosArg / getDolarTurista();
		cotizacionDolarTurista = (double) Math.round(cotizacionDolarTurista *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarTurista + " Dolares al tipo de cambio Turista en Argentina.");
	}
	
	public void PasarPesosArgADolarMEP(double cantidadPesosArg) {
		double cotizacionDolarMEP = cantidadPesosArg / getDolarMEP();
		cotizacionDolarMEP = (double) Math.round(cotizacionDolarMEP *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarMEP + " Dolares al tipo de cambio MEP en Argentina.");
	}
	
	public void PasarPesosArgADolarCCL(double cantidadPesosArg) {
		double cotizacionDolarCCL = cantidadPesosArg / getDolarCCL();
		cotizacionDolarCCL = (double) Math.round(cotizacionDolarCCL *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes U$S " + cotizacionDolarCCL + " Dolares al tipo de cambio CCL en Argentina.");
	}
	
	public void PasarPesosArgADolarMayorista(double cantidadPesosArg) {
		double cotizacionDolarMayorista = cantidadPesosArg / getDolarMayorista();
		cotizacionDolarMayorista = (double) Math.round(cotizacionDolarMayorista *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " obtienes U$S " + cotizacionDolarMayorista + " al tipo de cambio Mayorista en Argentina.");
	}
}
	
	