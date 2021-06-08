
public class Student extends Person
{
    private int rollNo;
    private String dept;
    private double cgpa;
    
    public Student(String name,int rollNo,long phoneNo,int age,String dept,double cgpa)
    {
        super(name,phoneNo,age);
        this.rollNo=rollNo;
        this.dept=dept;
        this.cgpa=cgpa;
    }
   
    //getter method for rollno
    public int getRollNo()
    {
        return this.rollNo;
    }
    
    //getter method for dept
    public String getDept()
    {
        return this.dept;
    }
  //getter method for cgpa
    public double getCgpa()
    {
        return this.cgpa;
    }
    
    //method to display details of staff
    public void printInfo()
    {
    	System.out.println("Student Details");
    	System.out.println("Name :"+getName());
    	System.out.println("roll no :"+getRollNo());
    	System.out.println("phone no :"+ getPhoneNo());
    	System.out.println("Age :"+getAge());
    	System.out.println("Dept :"+getDept());
    	System.out.println("CGPA:"+ getCgpa());
    }
    
}