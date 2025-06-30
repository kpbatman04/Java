package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testinfCollections {
    public static void main(String[] args) {
        List<Integer>  numList = new ArrayList<>();
        numList.add(5);
        numList.add(-1);
        numList.add(2);
        numList.add(78);
        utility.print(numList);
        Collections.sort(numList);
        Collections.reverse(numList);
        utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(87);

    }
}
