/* Lambda Expression Is a Anonymus Interface which means without having any methodname and returntype and modifiers
   that interface is said to be lambda expressions */
package Lambda;
@FunctionalInterface 
interface Lambda{
	public void m1();
}
public class LambdaE1 {
public static void main(String[] args) {
	Lambda l=()->System.out.println("Its a Lambda Expression ");
	l.m1();
}
}
