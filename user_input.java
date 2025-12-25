//here "import java.util.Scanner" is necessary
//because Scanner is an inbuilt function in java to initialize it
// we must use this code to take the input.
import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.print("Hello"+name);
    }
    
}
