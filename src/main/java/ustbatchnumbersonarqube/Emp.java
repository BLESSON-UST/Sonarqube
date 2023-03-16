package ustbatchnumbersonarqube;

public class Emp {
	private String name;
	private int age;
	private int exp;
	private double salary;
	public Emp(String name, int age, int exp, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.salary = salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getexp() {
		return exp;
	}
	public void setexp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", exp=" + exp + ", salary=" + salary + "]";
	}
	

}
