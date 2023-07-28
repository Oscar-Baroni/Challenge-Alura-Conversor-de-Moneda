package base;

import javax.swing.JOptionPane;
import conversorDeTemperatura.ConversorTemp;
import conversorDeDivisas.Conversor;

public class Base {

	public static void main(String[] args) {

		Conversor divisas = new Conversor();
		ConversorTemp temperatura = new ConversorTemp();

		boolean flag = true;
		while (flag) {

			String ventana = (JOptionPane.showInputDialog(null, "Opciones de conversión", "Menú del conversor",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Divisas", "Conversor de Temperatura" }, "Seleccion")).toString();

			switch (ventana) {
			case "Conversor de Divisas":
				String tipoDeConversion = JOptionPane.showInputDialog(null, "Elija el tipo de conversión a realizar",
						"Menú de conversor", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "De Pesos Argentinos a otra Divisa", "De otra Divisa a Pesos Argentinos" },
						"Seleccion").toString();

				switch (tipoDeConversion) {
				case "De Pesos Argentinos a otra Divisa":
					String input = JOptionPane.showInputDialog("Ingrese la cantidad de Pesos Argentinos a convertir a otra Divisa: ",
							"Ingrese el valor aquí");
					if (SoloNumeros(input) == true) {
						double Dvalor = Double.parseDouble(input);
						divisas.ConvertirPesosArgAOtraMoneda(Dvalor);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona opción Afirmativa");
						} else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa terminado");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;

				case "De otra Divisa a Pesos Argentinos":
					
					input = JOptionPane.showInputDialog(
							"Ingrese el monto de la Divisa a convertir a Pesos Argentinos: ", "Ingrese el valor aquí");

					if (SoloNumeros(input) == true) {
						double Pvalor = Double.parseDouble(input);
						divisas.ConvertirOtrasMonedasAPesosArg(Pvalor);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona opción Afirmativa");
						} else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa terminado");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;
				}
				break;
				
			case "Conversor de Temperatura":
				String input = JOptionPane.showInputDialog("Ingrese el valor de temperatura que desea convertir y luego seleccione una escala: ",
							"Ingrese el valor aquí");
					if (SoloNumeros(input) == true) {
						double Tvalor = Double.parseDouble(input);
						temperatura.ConvertirTemperatura(Tvalor);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona opción Afirmativa");
						} else {
							flag = false;
							JOptionPane.showMessageDialog(null, "Programa terminado");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					break;
			}
		}
	}

	public static boolean SoloNumeros(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}