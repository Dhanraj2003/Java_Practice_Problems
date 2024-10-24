package java_practice_program_23_oct;

public class Swap_WithoutUsing_ThirdVariale {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("Before swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);

        b=a+b-b;
        a=a+b+a-a;
        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
