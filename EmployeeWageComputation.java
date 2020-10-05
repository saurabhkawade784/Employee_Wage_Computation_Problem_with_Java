package employeewagecomputationprob;
//program to show ability to save Total Wage for each company.
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWageComputation
{
	public static final int FULL_TIME=1,PART_TIME=2;
	public static int COMPANY_COUNT=0;
	private final int TOTAL_EMPLOYEE_WAGE,WAGE_PER_HRS,WORKING_DAYS_IN_MONTH,MAX_WORKING_HRS;
	public String COMPANY_NAME;
//Function to check employee present or absent or full_time or Part_time.
	static int checkEmployeeAttendance()
	{
		int Present_Or_Absent=(int)Math.floor(Math.random()*10)%3;
		//returns value of above arithmetic computation
		return Present_Or_Absent;
	}
//use static function to check employee working hours
	static int getWorkingHrs(int Present_Or_Absent)
	{
		int Worked_Hrs;
		switch(Present_Or_Absent)
		{
				case FULL_TIME:
					Worked_Hrs=8;
					break;
				case PART_TIME:
					Worked_Hrs=8;
					break;
				default:
					Worked_Hrs=0;
		}
		//returns value

		return Worked_Hrs;
	}
//Function for calculating total employee wage
	public int CalculateEmployeeWage()
	{
		int Worked_Hrs=0,salary,Total_Employee_Salary=0,totalWorkingHrs=0,day;
		for(day=1;day<=this.WORKING_DAYS_IN_MONTH && totalWorkingHrs<=this.MAX_WORKING_HRS;day++)
		{

			Worked_Hrs=getWorkingHrs(checkEmployeeAttendance());

			if(totalWorkingHrs==96||totalWorkingHrs==94)
			{
				if (Worked_Hrs==8)
				break;
			}
			else if(totalWorkingHrs==98)
			{
				break;
			}
			totalWorkingHrs+=Worked_Hrs;
			salary=this.WAGE_PER_HRS*Worked_Hrs;
			Total_Employee_Salary+=salary;
		}
		COMPANY_COUNT++;
		return Total_Employee_Salary;


	}

	public EmployeeWageComputation(String Company,int WagePerHr,int Month,int MaxWorkingHrs)
	{
		this.COMPANY_NAME=Company;
		this.WAGE_PER_HRS=WagePerHr;
		this.WORKING_DAYS_IN_MONTH=Month;
		this.MAX_WORKING_HRS=MaxWorkingHrs;
		this.TOTAL_EMPLOYEE_WAGE=CalculateEmployeeWage();
		this.show();
	}

	public void show()
	{
		System.out.println("Company Name : "+this.COMPANY_NAME+", Total Wage :"+this.TOTAL_EMPLOYEE_WAGE);
	}

	public static void main(String[] args)
	{
		EmployeeWageComputation EWc1=new EmployeeWageComputation("DataMetica",30,15,120);
		EmployeeWageComputation EWc2=new EmployeeWageComputation("CloudEra",30,15,120);
	}
}