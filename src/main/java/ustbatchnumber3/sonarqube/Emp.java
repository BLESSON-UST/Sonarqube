package ustbatchnumber3.sonarqube;

public class Emp {
	private String e_name;
	private int e_age;
	private int e_exp;
	private double salary;
	public Emp(String e_name, int e_age, int e_exp, int salary) {
		super();
		this.e_name = e_name;
		this.e_age = e_age;
		this.e_exp = e_exp;
		this.salary = salary;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_age() {
		return e_age;
	}
	public void setE_age(int e_age) {
		this.e_age = e_age;
	}
	public int getE_exp() {
		return e_exp;
	}
	public void setE_exp(int e_exp) {
		this.e_exp = e_exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "Emp [e_name=" + e_name + ", e_age=" + e_age + ", e_exp=" + e_exp + ", salary=" + salary + "]";
	}
	

}
