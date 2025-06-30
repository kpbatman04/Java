package multithreading2.practice.question2;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Crate the thread %s\n",t1.getState());
        t1.start();
        t1.join(); // to wait till the thread is not terminating
        System.out.printf("Thread finished %s",t1.getState());
    }
}
