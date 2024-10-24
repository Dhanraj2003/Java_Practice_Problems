package java_practice_program_24_oct;

public class IncrementByOne {

    public static void main(String[] args) {

        int num=2824;
        int orgNum=num;
        //result: 3935
        int dupNum=0;
        int result=0;

        while(num>0)
        {
            int rem=num%10;
            rem++;
            dupNum=dupNum*10+rem;  //5393
            num=num/10;
        }
        while(dupNum>0)
        {
            int remainder=dupNum%10;
            result=result*10+remainder;
            dupNum=dupNum/10;
        }

        System.out.println("Before increment number should be:"+orgNum);
        System.out.println("After increment number should be:"+result);

    }
}
