package ConversorDivisas;

import javax.swing.JOptionPane;


public class OpcionConversionDivisas {

	ConversionMoneda monedas = new ConversionMoneda();

	public void ConversionMoneda(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la opcion a convertir de tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De peso a Dolar", "De peso a Euro", "De pesos a Libra Esterlinas",
						"De pesos a Yen Japonés", "De pesos a Won Sub-coreano", "De Dolar a pesos", "De Euro a Pesos",
						"De Libras Esterlinas a pesos", "De Yen a Pesos", "De won Surcoreano a pesos" },
				"Seleccion")).toString();

		switch (opcion) {

		case "De peso a Dolar":
			monedas.ConversionPesosColombianoDolar(valor);
			break;
		case "De peso a Euro":
			monedas.ConversionPesosColombianoEuro(valor);
			break;
		case "De pesos a Libra Esterlinas":
			monedas.ConversionPesosColombianosLibra(valor);
			break;
		case "De pesos a Yen Japonés":
			monedas.ConversionPesosColombiaYen(valor);
			break;
		case "De pesos a Won Sub-coreano":
			monedas.ConversionPesosColombianosWon(valor);
		case "De Dolar a pesos":
			monedas.ConversionDolarPesosColombianos(valor);
			break;
		case "De Euro a Pesos":
			monedas.ConversionEuroPesosColombianos(valor);
			break;
		case "De Libras Esterlinas a pesos":
			monedas.ConversionLibraPesosColombianos(valor);
			break;
		case "De Yen a Pesos":
			monedas.ConversionYenPesosColombianos(valor);
			break;
		case "De won Surcoreano a pesos":
			monedas.ConversionWonPesosColombianos(valor);
			break;

		}

	}

}
