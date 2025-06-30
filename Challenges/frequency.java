package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class frequency {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,1,7,8,7,7,7);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,7));
        System.out.println(Collections.frequency(list,8));
        }
    }

