import java.util.Scanner;
public class CheckEvenOdd {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Given number is Even Number");
        }
        else{
            System.out.println("Given Number is Odd Number");
        }

    }
}
