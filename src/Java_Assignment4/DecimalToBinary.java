package Java_Assignment4;
import java.util.*;

public class DecimalToBinary {
    public static void main(String args[])
    {
        int num;
        StringBuilder x= new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Num : ");
        num=sc.nextInt();
        int temp = num;
        while(temp>0)
        {
            int rem=temp%2;
            x.append(rem); //string concatenation
            temp=temp/2;
        }
        x.reverse();
        System.out.print("conversion of decimal : "+num+" to Binary is= "+x);
    }
}
