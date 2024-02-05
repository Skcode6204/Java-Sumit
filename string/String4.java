//

import java.util.*;
public class String4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();
        // toggle 
        // SuMIt --> sUmiT.
        for(int i=0; i<n; i++){
            // P --> p.
            // check --> alphabet - small, capital.
            boolean flag = true;   // true --> Capital.
            char ch = str.charAt(i);   // A.
            if(ch == ' ') continue;
            int asci = (int)ch;     //65.
            if(asci >= 97) flag = false;   // small.
            if(flag == true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
            else{
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}