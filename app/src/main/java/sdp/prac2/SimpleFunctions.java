package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
<<<<<<< HEAD

    public boolean Task5(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
            return false;
        }
    }
    return true;
=======
    //Task 1
    public int sumElementsByIndexes(List<Integer> a, List<Integer> b){
        int sum= 0;
        for (Integer index : b){
            if(index >=0 && index < a.size()){
                sum += a.get(index);
            }
        }
        return sum;
>>>>>>> origin/g20m1710
    }
}
