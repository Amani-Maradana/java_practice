package assignments;

public class employe {

	private int id;
	private String name;
	private double salary;

	public employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// id - set and get
	public int getid() {
		return id;
	}

	public void setid(int id) {
		if (id < 0) {
			System.out.println("invalid id");
		} else {
			this.id = id;
		}
	}

	// name set and get
	public String getname() {
		return name;
	}

	public void setname(String name) {
		if (name == "null" || name == " ") {
			System.out.println("invalid name");
		} else {
			this.name = name;
		}
	}

	// salary get and set
	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		if (salary < 0) {
			System.out.println("invalid salary");
		} else {
			this.salary = salary;
		}

	}

	public static void main(String [] args) {
		employe emp = new employe(1067,"amani",1387);
		System.out.println("employee id : "+emp.getid());
		System.out.println("employee name : "+emp.getname());
		System.out.println("employee salary : "+emp.getsalary());
		emp.setid(312);
		emp.setname("mahi");
		emp.setsalary(34324);
		System.out.println("employee id : "+emp.getid());
		System.out.println("employee name : "+emp.getname());
		System.out.println("employee salary : "+emp.getsalary());
		
	}
}


