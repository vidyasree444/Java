package programs21fri;

import java.util.Scanner;

public class SolutionMain3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number greater than 100");
		int n=scan.nextInt();
		Solution3 p=new Solution3();
		p.DivBy5(n);
}
}
