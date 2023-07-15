import java.util.Scanner;

public class ApplicationSwitch {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Welcome to Scotia Bank Customer Service");
        System.out.println("Enter your input");
        int input= sc.nextInt();

        switch(input){
            case 1:
                System.out.println("Enter 1 for Existing Customers");
                break;
            case 2:
                System.out.println("Enter 2 for New Customers");
                break;
            case 3:
                System.out.println("Enter 3 for  Credit  Card Services");
                break;
            case 4:
                System.out.println("Enter 4 for  debit card Services");
                break;
            case 5:
                System.out.println("Enter 5 for unauthorised transacations");
                break;
            default:
                System.out.println("if you need any help, press star");





        }
    }
}
