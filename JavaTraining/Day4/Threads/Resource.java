package ThreadEx;

//synchronised resource
public class Resource {
	
	public void send(int no)
    {
        System.out.println("Number : "  + no );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
       
        
        System.out.println(no+10 + "<-- After adding 10  "  );
    }

}
