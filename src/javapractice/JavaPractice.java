package javapractice;

public class JavaPractice {

	int a = 5;
	private static String ss[] = { "siva", "sam", "reddy" };
	static int s = 8;

	public static String arr() {
		String d = ss[0];
		return d;
	}

	public String method() {
		String a = "amma";
		return a;
	}

	public void inheritmethod() {
		System.out.println("successfully inherited");
	}

	String name;
	int no;

	public void siva(int a, String f) {
		this.no = a;
		this.name = f;
		System.out.println(no);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String a="siva"; //string methods System.out.println(a.codePointAt(3));
		 * System.out.println(a.compareTo("sam"));
		 * System.out.println(a.concat("reddy"));
		 * System.out.println(a.replaceFirst("ss", ""));
		 * System.out.println(a.charAt(2));
		 */
//System.out.println(JavaPractice.s);//we can retrieve the static member by using class name

		JavaPractice j = new JavaPractice();
		j.siva(832, "reddy");

	}

}
