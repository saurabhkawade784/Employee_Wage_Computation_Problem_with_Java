package employeewagecomputationprob;
//program to calculate employee wage.
public class EmployeeWageComputation {
	public static final int PRESENT=1,WAGE_PER_HOUR=20,FULL_TIME=1,PART_TIME=0,WORKING_DAYS_IN_MONTH=20,MAX_WORKING_HRS=100;
	public static int computeEmpWage(){
		// TODO Auto-generated method stub
		
		int Worked_Hrs=0, Day_Salary_Of_Employee=0,Month_Salary_Of_Employee=0;
		int Emp_Worked_hrs=0,i,Salary,Total_Salary_Of_Employee=0;
		System.out.println("Wecome to employee wage program");
  		//int Random_No=(int) (Math.floor(Math.random()*10)%2);
  		//checking employee is present or absent
	for(i=1;i<=WORKING_DAYS_IN_MONTH && Emp_Worked_hrs<= MAX_WORKING_HRS;i++)
	{
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
  		
  		if(Emp_Worked_hrs==96||Emp_Worked_hrs==94)
  		{
  			if(Worked_Hrs==8)
  				break;
  		}
  		else if(Emp_Worked_hrs==98)
  		{
  			break;
  		}
  		Emp_Worked_hrs+=Worked_Hrs;
  		Salary=WAGE_PER_HOUR*Worked_Hrs;
  		Total_Salary_Of_Employee+=Salary;
  	}	
		System.out.println("Total salary of employee for 100hrs and 20days, rupees " +Total_Salary_Of_Employee);
  		//computing employee wage for one day
  		Day_Salary_Of_Employee=WAGE_PER_HOUR*Worked_Hrs;
  		System.out.println("Your one day salary creadited to your account, rupees " +Day_Salary_Of_Employee);
  		//computing employee wage for month
  		Month_Salary_Of_Employee=WORKING_DAYS_IN_MONTH*Day_Salary_Of_Employee;
  		System.out.println("Your one day salary creadited to your account, rupees " +Month_Salary_Of_Employee);
		return Total_Salary_Of_Employee;
	
	}


public static void main(String[] args) {
	
	computeEmpWage();
	
}
}