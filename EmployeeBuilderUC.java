public class EmployeeBuilderUC
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private static String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeBuilderUC (String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public static int computeEmpWage()
	{
		//Variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;

		//Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{

			totalWorkingDays++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck)
			{
				case IS_PART_TIME:
						empHrs = 4;
						break;
				case IS_FULL_TIME:
						empHrs = 8;
						break;
				default:
						empHrs = 0;
						break;
			}

			totalEmpHrs += empHrs;
			System.out.println("Day# :" + totalWorkingDays + "Emp Hrs: " + empHrs);
		}

		totalEmpWage = totalEmpHrs * empRatePerHour;
		return totalEmpWage;
	}

	@Override
	public String toString()
	{

		return "Total Emp Wage for Company : " + company + "is: " + totalEmpWage;
	}

	public static void main(String args[])
	{
		EmployeeBuilderUC dMart = new EmployeeBuilderUC("DMart", 20, 2, 10);
		EmployeeBuilderUC reliance = new EmployeeBuilderUC("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
