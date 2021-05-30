package ScheduledThreadPool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExec {
	
	    public static void main(String[] args) 
	    {
	        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
	        Task task1 = new Task ("Task 1");
	        Task task2 = new Task ("Task 2");
	        Task task3 = new Task ("Task 3");
	        
	         
	        System.out.println(" time : " + new Date());
	         
	        executor.schedule(task1, 5 , TimeUnit.SECONDS);
	        
	        
	        executor.scheduleAtFixedRate(task2, 6, 8,TimeUnit.SECONDS);
	        
	        executor.scheduleWithFixedDelay(task3, 5, 5,TimeUnit.SECONDS);

	         
	        try 
	        {
	              executor.awaitTermination(1, TimeUnit.DAYS);
	        } 
	        catch (InterruptedException e)
	        {
	              e.printStackTrace();
	        }
	         
	        executor.shutdown();
	    
	}
	 

}
