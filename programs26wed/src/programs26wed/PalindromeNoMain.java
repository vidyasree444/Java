package programs26wed;
import java.util.Scanner;
public class PalindromeNoMain {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int originalNo=n;
	PalindromeNo p=new PalindromeNo();
	int res=p.PalindromeNo(n);
	System.out.println(res);
	if(originalNo==res) {
		System.out.println("Palindrome no");
	}
	else
		System.out.println("not a palindrome no");
	}
}
