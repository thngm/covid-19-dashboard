package IOStreams;

import java.io.ByteArrayInputStream;
public class ByteArrIp {
	  public static void main(String[] args) {

	    // Creates an array of byte
	    byte[] array = {1, 2, 3, 4};

	    try {
	      ByteArrayInputStream input = new ByteArrayInputStream(array);
	      
	      // Returns the available number of bytes
	      System.out.println("Available bytes at the beginning: " + input.available());
	      input.skip(2);
	      
	      System.out.println("Available bytes now: " + input.available());
	      

	      System.out.print("The bytes read from the input stream: ");

	      int n = input.available();
	      
	      for(int i= 0; i <n; i++) {

	        // Reads the bytes
	        int data = input.read();
	        System.out.print(data + " ");
	      }
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
	}