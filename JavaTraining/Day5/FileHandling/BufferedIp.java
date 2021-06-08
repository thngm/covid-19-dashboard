package IOStreams;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

class BufferedIp {
    public static void main(String[] args) {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\test.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + input.available());
            
            // Reads first byte from file
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}