import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE CALCULATOR APPLICATION");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int result = 0;



        System.out.println("Enter first Number: ");
        String n1 = sc.nextLine();
        int num1 = Integer.parseInt(n1);

        System.out.println("Enter operator: ");
        String op = sc.nextLine();

        System.out.println("Enter second Number: ");
        String n2 = sc.nextLine();
        int num2 = Integer.parseInt(n2);

        if(op.equals("+")) {
            result = num1 + num2;
        } else if(op.equals("-")) {
            result = num1 - num2;
        } else if(op.equals("*")) {
            result = num1 * num2;
        } else if(op.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid Operator");
        }

        System.out.println("Hey, " + name.toUpperCase() + " !! " + "The Result of " + num1 + " " +  op + " " + num2 + " is: " + result);




    }
}
