package java_practice_program_27_oct;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        //153
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int reverseNumber=0;

        while(num>0)
        {
            int rem=num%10;
            reverseNumber=reverseNumber*10+rem;
            num=num/10;
        }

        System.out.println("Reverse Number is:"+reverseNumber);




    }
}
