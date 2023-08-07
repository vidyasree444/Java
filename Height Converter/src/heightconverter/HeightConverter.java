package heightconverter;
import java.util.*;
public class HeightConverter {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double inches=s.nextDouble();
		HeightConverter h=new HeightConverter();
		System.out.printf("%.2f \n",h.convertInchesToFeet(inches));
		
	}
	public static double convertInchesToFeet(double inches) {
		return inches/12;		
	}
}
