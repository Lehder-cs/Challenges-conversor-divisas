package ConversorTemperatura;
import javax.swing.JOptionPane;

public class ConversionTemperatura {
	
	public void CoversionCelsiusFahrenheit(double input) {
		double CelsFahrenheit =(input * 1.8) + 32;
		CelsFahrenheit = (double)Math.round(CelsFahrenheit * 100d)/ 100;
		JOptionPane.showMessageDialog(null, "Son " + CelsFahrenheit + "Fahrenheit ");
	}
	public void ConvertirCelisusKelvin(double input) {
		double CelsKelvin = input + 273.15;
		CelsKelvin = (double)Math.round(CelsKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + CelsKelvin + "Kelvin ");
		
	}
	public void ConvertirCelsiusRankine(double input) {
		double CelsRankine = (input * 1.8)+ 491.67;
		CelsRankine = (double)Math.round(CelsRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + CelsRankine + "Rankine ");
		
		
/*============================================================================================*/	
	}
	public void ConvertirFahrenheitCelsius(double input) {
		double FahrenhCelsius =(input -32)*(0.556);
		FahrenhCelsius = (double)Math.round(FahrenhCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + FahrenhCelsius + "Celsius ");
		
	}
	public void ConvertirFahrenheitKelvin(double input) {
		double FahrenhKelvin = (input + 459.67)*(0.556);
		FahrenhKelvin = (double)Math.round(FahrenhKelvin *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Son " + FahrenhKelvin + "Kelvin ");
		
	}
	public void ConvertirFahrenheitRankine(double input) {
		double FahrenhRankine = input + 459.67;
		FahrenhRankine =(double)Math.round(FahrenhRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + FahrenhRankine + "Rankine ");
	}
	
	/*============================================================================================*/
	
	public void ConvertirKelvinCelsius(double input) {
		double KelvCelsius = input - 273.15;
		KelvCelsius =(double)Math.round(KelvCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KelvCelsius + "Celsius ");

	}
	public void ConvertirKelvinFahrenheit(double input) {
		double KelvFahrenheit = ((input -273.15) * (1.8)) + 32;
		KelvFahrenheit =(double)Math.round(KelvFahrenheit *100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KelvFahrenheit + "Fahrenheit ");
		
	}
	public void ConvertirKelvinRankine(double input) {
		double KelvRankine = input * 1.8;
		KelvRankine = (double)Math.round(KelvRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KelvRankine + "Rankine ");
		
	}
	
	/*============================================================================================*/

	public void ConvertirRankineCelsius(double input) {
		double RankCelsius = (input - 491.67)* (0.556);
		RankCelsius = (double)Math.round(RankCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RankCelsius + "Celsius ");
			
	}
	public void ConvertirRankineFahrenheit(double input) {
		double RankRankine = input -491.67;
		RankRankine = (double)Math.round(RankRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RankRankine + "Fahrenmheit ");	
	}
	public void ConvertirRankineKelvin(double input) {
		double RankKelvin = input * (0.556);
		RankKelvin =(double)Math.round(RankKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RankKelvin + "Kelvin ");	
		
		
	}
}
