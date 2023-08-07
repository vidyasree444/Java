package programs20thurs;
import java.util.*;
public class IdentifyPolygon {
	public static void identifyPolygon(int sides)
	{//USE SWITCH INSTEAD OF LADDER ELSE-IF
    if(sides==3) {
    	System.out.println("triangle");
    }
    else if(sides==4) {
    	System.out.println("Quadrilateral");
    }
    else if(sides==5) {
    	System.out.println("Pentagon");
    }
    else if(sides==6) {
    	System.out.println("Hexagon");
    }
    else{
    	System.out.println("Septagon");
    }


	}
	public static void main(String[] args)
	{
    Scanner scan=new Scanner(System.in);
    int sides=scan.nextInt();
    identifyPolygon(sides);
	}
}
