public class EmployeeBuilderUC
{
	int IS_FULL_TIME=1;

	public String checkPresentOrAbsent(int empCheck)
	{
		if (empCheck == IS_FULL_TIME)
		{
			return "Employee Is Present...";
		}
		else
		{
			return "Employee Is Absent...";
		}

	}

	public static void main(String args[])
	{

		int empCheck =(int) Math.floor(Math.random() * 10) % 2;

		EmployeeBuilderUC eb = new EmployeeBuilderUC();
		System.out.println(eb.checkPresentOrAbsent(empCheck));

	}
}
