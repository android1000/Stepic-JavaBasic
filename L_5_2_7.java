import java.io.*;

public class L_5_2_7 {
    public static void main(String[] args) {
        try (InputStream inputStream = new ByteArrayInputStream(new byte[] { 0x33, 0x45, 0x01})) {
            System.out.println(checkSumOfStream(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        int result = 0;
        while (read > 0) {
            result = Integer.rotateLeft(result, 1) ^ read;
            read = inputStream.read();
        }
        return result;
    }
}
