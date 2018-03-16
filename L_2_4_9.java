import java.util.Arrays;

public class L_2_4_9 {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) a3[i] = a1[i];
        for (int i = a1.length; i < a3.length; i++) a3[i] = a2[i - a1.length];
        Arrays.sort(a3);
        return a3;
    }


    public static void main(String[] args) {
        System.out.println(mergeArrays(new int []{0, 2, 2}, new int[] {1, 3}));
    }
}
