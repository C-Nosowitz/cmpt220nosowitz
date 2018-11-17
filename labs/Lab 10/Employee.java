
public abstract class Employee {	
	
	String name;	
	double age;     
	double hourRate;     
	 
    public abstract double salary(double hours); 

    public String toString() {  
    	return "name= " + name + " age=" + age + " hourRate=" + hourRate;      
    	} 
    }



class Manager extends Employee {
	

	
	@Override
	public double salary(double hours) {		
		return 0;
	}	
}
class Clerk extends Employee {
	

	

	@Override
	public double salary(double hours) {		
		return 0;
	}	
}


public class Test {
	public static void main(String args[]) {                    
		Emplyee vec[] = {     
				new Manager("John", 52, 104),      
				new Clerk("Daniel", 26, 110),      
				new Manager("Steve", 42, 120),     
				new Manager("Stacey", 34, 120)};        
		double hours[] = {140,150,130,180};        
		double total = 0;        
		for (int index = 0; index < vec.length; index++){                 
			total += vec[index].salary(hours[index]);           
			System.out.println(vec[index]);        }       
		System.out.println("The total payment of the employees is " + total);   
		} 
	} 


