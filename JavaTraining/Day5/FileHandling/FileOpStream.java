package IOStreams;

import java.io.FileOutputStream;

public class FileOpStream {
    public static void main(String[] args) {
        
        String data = "Powers Rangers spd";

        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\test.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);
            
            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}