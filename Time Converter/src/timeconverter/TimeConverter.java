package timeconverter;
import java.util.Scanner;
public class TimeConverter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int minutes=s.nextInt();
		System.out.println(convertToHours(minutes));
	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	}
	
	

}
