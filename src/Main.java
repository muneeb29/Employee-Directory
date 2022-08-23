import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int Menu, ID, Age, Search, delID, updateID, updateAge;
		int count = 0;
		int countUpdate = 0;
		String Name, updateName;	
		boolean quit = false;
		
		ArrayList<Employees> employeesList = new ArrayList<Employees>();

		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("");
			System.out.println("Select An Option");
			System.out.println("1 - Add Employee");
			System.out.println("2 - Search For Employee");
			System.out.println("3 - Update Employee");
			System.out.println("4 - Delete Employee");
			System.out.println("5 - Display All Employees");
			
			System.out.println("");
			
		System.out.println("Enter Choice: ");
		Menu = in.nextInt();
		
		String br1 = in.nextLine();
		
		System.out.println("You Have Selected: " + Menu);
		
		  switch (Menu){
          case 1:
        	
        	  System.out.println("");
        	  System.out.println("Enter ID: ");
        		  ID = in.nextInt();
        		  
        		  String br2 = in.nextLine();
        		  
        		  System.out.println("Enter Name: ");
        		  Name = in.nextLine();
        		  
        		  System.out.println("Enter Age: ");
        		  Age = in.nextInt();
        		 
        		  String br3 = in.nextLine();
        		  
        		  Employees emp = new Employees();
        		  
        		  
        		  if(ID > 0) {
        		  emp.setID(ID);
        		   count = 1;     		  
        		  }
        		  
        		  else if(ID <= 0) {
        			  System.out.println("ID must be greater than 0 ");
        		  }
        		  
        		  if(!Name.isEmpty() && Name.length() > 3) {
        			  emp.setName(Name);        			  
        			  count++;
        		  }
        		  
        		  else if(Name.isEmpty() || Name.length() < 3) {
        			  System.out.println("Name is too short");
        		  }
        		  
        		  
        		  if(Age >= 16) {
        			  emp.setAge(Age); 
        			  count++;
        		  }
        		  
        		  else if(Age < 16) {
        			  System.out.println("Age must be greater than 16");
        		  }
        		  
        		  
        		  
        		  if(count == 3) {
        		  employeesList.add(emp);
        		  count = 0;
        		  }        		  

              break;
          
          case 2:
        
        	    System.out.println("");
        		System.out.println("Enter Search ID: ");
        		Search = in.nextInt();
        		String br4 = in.nextLine();
        	    int check = 0; 
        	    
        	  for (Employees ep : employeesList) {
    			  check = ep.getID();  			  
    			
    			  if(Search == check) {
        			  System.out.println("Name: " + ep.getName());
        			  System.out.println("Age: " + ep.getAge());
         		  }
    			  
    			  else if(Search != check) {
    				  System.out.println("Employee does not exist");
    			  }
    			}
     		  
     		
              break;
              
          case 3:
        	 
        	  System.out.println("");
        	  System.out.println("Enter Update ID: ");
        		updateID = in.nextInt();
        		
        		 String br5 = in.nextLine();
        		 
        	  System.out.println("Enter Updated Name: ");
        		updateName = in.nextLine();
		
        	  System.out.println("Enter Updated Age: ");
        	  	updateAge = in.nextInt();
        	  
        	  	String br6 = in.nextLine();
        		
        	System.out.println(updateID);
        	
      		Iterator<Employees> itera = employeesList.iterator();
      	  
      		while (itera.hasNext()) 
      		{
      		    Employees empUp = itera.next();
      		    if(empUp.getID() == updateID){    				
    				
          		  if(!updateName.isEmpty() && updateName.length() > 3) {
          			  empUp.setName(updateName);      			  
        			  countUpdate++;
        		  }
        		  
        		  else if(updateName.isEmpty() || updateName.length() < 3) {
        			  System.out.println("Name is too short");
        		  }
          		  
        		  if(updateAge >= 16) {
        				empUp.setAge(updateAge);
        				countUpdate++;        				
        		  }
        		  
        		  else if(updateAge < 16) {
        			  System.out.println("Age must be greater than 16");
        		  }
          		 
        		if(countUpdate == 2) {
            		System.out.println("Employee " + updateID + " has been updated");
            		countUpdate = 0;
            		  } 
   				    			
         		  }
      		  
      		  
  			}
        	 
        	  break;
         
          
          case 4:
        	 
        	System.out.println("");  
      		System.out.println("Enter Delete ID: ");
      		delID = in.nextInt();
      		
      		 String br7 = in.nextLine();
      		
      		Iterator<Employees> iter = employeesList.iterator();
  
      		while (iter.hasNext()) 
      		{
      		    Employees empDel = iter.next();
      		  if(empDel.getID() == delID){
    				iter.remove();
    				System.out.println("Employee " + delID + " has been deleted");
         		  }
      		  
      		  else if(empDel.getID() != delID){
      			  System.out.println("Employee does not exist");
      		  }
      		  
  			}
          	  	  
        	  break;
        	
          case 5:
        	
        	  if(employeesList.size() >= 1) {
        	  
        	  for (Employees allEmp : employeesList) {
        		  System.out.println("");
        		  System.out.println("Employee Details");
    			  System.out.println("ID: " + allEmp.getID() + " Name: " + allEmp.getName() + " Age: " + allEmp.getAge()); 	
        	  }
        	  }
        	  
        	  else {
        		  System.out.println("No Employees in directory");
        	  }
        	  
        	  break;
        	  
        	  
          default:
              System.out.println("Invalid Option");
              break;

	}
		}
	
	while(!quit);
	}
}
