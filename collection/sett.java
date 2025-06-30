package collection;

import java.util.HashSet;
import java.util.Set;

public class sett {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("krish"));
        System.out.println(names.add("Prajapati"));
        System.out.println(names.add("bruce"));
        System.out.println(names.add("wayne"));
        System.out.println(names.size());


        utility.print(names);// the order will not be maintaines like set
        System.out.println(names.add("krish"));
        System.out.println(names.contains("krish"));
        System.out.println(names.remove("krish"));
        utility.print(names);
    }

}
