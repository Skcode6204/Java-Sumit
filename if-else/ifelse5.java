//switch and break
// write a java code for buttons (button1=hello); (button2=namaste); (button3=pranam)

import java.util.*;
public class ifelse5 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("pranam");
            break;
            default : System.out.println("invalid button");
            break;
        }
    }
}