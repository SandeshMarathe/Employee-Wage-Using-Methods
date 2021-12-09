public class EmployeeBuilderUC
{
	int IS_PART_TIME=1;
	int IS_FULL_TIME=2;
	int EMP_RATE_PER_HOUR=20;

	public int checkPresentOrAbsent(int empCheck)
	{
		int empHrs=0;
		int empWage=0;

		if (empCheck == IS_PART_TIME)
		{
			empHrs=4;
		}
		else if (empCheck == IS_FULL_TIME)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage = empHrs*EMP_RATE_PER_HOUR;

		return empWage;

	}

	public static void main(String args[])
	{

		int empCheck =(int) Math.floor(Math.random() * 10) % 3;

		EmployeeBuilderUC eb = new EmployeeBuilderUC();
		System.out.println("Emp Wage : "+eb.checkPresentOrAbsent(empCheck));

	}
}
