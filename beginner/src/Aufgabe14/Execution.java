package Aufgabe14;

public class Execution {
	private static final long EmployeeID = 123456;
	private static final long numberOfEmployees = 200;
	private static final int hoursPerWeek = 40;

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		
		Employee emp1 = new Employee();
		emp1.display();
		System.out.println("Employee ID is: " + EmployeeID);
		
		Manager mng1 = new Manager();
		System.out.println("Number of Employees is: " + numberOfEmployees);
		
		Assistant ast1 = new Assistant();
		System.out.println("The Hours worked per week is: " + hoursPerWeek);
}
}
