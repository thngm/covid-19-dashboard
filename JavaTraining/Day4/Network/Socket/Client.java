package ClientServerCalci;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		String inp=" ";
		
		Scanner sc = new Scanner(System.in);

		//  Open the socket connection.
		Socket s = new Socket("localhost", 9999);

		// Communication-get the input and output stream
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		System.out.print("client side ");

		while (!inp.equals("exit"))
		{
			
            System.out.println("Expression :");
			inp = sc.nextLine();
            			
          
			// send the expression to server
			dos.writeUTF(inp);
			dos.flush();

			// wait till request is processed and sent back to client
			String ans = dis.readUTF();
			System.out.println("Answer=" + ans);
		}
	}
}
