import java.utiil.*;
public class sec1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a%b;
        if(b==0)
        {
            System.out.println("the second number is zero");
        }
        else{
            System.out.println("the modulus is : "+a);
        }
    }
    
}
