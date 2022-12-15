import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LC205 {
    public static void main(String[] args){
        String s = "add", t = "fad";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){ return false; }
        HashMap<Character, Character> map = new HashMap<>();
        for (int x = 0; x<s.length(); x++){
            if(!map.containsKey(s.charAt(x)) || (map.containsKey(s.charAt(x)) && map.get(s.charAt(x))==t.charAt(x))){
                map.put(s.charAt(x), t.charAt(x));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
