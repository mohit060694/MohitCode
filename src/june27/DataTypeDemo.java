package june27;

public class DataTypeDemo {
    public static void main(String[] args) {
        // ++ increment ? +1
        // -- decrement ? -1
        // x++ (post increment)
        // x-- (pre increment)

        int x=10;
        x++;
        System.out.println("value of x is = "+x);

        int y=20;
        System.out.println(y++);
        System.out.println("value of y is = "+y);

        int z= 30;
        ++z;
        System.out.println("value of z is = "+z);

        int a= 40;
        System.out.println(++a);
        System.out.println("value of a is ="+a);

    }
}
