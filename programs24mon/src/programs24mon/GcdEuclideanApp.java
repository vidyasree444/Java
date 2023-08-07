package programs24mon;
import java.util.Scanner;
public class GcdEuclideanApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int m=scan.nextInt();
	int n=scan.nextInt();
	//GcdEuclideanMethod g=new GcdEuclideanMethod();
	int res=GcdEuclideanMethod.Gcd(m,n);
	System.out.println(res);
	scan.close();
}
}
