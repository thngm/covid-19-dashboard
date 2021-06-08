

public class Staff extends Person
{
    private int id,salary;
    
    public Staff(String name,int id,long phoneNo,int age,int salary)
    {
    	super(name,phoneNo,age);
        this.id=id;
        this.salary=salary;
    }
   
    //getter method for id
    public int getId()
    {
        return this.id;
    }
    
    //getter method for salary
    public int getSalary()
    {
        return this.salary;
    }
    
    //method to display details of staff
    public void printInfo()
    {
    	System.out.println("Staff Details");
    	System.out.println("Name :"+getName());
    	System.out.println("roll no :"+getId());
    	System.out.println("phone no :"+ getPhoneNo());
    	System.out.println("Age :"+getAge());
    	System.out.println("Dept :"+getSalary());
    }
    
    
}