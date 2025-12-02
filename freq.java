import java.util.*;
public class freq {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long temp,dig,count,rem;
        for(dig=0;dig<=9;dig++)x    
        {
            count=0;
            temp=num;
            while(temp!=0)
            {
                rem = temp%10;
                if(dig==rem)
                {
                    count++;
                }
                temp=temp/10;
            }
            System.out.println(dig+" count = "+count);
        }
    }
    
}
