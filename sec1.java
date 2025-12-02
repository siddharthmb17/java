import java.util.*;

public class sec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("The second number is zero");
        } else {
            int c = a % b;
            System.out.println("The modulus is: " + c);
        }
    }
}