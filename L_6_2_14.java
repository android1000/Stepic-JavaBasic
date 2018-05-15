import java.util.*;

public class L_6_2_14 {
    public static void main(String[] args) {
        int[] arrA=new int[]{1,2,3};
        int[] arrB=new int[]{0,1,2};
        System.out.println(arrB);
        Set setA= new HashSet(Arrays.asList(arrA));
        Set setB= new HashSet(Arrays.asList(arrB));
        Set setC=symmetricDifference(setA,setB);
        for(Object el: setC){
            System.out.println(el.toString());
        }
        System.out.println(setC.toArray());
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> resSet = new HashSet<>(set1);
        for (T t: set2){
            if (resSet.contains(t)) {
                resSet.remove(t);
            } else {
                resSet.add(t);
            }
        }
        return resSet;
    }
}
