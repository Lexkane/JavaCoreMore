
public class old {
	private String name;
	private int rate;
	private double hours;
	public double salary;
	
	public static int count = 0;
	
	public Employee() {
		count++;
	}
	
	public Employee(String name) {
		this.name = name;
		count++;
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		count++;
	}
	
	public Employee(String name, int rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	//
	public Salary() {
		salary = rate * hours;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + salary + "]";
	}
	
	public double changeRate = salary * count;
	
	public double bonuses = salary * 0.1;
	
	public double totalSum = salary + bonuses;
	
	//public static void print() {
	//	System.out.println("" + bonuses);
	//}
	
}
