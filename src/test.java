import java.util.*;

public class test {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(1,4);
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
