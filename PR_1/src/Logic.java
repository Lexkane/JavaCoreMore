
public class Logic {
	public static void main(String[] args) {
		Employee Emp1 = new Employee();
			Emp1.setName("Dan");
			Emp1.setRate(1200);
			Emp1.setHours(6.5);
			
		Employee Emp2 = new Employee("Jo");
			Emp2.setRate(1310);
			Emp2.setHours(4.5);
			
		Employee Emp3 = new Employee("Dan", 1130);
			Emp3.setHours(7.0);
			
		Employee Emp4 = new Employee("Dan", 1500, 13.6);
		
		System.out.println(Emp1);
		System.out.println(Emp2);
		System.out.println(Emp3);
		System.out.println(Emp4);
		System.out.println();
		System.out.println(Employee.getTotalSum());
	}
}
