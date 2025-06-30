package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kidi","Zebrar" ,"Ant");
        System.out.println(list);
        sortIndescending(list);
        System.out.println(list);
    }
    public static void sortIndescending(List<String> stringList){
//        Collections.sort(stringList);
//        Collections.reverse(stringList);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                        return 1;
                }else{
                    return -1;
                }

            }
        });
    }
}
