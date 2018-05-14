import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (byte b : "Ы".getBytes(StandardCharsets.UTF_8)){
            System.out.printf("%d ", Byte.toUnsignedInt(b));
        }
    }
}
