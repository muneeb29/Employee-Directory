
public class Employees {
    private int ID;
    private String Name;
    private int Age;
    
	public Employees(){
	this.ID = ID;
	this.Name = Name;
	this.Age = Age;
 
	}


	public Employees(int ID, String Name, int Age){
	this.ID = ID;
	this.Name = Name;
	this.Age = Age;
	  
	}
	
	public void setID(int empID) {
		this.ID = empID;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String empName) {
		this.Name = empName;
	}
	
	public String getName() {
		return Name;
	}
	
	
	public void setAge(int empAge) {
		this.Age = empAge;
	}
	
	public int getAge() {
		return Age;
	}
	
	
}
