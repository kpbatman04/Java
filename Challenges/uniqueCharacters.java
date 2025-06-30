package Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String userStr = sc.next();
        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }
        System.out.println("No of nique characters " + unique.size());
    }
}
