package java_practice_program_26_oct;
import java.util.Scanner;
public class ATM {

    private Long balance;

    public ATM(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    //deposite amount
    public void depositeAmount(Long amount)
    {
        this.balance=balance+amount;
        System.out.println(amount+" "+"deposite successfully!!!");
    }

    //withdrawal amount
    public void withdrawalAmount(Long amount)
    {
        if(amount>0 && amount<=balance)
        {
            this.balance=balance-amount;
            System.out.println(amount+" "+"Amount withdrawal successully!!!");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "balance=" + balance +
                '}';
    }


    public static void main(String[] args) {

        ATM obj=new ATM(10000L);

        //check balance
        Long balance1 = obj.balance;
        System.out.println("Bank Balance:"+balance1);

        //deposite amount
        obj.depositeAmount(5000L);

        //after deposite balance
        Long b=obj.balance;
        System.out.println("After deposite balance:"+b);

        //withdrawal amount
        obj.withdrawalAmount(10000L);

        //after withdrawal balance
        Long balance=obj.balance;
        System.out.println("After withdrawal balance:"+balance);

    }
}
//another way to make above program

class ATM2
{
    public static void main(String[] args) {

        int bankBalance=10000;
        int i=0;

        Scanner sc=new Scanner(System.in);

        while (i!=1)
        {
            System.out.println("Enter 0 for deposite amount:");
            System.out.println("Enter 1 for withdrawal amount:");
            System.out.println("Enter 2 for balance check:");
            System.out.println("Enter 3 for exit:");

            int val=sc.nextInt();

            switch (val)
            {
                case 0:
                {
                    System.out.println("Enter deposite amount:");
                    int amount=sc.nextInt();

                    if(amount>0)
                    {
                        bankBalance=bankBalance+amount;
                        System.out.println(amount+""+"deposite successfully!!!");
                    }
                    else{
                        System.out.println("Please enter valid amount");
                    }
                    break;
                }
                case 1:
                {
                    System.out.println("Enter withdrawal amount!!!");
                    int amount=sc.nextInt();

                    if(amount>0 && amount<=bankBalance)
                    {
                        bankBalance=bankBalance-amount;
                        System.out.println("Amount withdrawal successfully!!!");
                    }
                    else{
                        System.out.println("insufficient balance");
                    }
                    break;
                }

                case 2:
                {
                    System.out.println("+++++++++++++++++++++++++Bank balance:"+bankBalance+"+++++++++++++++++++++++++++");
                    break;
                }

                case 3:
                {
                    i=1;
                    break;
                }


            }
        }
        System.out.println("+++++++++++++++++++Exit++++++++++++++++++++++++");
    }

}

