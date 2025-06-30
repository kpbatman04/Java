package executor.Problems.question2;

public class printCurrentThread extends Thread {
    private final String name;

    public printCurrentThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread name is : "+ name);

    }
}
