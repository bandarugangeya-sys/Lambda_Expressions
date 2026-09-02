package Lambda;

interface add{
	public void Sum(int a,int b);
}

public class Lambda2 {
public static void main(String[] args) {
	add c=(a,b)-> System.out.println("the sum of 2 nos:::"+(a+b));
	c.Sum(10,20);
	c.Sum(100,200);
	
}
}
