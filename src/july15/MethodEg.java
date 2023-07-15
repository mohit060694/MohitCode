package july15;

import java.util.Scanner;

public class MethodEg {
    public static void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number= ");
        int num1= sc.nextInt();
        System.out.println("Enter the second number= ");
        int num2= sc.nextInt();
        int sum= num1+num2;
        System.out.println("sum of two numbers is=" +sum);
    }
}
