package powerofsquares;

import java.util.Scanner;

public class PowerOfSquaresApp {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		PowerOfSquares p=new PowerOfSquares();
		int res=p.squareNumber(7);
		System.out.println(res);
	}

}
