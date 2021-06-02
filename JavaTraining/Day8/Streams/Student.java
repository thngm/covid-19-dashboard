package Java8Ex;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private String address;
	private String gender;
	private LocalDate dob;
	private int age;
	private int mark;
	
	Student(int id,String name,String address,String gender,String dob,int marks){
		this.id=id;
        this.name=name;
        this.address=address;
        this.gender=gender;
        String[] splitDate=dob.split("-");
        Integer day=Integer.parseInt(splitDate[0]);
        Integer month=Integer.parseInt(splitDate[1]);
        Integer yr=Integer.parseInt(splitDate[2]);
        this.dob=LocalDate.of(yr,month,day);
        this.mark=marks;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
	@Override
    public String toString() {
        return "Student [ name=" + this.name + ", age=" + this.age +"Address " +this.address +" Gender "+this.gender+" Date of Birth "+this.dob+"]";
    }
	
	
	
	

}
