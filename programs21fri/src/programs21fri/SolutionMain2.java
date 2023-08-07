package programs21fri;

import java.util.Scanner;
public class SolutionMain2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number greater than 100");
		int n=scan.nextInt();
		Solution2 p=new Solution2();
		p.DivBy3(n);
}
}
