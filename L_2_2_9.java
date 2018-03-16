public class L_2_2_9 {

    public static boolean isPowerOfTwo(int value) {
        value=java.lang.Math.abs(value);
        return (value > 0) && ((value & (value - 1)) == 0);
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }
}
