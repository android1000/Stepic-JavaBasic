public class L_2_1_15 {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);// put your implementation here
    }

    public static void main(String[] args) {
        System.out.println(flipBit(12,1));
    }
}
