package employeewagecomputationprob;
//program to calculate employee wage.
public class EmployeeWageComputation {
	static final int PRESENT=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wecome to employee wage program");
  		int Random_No=(int) (Math.floor(Math.random()*10)%2);
  		
  		if(PRESENT==Random_No)
  		
  			System.out.println("Employee is present.");
  			
  		else
  			System.out.println("Employee is absent.");

 
	}

}
