package employeewagecomputationprob;
//program to calculate employee wage.
public class EmployeeWageComputation {
	static final int PRESENT=1,WAGE_PER_HOUR=20,FULL_TIME=1,PART_TIME=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Worked_Hrs=0, Day_Salary_Of_Employee=0;
		System.out.println("Wecome to employee wage program");
  		//int Random_No=(int) (Math.floor(Math.random()*10)%2);
  		//checking employee is present or absent
		int Job_Type=(int) (Math.floor(Math.random()*10)%3);
  		switch(Job_Type)
  		{
  			case FULL_TIME:  				
  	  			System.out.println("Employee is present full time.");
  	  			Worked_Hrs=8;
  	  			break;
  			case PART_TIME:  			  		
  	  			System.out.println("Employee is present part time.");
	  			Worked_Hrs=4;
	  			break;
  	  		default:
  	  			System.out.println("Employee is absent.");
  		}	
  			 
  		//computing employee wage for one day
  		Day_Salary_Of_Employee=WAGE_PER_HOUR*Worked_Hrs;
  		System.out.println("Your one day salary creadited to your account, rupees " +Day_Salary_Of_Employee);
	}

}
