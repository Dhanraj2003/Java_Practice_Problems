package java_practice_program_25_oct;
import java.util.Scanner;
public class NthFibonacciNumbers {

    public static void main(String[] args) {

        //fibonacci number:
         // a series of numbers in which each number is generated by addition of its two precedding numbers

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any size for calculating fibonacci numbers:");
        int size=sc.nextInt();


        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<=size;i++)
        {
            c=a+b;
            System.out.println(i+"="+c);
            a=b;
            b=c;
        }
    }
}
