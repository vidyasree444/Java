package programs19wed;
import java.util.*;
public class CharacterIdentifier {
	public static void identifyCharacter(char ch)
	{
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    	System.out.println("Lower-case Vowel ");
    }
    else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
    	System.out.println("Lower-case Vowel ");
    }
    else if(Character.isDigit(ch)==true){
    	System.out.println("is a digit");
    }
    else if(!Character.isLetter(ch)){
    	System.out.println("is a special symbol");
    }
    else {
    	if(Character.isLowerCase(ch)) {
    	System.out.println(" lower consonant");
    	}
    	else {
    	System.out.println(" Upper consonant");
    	}
    }
    
	
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
}
}
