package IntroductionToArray_Collection_Class2;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("One",1); //entry
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        System.out.println(map);

    }
}
