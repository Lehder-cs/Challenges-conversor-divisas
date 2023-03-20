package ConversorTemperatura;
import javax.swing.JOptionPane;

public class OpcionesConversionTempratura {
	
	ConversionTemperatura temperatura = new ConversionTemperatura();
	
	public void ConversionTemperatura(double input) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elige la  Temperatura que quieres convertir ","Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
								"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"}, 
						"Seleccion")).toString();
		switch (opcion) {
		case "De Celsius a Fahrenheit":
			temperatura.CoversionCelsiusFahrenheit(input);
			break;
		
		case "De Celsius a Kelvin": 
			temperatura.ConvertirCelisusKelvin(input);
			break;
			
		case "De Celsius a Rankine":
			temperatura.ConvertirCelsiusRankine(input);
			break;
			
		case "De Fahrenheit a Celsius":
			temperatura.ConvertirFahrenheitCelsius(input);
			break;
			
		case "De Fahrenheit a Kelvin":
			temperatura.ConvertirFahrenheitKelvin(input);
			break;
		
		case "De Fahrenheit a Rankine":
			temperatura.ConvertirFahrenheitRankine(input);
			break;
			
		case "De Kelvin a Celsius":
			temperatura.ConvertirKelvinCelsius(input);
			break;
			
		case "De Kelvin a Fahrenheit":
			temperatura.ConvertirKelvinFahrenheit(input);
			break;
		 
		case "De Kelvin a Rankine":
			temperatura.ConvertirKelvinRankine(input);
			break;
			
		case "De Rankine a Celsius":
			temperatura.ConvertirRankineCelsius(input);
			break;
			
		case "De Rankine a Fahrenheit":
			temperatura.ConvertirRankineFahrenheit(input);
			break;
			
		case "De Rankine a Kelvin":
			temperatura.ConvertirRankineKelvin(input);
			break;
		}
	}

}
