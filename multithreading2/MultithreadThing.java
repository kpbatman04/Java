package multithreading2;

public class MultithreadThing extends Thread implements Runnable{// or extends thread

    private int threadnumber1;
//    private int threadNumber;
    public MultithreadThing(int threadnumber1){
        this.threadnumber1 = threadnumber1;
//        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "from thread " + threadnumber1);
            if(threadnumber1 == 2){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
