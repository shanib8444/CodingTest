import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		float sum=0,i=0;
        List<Employee> employeeDetails=Arrays.asList(new Employee(101,"RAMRAJYA YADAV", 28, 2000),new Employee(101,"RAMRAJYA YADAV", 28, 2000),
        		new Employee(102,"RAMAKANT MISHRA", 30, 3000),
        		new Employee(103,"ANIL KUMAR SHARMA ", 38, 4000),
        		new Employee(104,"NISHANT VINJOLIYA", 44, 2000),
        		new Employee(105,"MEENA MISHRA", 60, 3800),
        		new Employee(106,"RAVISHANKAR ARYA ", 36, 2500),
        		new Employee(107,"ANAND CHOUDHARI", 32, 3500),
        		new Employee(108,"TANVEER AKHTER", 42, 3500),
        		new Employee(109,"NEELAM CHANDRA JAIN", 46, 3500),
        		new Employee(110,"KOMAL PRASAD THAKUR", 55, 3500));
        System.out.println("Employee Details");
		System.out.println("----------------");
       for(Employee details:employeeDetails)
       {
    	   
    	   
		  
    	   
    	   if(details.getEmployeeSalary()>3000)
    	   {
    		   i+=1;
    		   sum=sum+details.getEmployeeAge();
    		   System.out.println("Name:"+details.getEmployeeName());
    		   System.out.println("Age:"+details.getEmployeeAge());
    		   System.out.println("Salary:"+details.getEmployeeSalary());
    		   System.out.println("--------------------------");
    		   
    	   }
    	   
       }
      
       System.out.println("Mean Age:"+sum/i);
        
        
	}
}
