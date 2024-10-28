package java_practice_program_27_oct;
import java.util.Scanner;
public class SumOfNSquareNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any size:");
        int size=sc.nextInt();
        int eachNumSquare;
        int sum=0;

        for(int i=1;i<=size;i++)
        {
            eachNumSquare=i*i;
            sum=sum+eachNumSquare;
        }
        System.out.println("Sum="+sum);

    }
}
