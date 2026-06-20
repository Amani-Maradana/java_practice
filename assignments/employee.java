package assignments;


public class employee {

	private String name;
	private int employeeId;
	private double salary;
	public employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public int getemployeeId() {
		return employeeId;
	}
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
	
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setname (String name) {
		this.name = name;
	}
	public void setsalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("ERROR, salary has to be positive value");
		}
	}
	
	public void displayemployeeInfo() {
		System.out.println("------------EmployeeINFO--------------");
		System.out.println("ID : "+employeeId);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
	public static void main(String[] args) {
		employee emp = new employee("amani",201067,76890);
		emp.displayemployeeInfo();
		
		emp.setname("M.Amani");
		emp.setemployeeId(1067);
		emp.setsalary(548500.0);
		
		emp.displayemployeeInfo();
		
	}
	
}
