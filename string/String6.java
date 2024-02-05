//

import java.util.*;
public class String6{
    public static void main(String[] args) {
        String str = "My Name is Sumit Kumar";
        System.out.println("Original String : "+str);
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans = ans + sb;
                ans = ans + " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans = ans + sb;
        //System.out.println(ans);
        System.out.println("reverse String is : "+ans);
    }
}