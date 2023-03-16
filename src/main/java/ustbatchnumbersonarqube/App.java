package ustbatchnumbersonarqube;

import java.util.Arrays;
import java.util.List;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;


/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Emp e1 = new Emp("Blesson", 25, 2, 40000);
		Emp e2 = new Emp("Adarsh", 26, 4, 50000);
		Emp e3 = new Emp("Sreejith", 27, 6, 70000);
		Emp e4 = new Emp("Chris", 38, 13, 200000);
		List<Emp> details = Arrays.asList(e1, e2, e3, e4);
	
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		for (Emp k : details)

			myout.println(k);

		for (Emp i : details) {
			if (i.getexp() >= 0 && i.getexp() < 3) {
				i.setSalary(i.getSalary() + (i.getSalary() * .025));
			} else if (i.getexp() >= 3 && i.getexp() < 6) {
				i.setSalary(i.getSalary() + (i.getSalary() * .05));
			} else if (i.getexp() >= 6 && i.getexp() <= 10) {
				i.setSalary(i.getSalary() + (i.getSalary() * .10));
			} else if (i.getexp() > 10) {
				i.setSalary(i.getSalary() + (i.getSalary() * .12));
			}
		}
		for (Emp k : details)
			myout.println(k);
		myout.close();
	}

}
