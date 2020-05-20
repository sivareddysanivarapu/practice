package javapractice;

public class GG {
//	static int s = 6;
//	String a = "siva";
//
//	public static void mm() {
//		// int s = 8;
//		final int c = s + 5;
//		System.out.println(c);
//		// String a = "sam";
//		System.out.println(s);
//		// System.out.println(a);
	//}
	String name;
	int s;
	float g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GG.mm();
//		System.out.println(GG.s);
		GG d= new GG();
		d.s=5;
		d.name="siva";
		d.g=9;
		for(int i=0;i<d.s;i++) {
			System.out.println(" ");
			for(int j=i;j<d.s;j++) {
				
				System.out.print(i);
				System.out.print(" ");
				//System.out.print(" ");
				
			}
		}
	}

	}
