package employeewagecomputationprob;
//Refactor to have list of multiple companies to manage Employee.
import java.util.*;
//Use of Interface
interface IEmpWageComputation
{
	public void addCompanyEmpWage(String Company,int WagePerHr,int Month,int MaxWorkingHrs);
	public void CalculateWage();
}

//program for manging employee for multiple companies
//class for salary computation
public class EmployeeWageComputation implements IEmpWageComputation
{
	public static final int FULL_TIME=1,PART_TIME=2;

	private static int COMPANY_COUNT=0;
	ArrayList<CompanyEmpWage>CompanyEmpWageList;

//Function for getting information about employee present or absent 
	static int Attendance_Of_Employee()
	{
		int Present_Or_Absent=(int)Math.floor(Math.random()*10)%3;
		return Present_Or_Absent;
	}
//function for getting information about how much hours employee worked
	static int getWorkingHrs(int Present_Or_Absent)
	{
		int workingHrs;
		switch(Present_Or_Absent)
		{
				case FULL_TIME:
					workingHrs=8;
					break;
				case PART_TIME:
					workingHrs=8;
					break;
				default:
					workingHrs=0;
		}

		return workingHrs;
	}
//Show Company employee wage information into array
@Override
	public void CalculateWage()
	{
		for(CompanyEmpWage list:CompanyEmpWageList)
		{
			list.setTotalWage(CalculateWage(list));
			list.show();
		}
	}
//Function for calculating Employee wage depending on how much hour employee actually work
	public int CalculateWage(CompanyEmpWage CompanyEmpWage)
	{
		int workingHrs=0,salary,totalSalary=0,totalWorkingHrs=0,day;
		for(day=1;day<=CompanyEmpWage.WORKING_DAYS_IN_MONTH && totalWorkingHrs<=CompanyEmpWage.MAX_WORKING_HRS;day++)
		{

			workingHrs=getWorkingHrs(Attendance_Of_Employee());

			if(totalWorkingHrs==96||totalWorkingHrs==94)
			{
				if (workingHrs==8)
				break;
			}
			else if(totalWorkingHrs==98)
			{
				break;
			}
			totalWorkingHrs+=workingHrs;
			salary=CompanyEmpWage.WAGE_PER_HRS*workingHrs;
			totalSalary+=salary;
		}

		return totalSalary;


	}
//ArrayObject
	public EmployeeWageComputation()
	{
	CompanyEmpWageList=new ArrayList<>();
	
	}
//Store information about company into array.
	@Override
	public void addCompanyEmpWage(String Company,int WagePerHr,int Month,int MaxWorkingHrs)
	{
		CompanyEmpWageList.add(new CompanyEmpWage(Company,WagePerHr,Month,MaxWorkingHrs));
		
	}
//main function
	public static void main(String[] args)
	{
		EmployeeWageComputation  EW=new EmployeeWageComputation();
		EW.addCompanyEmpWage("DATAMETICA",30,15,120);
		EW.addCompanyEmpWage("CLOUDERA",30,15,120);
		EW.CalculateWage();


	}
}
class CompanyEmpWage
{
	public final int WAGE_PER_HRS,WORKING_DAYS_IN_MONTH,MAX_WORKING_HRS;
	public int Total_Employee_Wage;
	public String COMPANY_NAME;

	public CompanyEmpWage(String Company,int WagePerHr,int Month,int MaxWorkingHrs)
	{
		this.COMPANY_NAME=Company;
		this.WAGE_PER_HRS=WagePerHr;
		this.WORKING_DAYS_IN_MONTH=Month;
		this.MAX_WORKING_HRS=MaxWorkingHrs;
	}

	public void setTotalWage(int totalSalary)
	{
		this.Total_Employee_Wage=totalSalary;
	}
//Show total employee salary for perticular company
	public void show()
	{
		System.out.println("Company Name : "+this.COMPANY_NAME+", Total Wage :"+this.Total_Employee_Wage);
	}

}


