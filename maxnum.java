import java.util.*; 
public class maxnum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();
        if(num1>num2 && num1>num3)
        {
            System.out.println("Mximum number is :" + num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("Mximum number is :" + num2);
        }
        else
        {
            System.out.println("Mximum number is :" + num3);
        }
        
    }
}

    

