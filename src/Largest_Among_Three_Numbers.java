import java.util.*;
public class Largest_Among_Three_Numbers {

    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1=sc.nextInt();

        System.out.println("Enter the second number:");
        num2=sc.nextInt();

        System.out.println("Enter the third number");
        num3=sc.nextInt();


        if(num1>num2 && num1>num3)
        {
            System.out.println(num1+" i.e is first number is the largest number");
        }
        else if(num2>num3 && num2>num1)
        {
            System.out.println(num2+" i.e is second number is the largest number");
        }
        else{
            System.out.println(num3+" i.e is third number is the largest number");
        }


    }
}
