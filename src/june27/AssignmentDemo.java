package june27;

public class AssignmentDemo {
    public static void main (String [] args){
       // change values between two variables or swap values between two variables.
        // before x:10, y:20---- after x:20, y:10
        // Solution- it will be possible by taking another variable.

       int x=10;
       int y=20;
       int a;

        a=x;
        x=y;
        y=a;

        System.out.println("value of x is equal to = "+x );
        System.out.println("value of y is equal to = "+y);

        //Solution-2 Swap without using third variable
        /*
        int x=10; int y=20; y=x; y=2*
        System.out.println("value of x is equal to = "+x );
        System.out.println("value of y is equal to = "+y);
         */
    }
}
