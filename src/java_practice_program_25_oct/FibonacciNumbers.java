package java_practice_program_25_oct;

public class FibonacciNumbers {

    public static void main(String[] args) {

        int i=0;
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<=10)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
    }

}
