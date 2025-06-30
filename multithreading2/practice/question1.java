package multithreading2.practice;

public class question1 extends Thread    {
    private int ThreadNum;
    public question1(int ThreadNum){
        this.ThreadNum = ThreadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hello from Thread "+ ThreadNum);
        }
    }

    public static void main(String[] args) {
        question1 thread1 = new question1(1);
        question1 thread2 = new question1(2);

        thread1.start();
        thread2.start();

    }
}
