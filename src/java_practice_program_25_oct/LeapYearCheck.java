package java_practice_program_25_oct;
import  java.util.Scanner;
public class LeapYearCheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Year:");
        int year=sc.nextInt();


        if(year%400==0)
        {
            System.out.println("Given year is leaf year");
        }
        else{
            System.out.println("Given year is not leaf year");
        }








    }
}
