package programs21fri;

import java.util.Scanner;
public class SolutionMain1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number greater than 100");
		int n=scan.nextInt();
		Solution1 p=new Solution1();
		p.DivBy2(n);
}
}
