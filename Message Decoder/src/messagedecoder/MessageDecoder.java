package messagedecoder;
import java.util.Scanner;
public class MessageDecoder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		CHARDECODER m=new CHARDECODER();
		int res=m.decodeCharacter(c);
		System.out.println(res);
		
		
	}
}
