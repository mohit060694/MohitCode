import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number=  ");
        x= sc.nextInt();
        System.out.println("Enter Second number= ");
        y=sc.nextInt();
        System.out.println("Enter third number= ");
        z=sc.nextInt();
        if ((x<y)&&(y<z)&&(x<z)){
            System.out.println("z is largest among all");
            System.out.println("Value of z is = " +z);
        }
    }
}
