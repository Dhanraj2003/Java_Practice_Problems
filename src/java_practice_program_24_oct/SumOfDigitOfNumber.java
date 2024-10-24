package java_practice_program_24_oct;
import java.util.Scanner;
public class SumOfDigitOfNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;

        while(num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }

        System.out.println("sum of digit of given number "+num+" is "+sum);


    }
}
