package planerexplorer;
import java.util.*;
public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double r=s.nextDouble();
		PlanetExplorer p=new PlanetExplorer();
		System.out.printf("%.2f \n",p.calculateSurfaceArea(r));
		
	}

}
