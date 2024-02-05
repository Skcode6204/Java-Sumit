// Java Constructor.

public class oops7{
    int num1;
    int num2;

    oops7(int a, int b){
        num1 = a;
        num2 = b;

    }
    public static void main(String[] args){
        oops7 m = new oops7(10, 20);
        oops7 n = new oops7(100, 200);

        System.out.println("m");
        System.out.println("num1 :"+m.num1);
        System.out.println("num2 :"+m.num2);

        System.out.println("n");
        System.out.println("num1 :"+n.num1);
        System.out.println("num2 :"+n.num2);
        
    }
}