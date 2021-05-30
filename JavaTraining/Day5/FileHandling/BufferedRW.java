package IOStreams;

import java.io.*;

public class BufferedRW {
    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "four"};
        try {
            File file = new File("buffered.txt");
            FileWriter fileWriter = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Connect the FileWriter to the BufferedWriter

            for (String s : list) {
                bufferedWriter.write(s + "\n");
            }
            System.out.println("writing completed ");
            bufferedWriter.close (); // Close the stream

			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("buffered.txt"))); // Connect the FileReader to the BufferedReader

			String line;
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // Display file contents 
			}
            
			
			bufferedReader.close(); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}