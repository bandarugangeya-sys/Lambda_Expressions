package Lambda;

interface Runnable{
	public void run();
}
public class LambdaThread {
public static void main(String[] args) {
	  java.lang.Runnable r=()->{ for(int i=0;i<10;i++) {
		System.out.println("Child Thread");}};
		Thread t=new Thread(r); 
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
}
}}
