package IOStreams;

import java.io.FileReader;
//Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
class FileWriterReader 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			
			String str = "FileWriter and FileReader";
	
			// attach a file to FileWriter
			FileWriter fw=new FileWriter("output.txt");
	
			// read character wise from string and write
			// into FileWriter
			for (int i = 0; i < str.length(); i++)
				fw.write(str.charAt(i));
	
			System.out.println("Writing successful");
			//close the file
			fw.close();
			
	        int ch;
	  
	        FileReader fr = new FileReader("output.txt");
	        
	        System.out.println("reading file ");
	      
	        // read from FileReader till the end of file
	        while ((ch=fr.read())!=-1)
	            System.out.print((char)ch);
	  
	        // close the file
	        fr.close();
		}
		catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
}
