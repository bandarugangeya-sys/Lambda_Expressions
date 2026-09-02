package Lambda;

interface demo{
	public int getLength(String s);
}
public class Lambda3 {
public static void main(String[] args) {
	demo d=  s->s.length();
	System.out.println(d.getLength("prasad"));
	
}}
