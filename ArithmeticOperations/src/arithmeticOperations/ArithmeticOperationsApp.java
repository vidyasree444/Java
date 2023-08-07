package arithmeticOperations;

public class ArithmeticOperationsApp {
public static void main(String[] args) {
		ArithmeticOperations a=new ArithmeticOperations();
		int r1=a.subtractNumbers(20, 5);
		int r2=a.multiplyNumbers(4, 5);
		double r3= a.divideNumbers(20, 4);
		int r4=ArithmeticOperations.findRemainder(10, 3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.printf("%.2f \n",r3);
		System.out.println(r4);
	}
    
}
