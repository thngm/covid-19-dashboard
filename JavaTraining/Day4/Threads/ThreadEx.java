package ThreadEx;

public class ThreadEx extends Thread{
	
	
	    private int number;
	    Resource  resource;
	 
	    // Receives a number and a resource obj
	    ThreadEx(int no,  Resource obj)
	    {
	        number = no;
	        resource = obj;
	    }
	 
	    public void run()
	    {
	        // Only one thread can send a message
	        // at a time.
	        synchronized(resource)
	        {
	            // synchronizing the resource object
	            resource.send(number);
	        }
	    }
	

}
