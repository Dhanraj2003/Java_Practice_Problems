package java_practice_program_26_oct;

import java.util.Scanner;
public class ArmstrongNumber {

    public void calculateArmstrongNumber()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int eachDigitCube=1;
        int sum=0;

        System.out.println("Enter any number:");
        int num=sc.nextInt();

        int orgNum=num;
        int dupNum=num;

        while(num>0)
        {
            count++;
            num=num/10;
        }

        int dupCount=count;

        while(dupNum>0)
        {
            count=dupCount;
            int rem=dupNum%10;
            while (count>=1)
            {
                eachDigitCube=eachDigitCube*rem;
                count--;
            }
            sum=sum+eachDigitCube;
            eachDigitCube=1;

            dupNum=dupNum/10;
        }


        if(orgNum==sum)
        {
            System.out.println("Given number is Armstrong number");
        }else{
            System.out.println("Given number is not Armstrong number");
        }
    }

    public static void main(String[] args) {

        ArmstrongNumber obj=new ArmstrongNumber();
        obj.calculateArmstrongNumber();
    }
}
