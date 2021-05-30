package SingleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThread {

   public static void main( String[] args)  {
      ExecutorService executor = Executors.newSingleThreadExecutor();

      try 
      {
         executor.submit(new Action());
         System.out.println("Shutdown executor");
         //shutting down
         executor.shutdown();
         executor.awaitTermination(5, TimeUnit.SECONDS);
      } 
      catch (InterruptedException e) 
      {
    	 System.out.println("tasks interrupted");
      } 
      finally 
      {

         executor.shutdownNow();
         System.out.println("shutdown finished");
      }
   }

}