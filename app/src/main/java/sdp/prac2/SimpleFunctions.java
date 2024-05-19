package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public boolean Task5(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
            return false;
        }
    }
    return true;
    }
}
