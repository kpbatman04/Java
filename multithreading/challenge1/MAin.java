package multithreading.challenge1;

public class MAin {
    public static void main(String[] args) {
        Hellothread h1 = new Hellothread(1);
        Hellothread h2 = new Hellothread(2);
        h1.start();
        h2.run();

    }

}
