package Lambda;
import java.util.*;
class Employee{
	int empno;
	String ename;
	Employee(int empno,String ename){
		this.empno=empno;
		this.ename=ename;
	}
	public String toString() {
		return empno +":"+ ename;
	}
    }
public class LambdaComperable {
public static void main(String[] args) {
	ArrayList<Employee> a=new ArrayList<Employee>();
	a.add(new Employee(2,"prasad"));
	a.add(new Employee(3,"sandeep"));
	a.add(new Employee(1,"mega"));
	a.add(new Employee(5,"sai"));
	a.add(new Employee(4,"ashwin"));
	System.out.println(a);
	Collections.sort(a,(e1,e2)->e1.ename.compareTo(e2.ename));//sorting based on names our own class by using comperable
	System.out.println(a); 
	Collections.sort(a,(e1,e2)->Integer.compare(e1.empno, e2.empno));//sorting based on empno by using comparator
	System.out.println(a);
	Collections.sort(a,(e1,e2)->(e1.empno<e2.empno)?-1:(e1.empno>e2.empno)?1:0);// sorting based on empno by using ternary operator
	System.out.println(a);
}
}
