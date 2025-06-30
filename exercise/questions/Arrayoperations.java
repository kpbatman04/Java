package exercise.questions;

public class Arrayoperations {
    private  int[] numbers;

    public Arrayoperations(int[] numbers) {
        this.numbers = numbers;
    }

    class statistics{

        double mean(){
            double sum = 0;
            for (int num: numbers){
                sum+= num;
            }
            return sum/numbers.length;
        }
        double medin(){
            return 0;
        }
    }
}
