package java_practice_program_27_oct;

import java.util.Scanner;
public class SumOfNCubeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter any size:");
        int size=sc.nextInt();
        int cubeNum = 1;
        Long sum=0L;


        for (int i=1;i<=size;i++)
        {
            int count=3;
//            sum+=i*i*i;
            while (count>=1)
            {
                cubeNum=cubeNum*i;
                 count--;
            }
            sum=sum+cubeNum;
        }

        System.out.println("Sum of "+size+" Cube Number is:"+sum);


    }
}
