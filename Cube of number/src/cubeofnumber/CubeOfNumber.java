package cubeofnumber;

import java.util.Scanner;
public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		CubeOfNumber p=new CubeOfNumber();
		int res=p.cubeOfNumber(n);
		System.out.println(res);
	}

	private int cubeOfNumber(int num) {
		return num*num*num;
	}

}
