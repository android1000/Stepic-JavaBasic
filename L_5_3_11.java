import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class L_5_3_11 {
    public static void main(String[] args) {
        try (InputStream inputStream = new ByteArrayInputStream(new byte[] { 48, 49, 50, 51})) {
            System.out.println(readAsString(inputStream, Charset.forName("US-ASCII")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Charset.defaultCharset();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder s = new StringBuilder();
        int read;
        while ((read = inputStreamReader.read()) > 0) {
            s.append((char) read);
        }
        return s.toString();
    }
}

