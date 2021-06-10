
public class Person {
	
	int age;
	long phoneNo;
	String name;
	
	Person(String name,long phoneNo,int age)
	{
		this.name=name;
		this.phoneNo=phoneNo;
		this.age=age;
	}
	
	//getter method for name
    public String getName()
    {
        return this.name;
    }
    
    //getter method for phoneno
	public long getPhoneNo()
    {
        return this.phoneNo;
    }
    
	//getter method for age
    public int getAge()
    {
        return this.age;
    }

}
