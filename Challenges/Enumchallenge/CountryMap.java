package Challenges.Enumchallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("USA","Washington");
        map.put("Pakistan","Isalamabad");
        map.put("England","London");
        map.put("Italy","Vetican");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country name :");
        String country = sc.next();
        if(map.containsKey(country)){
            System.out.println(map.get(country));
        }else {
            System.out.println("Doesnt exist");
        }
    }
}
