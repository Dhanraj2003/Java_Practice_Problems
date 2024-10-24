import java.util.Scanner;
public class Positive_Negative_Check {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the any number which is to be check as positive or negative:");
        int num=sc.nextInt();


        if(num<0)
        {
            System.out.println("Entered number is negative number");
        }
        else{
            System.out.println("Entered number is positive number");
        }
    }
}
