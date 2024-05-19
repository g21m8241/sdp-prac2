package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    //Task 1
    public int sumElementsByIndexes(List<Integer> a, List<Integer> b){
        int sum= 0;
        for (Integer index : b){
            if(index >=0 && index < a.size()){
                sum += a.get(index);
            }
        }
        return sum;
    }
}
