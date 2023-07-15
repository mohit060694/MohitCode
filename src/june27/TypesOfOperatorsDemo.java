package june27;

public class TypesOfOperatorsDemo {
    public static void main(String[] args) {
        /*
        Operators- Arithmetic, Comparison, Logical, Assignment, bitwise
        * Arithmetic- +,-,*,/,%,++,--
        * Comparison- ==, !=, <, >, >=, <= (Gives boolean result)
        * Assignment- =, +=, -= (x+=10 it means x=x+10)
        * Logical- && (logical AND- both must true), logical OR operator (any one condition true),! (not equal to)
        */

        int x=10;
        int y=20;
        int z=30;

        System.out.println(x==y);
        System.out.println(x<y && x<z);
        System.out.println(x<y && x>z);
    }
}
