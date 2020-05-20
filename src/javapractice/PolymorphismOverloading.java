package javapractice;

public class PolymorphismOverloading {
	int b = 5;
	static String a = "siva";

	public void method1() {// method1 without argument
		System.out.println(b);
	}

	public String method1(String a) {// method1 with argument
		return a;
	}

	public void method2(int f) {
		System.out.println(f);
	}

	public void method2(int h, int j) {
		System.out.println(h + j);
	}

	public void method3(String u) {
		System.out.println(u.charAt(5));// to print the character present in index 5
	}

	public void method3(String i, String s) {
		System.out.println(i.compareTo(s));// it compares the two strings
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismOverloading p = new PolymorphismOverloading();
		p.method1();// method with no arguments
		System.out.println(p.method1("sam"));
		System.out.println(p.method1(a));// it prints siva present in string a
		System.out.println(PolymorphismOverloading.a);// to get static variable use class name
		p.method2(32);
		p.method2(8, 4);
		p.method3("sanivarapu");
		p.method3("amma", "ammama");
	}

}
