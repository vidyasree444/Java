package programs19wed;

import java.util.Scanner;

public class FirstNoMultipleOfSecond {
		public static void checkMultipleOfTen(int n,int n1) {
			if(n%n1==0) {
				System.out.println("The number "+n+" is multiple of "+n1);
			}
				}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int n1=scan.nextInt();
		checkMultipleOfTen(n,n1);
		}
	}
