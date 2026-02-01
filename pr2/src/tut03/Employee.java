package tut03;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary * 12;
	}
	public int raiseSalary(int percent) {
	    salary += salary * percent / 100;
	    return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public static void main(String[] args) {
	    Employee e1 = new Employee(1, "Viet", "Trinh", 12000);

	    System.out.println(e1);                     // in thông tin ban đầu
	    System.out.println("Annual salary: " + e1.getAnnualSalary());

	    e1.raiseSalary(10);                         // tăng lương 10%
	    System.out.println("After raise: " + e1);   // kiểm tra lương mới
	}

}
