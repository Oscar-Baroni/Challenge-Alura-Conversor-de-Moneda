package conversorDeDivisas;

import javax.swing.JOptionPane;

import cotizacionesDeDivisas.CotizacionDeOtrasDivisas;

public class ConvertirOtrasDivisasAPesosArg extends CotizacionDeOtrasDivisas {

	public void PasarEurosAPesosArg(double cantidadDeEuros) {
		double EuroAPesosArg =  getEuro() * cantidadDeEuros ;
		EuroAPesosArg = (double) Math.round(EuroAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con € " + cantidadDeEuros + " Euros obtienes $ " + EuroAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarLibEstAPesosArg(double cantidadDeLibEst) {
		double LibEstAPesosArg =  getLibrasEsterlinas() * cantidadDeLibEst ;
		LibEstAPesosArg = (double) Math.round(LibEstAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con £ " + cantidadDeLibEst + " Libras Esterlinas obtienes $ " + LibEstAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarYenJapAPesosArg(double cantidadDeYenJap) {
		double YenJapAPesosArg =  getYenJapones() * cantidadDeYenJap ;
		YenJapAPesosArg = (double) Math.round(YenJapAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con ¥ " + cantidadDeYenJap + " Yenes Japoneses obtienes $ " + YenJapAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarWSCaPesosArg(double cantidadDeWSC) {
		double WSCaPesosArg =  getWonSurcoreano() * cantidadDeWSC ;
		WSCaPesosArg = (double) Math.round(WSCaPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con ₩ " + cantidadDeWSC + " Wones Surcoreanos obtienes $ " + WSCaPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarYuanChinoAPesosArg(double cantidadDeYuanChino) {
		double YuanChinoAPesosArg =  getYuanChino() * cantidadDeYuanChino ;
		YuanChinoAPesosArg = (double) Math.round(YuanChinoAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con ¥ " + cantidadDeYuanChino + " Yuanes Chinos obtienes $ " + YuanChinoAPesosArg + " Pesos Argentinos.");
	}
	
	public void PasarRealAPesosArg(double cantidadDeReal) {
		double RealAPesosArg =  getReal() * cantidadDeReal ;
		RealAPesosArg = (double) Math.round(RealAPesosArg *100d)/100;
		JOptionPane.showMessageDialog(null, "Con R$ " + cantidadDeReal + " Reales obtienes $ " + RealAPesosArg + " Pesos Argentinos.");
	}
}
