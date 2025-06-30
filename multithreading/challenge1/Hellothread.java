package multithreading.challenge1;

public class Hellothread extends Thread{

    private final int threadNumber;
    public Hellothread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.printf("%d  hello from Thread-%d\n",i+1,threadNumber);
        }
    }

}
