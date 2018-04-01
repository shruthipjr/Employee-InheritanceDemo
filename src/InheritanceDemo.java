
public class InheritanceDemo {

	public static void main(String[] args)
	{
		Employee emp = new Employee("Joe Worker", 
				new Date("January",1,2015));
		
		
		HourlyEmployee joe = new HourlyEmployee("Joe Worker", 
								new Date("January",1,2015),
								50.50,160);
		
		
		
			
			
		
		System.out.println("joe's longer name is " +
							joe.getName());
		
		System.out.println("Changing joe's name to Josephine.");
		joe.setName("Josephine");
		
		System.out.println("joe's record is as follows:");
		System.out.println(joe);
		showEmployee(joe);
		
		System.out.println(" checking equal "+ emp.equals(joe));
	}
	
	public static void showEmployee(Employee employeeObject)
	{
		System.out.println(employeeObject.getName());
		System.out.println(employeeObject.getHireDate());
	}
	
}
