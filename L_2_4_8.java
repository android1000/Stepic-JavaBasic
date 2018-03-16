import java.math.BigInteger;

public class L_2_4_8 {

    public static BigInteger factorial(int value) {
        BigInteger res=BigInteger.valueOf(1);;
        for (int i=2;i<=value;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(factorial(30));
    }
}
