package ThreadEx;

public class Main {
	public static void main(String args[])
    {
        Resource resource = new Resource();
        ThreadEx t1 = new ThreadEx( 5 , resource );
        ThreadEx t2 = new ThreadEx( 6 , resource );
        ThreadEx t3 = new ThreadEx( 7 , resource );
        ThreadEx t4 = new ThreadEx( 8 , resource );
        ThreadEx t5 = new ThreadEx( 9 , resource );
 
        // Start two threads 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
 
        // wait for threads to end
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }

}
