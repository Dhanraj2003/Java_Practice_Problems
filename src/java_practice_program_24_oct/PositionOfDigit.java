package java_practice_program_24_oct;

public class PositionOfDigit {

    public static void main(String[] args) {

        int num=1918;
        int dupNum=num;
        int count=0;

        while (num>0)
        {
           count=count+1;
           num=num/10;
        }

        while(dupNum>0)
        {
            int rem=dupNum%10;
            System.out.println(rem+" is present at "+count+" position");
            count--;
            rem=0;
            dupNum=dupNum/10;
        }
    }
}
