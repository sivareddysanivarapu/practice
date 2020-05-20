package javapractice;

public class Differentvariables {
	String n;// these are called instance variables, these scope is within in the class when
				// object is created
	int s;
	float g;
	static int ss;// these are called static variables,used only in static methods
	static String nn;
	static float gg;

	public Differentvariables() {
		System.out.println("default constructor");
	}

	public Differentvariables(int a, String b, float c) {
		this.s = a;
		this.g = c;
		this.n = b;
		System.out.println(s);
		System.out.println(g);
		System.out.println(n);
	}

	public void sf() {
		this.ss = 7;
		this.nn = "siva";
		this.s = 4;
		System.out.println(nn);
		System.out.println(ss);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Differentvariables var = new Differentvariables();// it calls default constructor
		Differentvariables var1 = new Differentvariables(7, "sam", 9);// then conntrol goes to parameterzed constructor
		//these 7,sam,9 goes as arguments and assign to instance variables
		var.sf();
		var1.sf();
	}

}
