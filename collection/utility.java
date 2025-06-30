package collection;

import java.util.Collection;

public class utility {
    public static<E> void print(Collection<E> collection) {
        System.out.println("Collection is");
        for (E e : collection) {
            System.out.printf("%s ",e);
        }
        System.out.println();
    }
}
