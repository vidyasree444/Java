package halve;
import java.util.*;
public class HalveIt {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double num=s.nextDouble();
	System.out.println(halveTheNumber(num));
	
}
public static double halveTheNumber(double num) {
	return num/2;
}
}
