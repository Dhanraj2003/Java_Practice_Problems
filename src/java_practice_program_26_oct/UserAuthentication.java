package java_practice_program_26_oct;
import java.util.Scanner;
public class UserAuthentication {



    Scanner sc=new Scanner(System.in);

    public void login()
    {
        String userName="dhana";
        int password=123;

        System.out.println("Enter UserName:");
        String inputUserName=sc.next();

        System.out.println("Enter Password:");
        int inputPassword=sc.nextInt();

        if(inputUserName.equals(userName))
        {
            if(inputPassword==password)
            {
                System.out.println("Authentication is Successful!!!");
            }else{
                System.out.println("due to invalid password Authentication is denile ");
            }
        }
        else{
            System.out.println("due to invalid username authentication is denile");
        }
    }


    public static void main(String[] args) {

        UserAuthentication obj=new UserAuthentication();
        obj.login();
    }
}
