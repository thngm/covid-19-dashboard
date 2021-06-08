package IOStreams;


import java.io.FileInputStream;

public class FileIpStream {

  public static void main(String args[]) {

     try {
        FileInputStream input = new FileInputStream("C:\\Users\\thngm\\eclipse-workspace\\Practice\\src\\JsonEx\\test.txt");

        System.out.println("Available bytes at the beginning: " + input.available());
        System.out.println("Data in the file: ");
      

        // Reads the first byte
        int i = input.read();
        System.out.println("Available bytes after 1 read: " + input.available());
        
        //skips 2 bytes
        input.skip(2);
        System.out.println("Input stream after skipping 2 bytes:");
        
      
        while(i != -1) {
           System.out.print((char)i);

           // Reads next byte from the file
           i = input.read();
        }
        input.close();
     }

     catch(Exception e) {
        e.getStackTrace();
     }
  }
}
