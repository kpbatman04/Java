package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2,3,4,5,6,7,8);
        Collections.reverse(list);
//        System.out.println(list);
        for (Integer s : list) {
            System.out.print(s+" ");
        }
    }
    public static void reverse(List<Integer> list ){
        for (int i = 0; i<list.size()/2 ; i++) {
            ListSwapp.swap(list,i, list.size()-i-1);
        }
    }

}
