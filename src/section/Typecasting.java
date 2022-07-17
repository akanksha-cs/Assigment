package section;

public class Typecasting {

	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		float f=(float) x;
		long l=(long) f;
		int i=(int) x;
		short s=(short) i;
		byte by=(byte) s;
		System.out.println("Value of x: "+x);
		System.out.println("Value of f: "+f);
		System.out.println("Value of l: "+l);
		System.out.println("Value of i: "+x);
		System.out.println("Value of s: "+s);
		System.out.println("Value of by: "+by);
		

	}

}
