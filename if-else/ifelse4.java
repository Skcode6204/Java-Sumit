// write a java code for buttons (button1=hello); (button2=namaste); (button3=pranam)

import java.util.*;
public class ifelse4 {
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        //conditions

        if(button == 1){
            System.out.println("hello");
        } else if(button == 2) {
            System.out.println("namaste");
        } else if(button == 3) {
            System.out.println("pranam");
        } else {
            System.out.println("invalid button");

        }
                
    }
}