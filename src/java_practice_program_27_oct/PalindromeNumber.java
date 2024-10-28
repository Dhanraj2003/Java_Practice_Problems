package java_practice_program_27_oct;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int reverseNumber=0;
        int orgNum=num;

        while(num>0)
        {
            int rem=num%10;
            reverseNumber=reverseNumber*10+rem;
            num=num/10;
        }

        if (orgNum==reverseNumber)
        {
            System.out.println("given number is palindrome number");
        }
        else{
            System.out.println("given number is not palindrome number");
        }
    }
}
