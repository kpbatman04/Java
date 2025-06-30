package exercise;

public class ArraytoString {
    public static void main(String[] args) {
        String[] arr = new String[] {"Krish","Prajapati","is","going","to","be","billionaire"};
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
        System.out.print(sb);
    }


}
