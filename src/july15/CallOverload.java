package july15;

import java.util.Scanner;

public class CallOverload {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number=");
        int num1= sc.nextInt();
        System.out.println("Enter the second number=");
        int num2= sc.nextInt();
        System.out.println("Enter the third number=");
        int num3= sc.nextInt();
        System.out.println("Enter the fourth number=");
        int num4= sc.nextInt();

        Overloading.overload(num1, num2, num3);
        System.out.println(Overloading.overload(num1, num2, num3));

        Overloading.overload(10,20,30);
        System.out.println(Overloading.overload(10,20,30));

        Overloading.overload(num1,num2,num3,num4);
        System.out.println(Overloading.overload(num1,num2,num3,num4));



    }
}
