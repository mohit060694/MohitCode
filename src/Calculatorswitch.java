import java.util.Scanner;

public class Calculatorswitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divison");

        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();

        System.out.println("Enter your input");
        int input= sc.nextInt();


        switch(input){
            case 1:
                int sum = num2+num1;
                System.out.println("Sum is :" +sum);
                break;
            case 2:
                int sub= num1-num2;
                System.out.println("sub is :" +sub);
                break;
            case 3:
                int mul= num1*num2;
                System.out.println("multiplication is :" +mul);
                break;
            case 4:
                int divison= num1/num2;
                System.out.println("divison is :" +divison);
                break;
            default:
                System.out.println("Invalid input, pls try again");

        }

    }
}
