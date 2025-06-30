package Challenges;

public class vararg {
    public static void main(String[] args) {
        System.out.println(concatenate("Krish"));
        System.out.println(concatenate("Krish","prajapati"));
        System.out.println(concatenate("Krish","prajapati","is","batman"));
    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
