package conversorDeDivisas;

import javax.swing.JOptionPane;

import cotizacionesDeDivisas.CotizacionDeOtrasDivisas;

public class ConvertirPesosArgAOtraDivisa extends CotizacionDeOtrasDivisas{
	

	public void PasarPesosArgEuro(double cantidadPesosArg) {
		double cotizacionEuro = cantidadPesosArg / getEuro();
		cotizacionEuro = (double) Math.round(cotizacionEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes € " + cotizacionEuro + " Euros al tipo de cambio en Argentina.");
	}
	
	public void PasarPesosArgLibEst(double cantidadPesosArg) {
		double cotizacionLibEst = cantidadPesosArg / getLibrasEsterlinas();
		cotizacionLibEst = (double) Math.round(cotizacionLibEst *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes £ " + cotizacionLibEst + " Libras Esterlinas al tipo de cambio en Argentina.");
	}
	
	public void PasarPesosArgYenJap(double cantidadPesosArg) {
		double cotizacionYenJap = cantidadPesosArg / getYenJapones();
		cotizacionYenJap = (double) Math.round(cotizacionYenJap *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes ¥ " + cotizacionYenJap + " Yenes Japoneses al tipo de cambio en Argentina.");
	}
	
	public void PasarPesosArgWSC(double cantidadPesosArg) {
		double cotizacionWSC = cantidadPesosArg / getWonSurcoreano();
		cotizacionWSC = (double) Math.round(cotizacionWSC *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes ₩ " + cotizacionWSC + " Wones Surcoreanos al tipo de cambio en Argentina.");
	}
	
	public void PasarPesosArgYuanChino(double cantidadPesosArg) {
		double cotizacionYuanChino = cantidadPesosArg / getWonSurcoreano();
		cotizacionYuanChino = (double) Math.round(cotizacionYuanChino *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes ¥ " + cotizacionYuanChino + " Yuanes Chinos al tipo de cambio en Argentina.");
	}
	
	public void PasarPesosArgReal(double cantidadPesosArg) {
		double cotizacionReal = cantidadPesosArg / getReal();
		cotizacionReal = (double) Math.round(cotizacionReal *100d)/100;
		JOptionPane.showMessageDialog(null, "Con $: " + cantidadPesosArg + " Pesos obtienes R$ " + cotizacionReal + " Reales al tipo de cambio en Argentina.");
	}
	
	
}
