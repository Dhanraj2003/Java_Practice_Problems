package java_practice_program_26_oct;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int flag=0;

        if(num==2)
        {
            flag=1;
        }
        else{
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=0;
                }
                else{
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("given number is prime number");
        }
        else{
            System.out.println("given number is not prime number");
        }




    }
}
