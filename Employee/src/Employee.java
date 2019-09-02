
public class Employee
{
	private int id;
	private String employeeName;
	private int employeeAge;
	private int employeeSalary;
	

	public Employee(int id, String employeeName, int employeeAge, int employeeSalary)
	{
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public int getEmployeeAge()
	{
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge)
	{
		this.employeeAge = employeeAge;
	}

	public int getEmployeeSalary()
	{
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary)
	{
		this.employeeSalary = employeeSalary;
	}

}
