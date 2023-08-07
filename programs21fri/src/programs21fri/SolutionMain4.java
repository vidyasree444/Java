package programs21fri;

import java.util.Scanner;
public class SolutionMain4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number greater than 100");
		int n=scan.nextInt();
		Solution4 p=new Solution4();
		p.DivBy2and5(n);
}
}
