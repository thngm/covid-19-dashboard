package ScheduledThreadPool;

import java.util.Date;

class Task implements Runnable
{
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    public void run() 
    {
        try {
            System.out.println( getName() + " - Time -> " + new Date());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
