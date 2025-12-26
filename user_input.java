//here "import java.util.Scanner" is necessary
//because Scanner is an inbuilt function in java to initialize it
// we must use this code to take the input.
//after Scanner in the start we have to give the code as it is so that we can give input
//String gives the type of variable,and name we can change it
//input.nextLine() makes your input to be shown in the next line of input

import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = input.nextLine();
            System.out.print("Hello"+name);
        }
    }
    
}
