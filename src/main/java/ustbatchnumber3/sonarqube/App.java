package ustbatchnumber3.sonarqube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Emp e1 = new Emp("Blesson", 25, 2, 40000);
        Emp e2 = new Emp("Adarsh",26,4,50000);
        Emp e3 = new Emp("Sreejith",27,6,70000);
        Emp e4 = new Emp("Chris",38,13,200000);
        List<Emp> details= Arrays.asList(e1,e2,e3,e4);
        System.out.println(details);
        List<Emp> updates=details.stream().peek(k->{
			if((k.getE_exp()>=0)&&(k.getE_exp()<3))
				k.setSalary(k.getSalary()+(0.025)*k.getSalary());
			else if(k.getE_exp()>=3 &&(k.getE_exp()<6))
				k.setSalary(k.getSalary()+(0.050)*k.getSalary());
			else if(k.getE_exp()>=6 &&(k.getE_exp()<=10))
				k.setSalary(k.getSalary()+(0.1)*k.getSalary());
			else if(k.getE_exp()>10 )
				k.setSalary(k.getSalary()+(0.12)*k.getSalary());
			
        }
		      ).toList();
        System.out.println("Incremented salary list");
        System.out.println(updates);
        
       
    }
    
    public void incr()
    {
    	
    }
}
