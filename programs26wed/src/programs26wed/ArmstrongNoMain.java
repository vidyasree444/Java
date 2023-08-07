package programs26wed;
import java.util.Scanner;

public class ArmstrongNoMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int armstrong = n;
        ArmstrongNo a = new ArmstrongNo();
        int res = a.ArmstrongNo(armstrong);
        if (res == armstrong) {
            System.out.println("armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}