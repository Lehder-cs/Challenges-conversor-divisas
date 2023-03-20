package ConversorDivisas;

import javax.swing.JOptionPane;

public class ConversionMoneda {

	/* Function para realizar conversion de pesos Colombianos a Dólar */
	public void ConversionPesosColombianoDolar(double valor) {
		double monedaDolar = valor /4812.63;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes $ " + monedaDolar + "Dolar ");

	}

	/* Function para realiazar conversion de Pesos colombianos a Euro */
	public void ConversionPesosColombianoEuro(double valor) {
		double monedaEuro = valor / 5136.30;
		monedaEuro = (double)Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes $ " + monedaEuro + "Euro ");

	} 

	/* Function para realizar conversion de pesos Colombiano a Libra Esterlina */
	public void ConversionPesosColombianosLibra(double valor) {
		double monedaLibra = valor / 5861.11;
		monedaLibra = (double)Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes $ " + monedaLibra + "Libra Esterlina ");

	}

	/* Funtion para realizar conversion de pesos Colombianos a Yen Japonés */
	public void ConversionPesosColombiaYen(double valor) {
		double monedaYen = valor / 36.42;
		monedaYen = (double)Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes $ " + monedaYen + "Yen Japonés ");

	}

	/* Function para realizar conversion de pesos Colombianos a Won Surcoreano */
	public void ConversionPesosColombianosWon(double valor) {
		double monedaWon = valor / 3.68;
		monedaWon = (double)Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes $ " + monedaWon + "Won surcoreano ");

	}

	/* Funtion para realizar conversion de Dólar a pesos Colombiano */
	public void ConversionDolarPesosColombianos(double valor) {
		double monedaDolar =  4812.63 * valor;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes Dolares " + monedaDolar + "en pesos ");

	}

	/* Function de conversion de Euro a pesos Colombianos */
	public void ConversionEuroPesosColombianos(double valor) {
		double monedaEuro = valor * 5136.30;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes Euros " + monedaEuro + "en pesos ");

	}

	/* Funtion de conversion de Libra Esterlina a pesos Colmbianos */
	public void ConversionLibraPesosColombianos(double valor) {
		double monedaLibra = valor * 5861.11;
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes Libra Esterlina" + monedaLibra + "en pesos ");
	}

	/* Function de conversion de Yen Japonés pesos Colombianos */
	public void ConversionYenPesosColombianos(double valor) {
		double monedaYen = valor * 36.42;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes Yen Japonés" + monedaYen + "en pesos ");

	}

	/* Function de conversion de Won surcoreano a pesos Colombianos */
	public void ConversionWonPesosColombianos(double valor) {
		double monedaWon = valor * 3.68;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, " Tienes Won Surcoreano" + monedaWon + "en pesos ");

	}

}