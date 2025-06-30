package multithreading2;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultithreadThing mything  = new MultithreadThing(i);
//            Thread myThread = new Thread(mything);// while using runnable
//           myThread.start();
            mything.run();
            System.out.println(mything.isAlive());//so that new thread will run not .run
            try {
                mything.join();// so that the running thread can complete its wor
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        MultithreadThing mything  = new MultithreadThing();
//        MultithreadThing mything2  = new MultithreadThing();
//        mything.run(); //so that new thread will run not .run
//        mything2.run(); //so that new thread will run not .run
    }
}
