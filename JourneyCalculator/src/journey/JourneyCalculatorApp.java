package journey;

public class JourneyCalculatorApp {
public static void main(String[] args) {
	JourneyCalculator j=new JourneyCalculator();
	double res=j.calculateDistance(60.0, 1.5);
	System.out.printf("%.2f \n",res);
}
}
