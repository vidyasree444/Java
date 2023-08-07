package programs24mon;

public class GcdEuclideanMethod {
public static int Gcd(int m,int n) {
	while(n!=0) {
		int rem=m%n;
		m=n;
		n=rem;
	}
	return m;
}
}
