package multithreading2.practice.question3;

public class printThread extends Thread{
    private  int Threadnumber;
    public printThread(int Threadnumber) {
        this.Threadnumber = Threadnumber;
    }

    @Override
    public void run() {
        System.out.printf("\n%s Thread starting-%d",Thread.currentThread().getName(),Threadnumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n%s Thread ended-%d",Thread.currentThread().getName(),Threadnumber);

    }
}
