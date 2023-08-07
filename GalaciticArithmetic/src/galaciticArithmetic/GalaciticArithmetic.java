package galaciticArithmetic;
import java.util.*;
public class GalaciticArithmetic {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long num1=s.nextLong();
	long num2=s.nextLong();
	long result=galacticAddition(num1,num2);
	System.out.println(result);
	
}
 public static long galacticAddition(long num1,long num2) {
	 return num1+num2;
 }
}
