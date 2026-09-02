package Lambda;
interface SquareNo{
	public int SquareRoot(int a);
}
public class Lambda4 {
public static void main(String[] args) {
	SquareNo n=(a)->{ return a*a;};
	System.out.println("the square of a number is:"+n.SquareRoot(10));
}}
