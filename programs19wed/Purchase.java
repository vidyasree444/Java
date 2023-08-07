package programs19wed;
import java.util.*;
public class Purchase {
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Disount Applicable");
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double purchaseAmount=scan.nextDouble();
	checkDiscount(purchaseAmount);
}
}
