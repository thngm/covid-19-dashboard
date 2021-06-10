package IOStreams;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOpStream {
    public static void main(String[] args) {

        String data = "Buffered Output Stream";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}