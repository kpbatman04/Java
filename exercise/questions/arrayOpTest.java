package exercise.questions;

public class arrayOpTest {
    public static void main(String[] args) {
        Arrayoperations opr = new Arrayoperations(new int[]{1,3,5,9});
        Arrayoperations.statistics stat = opr.new statistics();
        System.out.println(stat.mean());
    }
}
