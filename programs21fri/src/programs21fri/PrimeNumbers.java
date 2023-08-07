package programs21fri;
import java.util.*;
import java.util.Random;
public class PrimeNumbers {
	public static int checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter range to print prime number");
	int n=scan.nextInt();
	int count=0;
	for(int i=3;i<=n;i++) {
		int res=checkPrime(i);
		if(res!=0) {
			System.out.println(res);
			count++;
		}
	}
	System.out.println("no. of prime numbers="+count);
	
}
    
}
