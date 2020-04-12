package Main;
import Objects.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object1 a = new Object1();
		Object1 b = new Object1();
		Object2 c = new Object2();
		Object2 d = new Object2();
		
		a.type = "obj1";
		b.type = "object1";
		
		c.type = "obj2";
		d.type = "object2";
		
		System.out.println("Strings for: a, b, c, d");
		System.out.println(a.type + ", " + b.type + ", " + c.type + ", " + d.type + "\n\n");
		
		//Name Equivalence
		System.out.println("Here we use name equivalence\n"
				+ "With name equivalence in Java, we can set b equal to a and c equal to d\n"
				+ "How ever, we cannot set a and b to c or d or vice versa since Java lacks Structural equivalence ");
		
		a = b;
		c = d;
		
		System.out.println("Strings for: a, b, c, d");
		System.out.println(a.type + ", " + b.type + ", " + c.type + ", " + d.type);
		
		System.out.println("If we try to set a equal to c, we will  throw an error since Java lacks"
				+ "structural equivalance");
		
		//a + c; This line will throw an error
		
	}

}
