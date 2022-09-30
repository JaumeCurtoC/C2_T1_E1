package Ex5;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		int a2 = a;
		int b2 = b;
		int c2 = c;
		int d2 = d;
		
		b = c2;
		c = a2;
		a = d2;
		d = b2;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		


	}

}
