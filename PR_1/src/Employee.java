
public class Employee {
	private String name;
	private int rate;
	private double hours;
	
	private static double totalSum;
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
		totalSum += salary();
	}
	
	public double salary() {
		return rate*hours;
	}
	
	public double bonus() {
		return salary()*0.1;
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
		totalSum -= salary();
		this.rate = rate;
		totalSum += salary();
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		totalSum -= salary();
		this.hours = hours;
		totalSum += salary();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + salary() + "]";
	}
	
	public static double getTotalSum() {
		return totalSum*1.1;
	}
	
}
