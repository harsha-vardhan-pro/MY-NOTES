//Here in performing an arithmatic operations we have to give the iteration properly
//Like int for sum,sub,mult if they are integers
//Better use double for division,we can also use double for the remaining also 
//we generally dont use double for integer operations other than division
//because double cosumes more space than int.
//int=4byte,float=4byte,double=8byte
import java.util.Scanner;
public class algebra_of_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);{
            System.out.println("Please enter the values");
            System.out.print("Enter first value:");
            int value1 = input.nextInt();
            System.out.print("Enter the second value:");
            int value2 = input.nextInt();
            int sum= value1 + value2;
            System.out.println("The answer for your addition = " + sum);
            int sub = value1 - value2;
            System.out.println("The answer for your substraction = " + sub);
            int multi = value1 * value2;
            System.out.println("The answer for your multiplication = " + multi);
            double div = (double) value1/value2;
            System.out.println("The answer for your division = " + div);
            int rem = value1 % value2;
            System.out.println("The answer for your remainder = " + rem);


        }
    }

    
}
