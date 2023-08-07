package temperatureConverter;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		TemperatureConverter t=new TemperatureConverter();
		double res=t.convertFahrenheitToCelsius(68.0);
		System.out.printf("%.2f \n",res);
	}

}
