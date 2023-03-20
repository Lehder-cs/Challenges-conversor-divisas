package MenuConversion;

import javax.swing.*;

import ConversorDivisas.OpcionConversionDivisas;
import ConversorTemperatura.OpcionesConversionTempratura;

public class OpcionMenuConversion {

	public static void main(String[] args) {
		OpcionConversionDivisas conversion = new OpcionConversionDivisas();
		OpcionesConversionTempratura conversionTemp = new OpcionesConversionTempratura();
		

		boolean flag = true;

		while (flag) {

			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de Divisas", "Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {

			case "Conversor de Divisas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConversionMoneda(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona la opcion afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Conversor Divisas Finalizado");
					flag = false;
				}
				break;
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionTemp.ConversionTemperatura(valorRecibidoT);

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Selecciona la opcion afirmativa");
				} else {
					
					JOptionPane.showMessageDialog(null, "Conversor de Temperatura Finalizado");
					flag = false;
				}
			}
		}
	}
}