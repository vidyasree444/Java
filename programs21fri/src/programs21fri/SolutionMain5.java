package programs21fri;

import java.util.Scanner;

public class SolutionMain5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number greater than 100");
		int n=scan.nextInt();
		Solution5 p=new Solution5();
		p.DivBy3and5(n);
}
}
