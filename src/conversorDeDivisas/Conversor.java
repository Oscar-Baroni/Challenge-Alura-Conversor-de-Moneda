package conversorDeDivisas;

import javax.swing.JOptionPane;

public class Conversor {

	ConvertirPesosArgAOtraDivisa pesosADivisa = new ConvertirPesosArgAOtraDivisa();
	ConvertirOtrasDivisasAPesosArg divisaAPesos = new ConvertirOtrasDivisasAPesosArg();
	ConvertirPesosArgADolares pesosADolar = new ConvertirPesosArgADolares();
	ConvertirDolaresAPesosArg dolarAPesos = new ConvertirDolaresAPesosArg();

	public void ConvertirPesosArgAOtraMoneda(double Minput) {
		String opciones = (JOptionPane.showInputDialog(null,
				"Elije la divisa que deseas cotizar con tus Pesos Argentinos", "Pesos Argentinos a:", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { 
						"Dólar", "Euros", "Libras Esterlinas", 
						"Yen Japones", "Won Surcoreano", 
						"Yuan Chino", "Real" }, "Seleccion")).toString();

		switch (opciones) {
		case "Dólar":
			String opciones2 =
			JOptionPane.showInputDialog(null, "Elija el tipo de cotización de Dolar a convertir", "Tipo de Dolares en Argentina",
			 JOptionPane.PLAIN_MESSAGE, null, new Object[] { 
			 "Dólar Oficial", "Dólar Blue","Dólar Tarjeta", "Dólar Turista", "Dólar MEP", "Dólar CCL", "Dólar Mayorista" },"Seleccion").toString();
			switch (opciones2) {	
			case "Dólar Oficial":
				pesosADolar.PasarPesosArgADolarOficial(Minput);
				break;
			case "Dólar Blue":
				pesosADolar.PasarPesosArgADolarBlue(Minput);
				break;
			case "Dólar Tarjeta":
				pesosADolar.PasarPesosArgADolarTarjeta(Minput);
				break;
			case "Dólar Turista":
				pesosADolar.PasarPesosArgADolarTurista(Minput);
				break;
			case "Dólar MEP":
				pesosADolar.PasarPesosArgADolarMEP(Minput);
				break;
			case "Dólar CCL":
				pesosADolar.PasarPesosArgADolarCCL(Minput);
				break;
			case "Dólar Mayorista":
				pesosADolar.PasarPesosArgADolarMayorista(Minput);
				break;
			}
			break;
		case "Euros":
			pesosADivisa.PasarPesosArgEuro(Minput);
			break;
		case "Libras Esterlinas":
			pesosADivisa.PasarPesosArgLibEst(Minput);
			break;
		case "Yen Japones":
			pesosADivisa.PasarPesosArgYenJap(Minput);
			break;
		case "Won Surcoreano":
			pesosADivisa.PasarPesosArgWSC(Minput);
			break;
		case "Yuan Chino":
			pesosADivisa.PasarPesosArgYuanChino(Minput);
			break;
		case "Real":
			pesosADivisa.PasarPesosArgReal(Minput);
			break;}

		}
	
	
	public void ConvertirOtrasMonedasAPesosArg(double Minput) {
		String opciones3 = (JOptionPane.showInputDialog(null,
				"Elije la divisa que deseas convertir a Pesos Argentinos", "Divisa a Pesos Argentinos:", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { 
						"De Dólar a Pesos Arg", "De Euros a Pesos Arg", "De Libras Esterlinas a Pesos Arg", 
						"De Yen Japones a Pesos Arg", "De Won Surcoreano a Pesos Arg", 
						"De Yuan Chino a Pesos Arg", "De Real a Pesos Arg" }, "Seleccion")).toString();

		switch (opciones3) {
		case "De Dólar a Pesos Arg":
			String opciones4 =
			JOptionPane.showInputDialog(null, "Elija el tipo cotización del Dolar a convertir a Pesos Arg", "Tipo de Dolares en Argentina",
			 JOptionPane.PLAIN_MESSAGE, null, new Object[] { 
			 "Dólar Oficial", "Dólar Blue","Dólar Tarjeta", "Dólar Turista", "Dólar MEP", "Dólar CCL", "Dólar Mayorista" },"Seleccion").toString();
			switch (opciones4) {	
			case "Dólar Oficial":
				dolarAPesos.PasarDolarOficialAPesosArg(Minput);
				break;
			case "Dólar Blue":
				dolarAPesos.PasarDolarBlueAPesosArg(Minput);
				break;
			case "Dólar Tarjeta":
				dolarAPesos.PasarDolarTarjetaAPesosArg(Minput);
				break;
			case "Dólar Turista":
				dolarAPesos.PasarDolarTuristaAPesosArg(Minput);
				break;
			case "Dólar MEP":
				dolarAPesos.PasarDolarMEPAPesosArg(Minput);
				break;
			case "Dólar CCL":
				dolarAPesos.PasarDolarCLLAPesosArg(Minput);
				break;
			case "Dólar Mayorista":
				dolarAPesos.PasarDolarMayoristaAPesosArg(Minput);
				break;
			}
			break;	
		case "De Euros a Pesos Arg":
			divisaAPesos.PasarEurosAPesosArg(Minput);
			break;
		case "De Libras Esterlinas a Pesos Arg":
			divisaAPesos.PasarLibEstAPesosArg(Minput);
			break;
		case "De Yen Japones a Pesos Arg":
			divisaAPesos.PasarYenJapAPesosArg(Minput);
			break;
		case "De Won Surcoreano a Pesos Arg":
			divisaAPesos.PasarWSCaPesosArg(Minput);
			break;
		case "De Yuan Chino a Pesos Arg":
			divisaAPesos.PasarYuanChinoAPesosArg(Minput);
			break;
		case "De Real a Pesos Arg":
			divisaAPesos.PasarRealAPesosArg(Minput);
			break;
		}
	}
	
}

