import java.util.*;
public class Calc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers");
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.println("enter the operation you want excicute");
        char c =sc.next().charAt(0);
        if(c=='+')
        {
            System.out.println("the sum is "+(a+b));

        }
        else if(c=='-')
        {
            System.out.println("the remaoning value is "+(a-b));

        }
        else if(c=='*')
        {
            System.out.println("the product is given as"+(a*b));

        }
        else if(c=='/')
        {
            System.out.println("the value will be "+(a/b));

        }
        else
        {
            System.out.println("please enter a valid oprator");

        }

    }


}
    

