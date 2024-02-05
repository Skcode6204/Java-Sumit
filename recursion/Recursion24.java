//

import java.util.*;

public class Recursion24{
    public static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        //recursion work.
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        //self work.
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}