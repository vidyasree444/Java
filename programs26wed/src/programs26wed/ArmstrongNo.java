package programs26wed;
public class ArmstrongNo {
    public int ArmstrongNo(int n) {
        int sum = 0;
        int count = 0;
        int temp = n; // Store the original value of n
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = n; // Reset temp to the original value of n

        while (temp != 0) {
            int rem = temp % 10;
            int res = (int) Math.pow(rem, count);
            sum = sum + res;
            temp = temp / 10;
        }

        return sum;
    }
}
