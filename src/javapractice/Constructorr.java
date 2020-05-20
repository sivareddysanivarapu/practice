package javapractice;

public class Constructorr {
 
 public Constructorr() {//default constructor
	 int a=5;
	System.out.println("siva");
}
 public Constructorr(int a, int b) {//parameterized constructor
	 System.out.println(a+b);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructorr c= new Constructorr();
Constructorr d= new Constructorr(4,3);//to call the parameterized constructor
	}

}
