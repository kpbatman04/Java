package executor.future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\nGetting full name of %s from server",name);
        Thread.sleep(2000);
        return name+" Prajapati";
    }
}
