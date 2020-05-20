package javapractice;

public class Inheritance extends JavaPractice {

	public void ss() {
		System.out.println("single");
	}

	int a=9;//here i overwrite the value of "a" which is present in javapractice clss
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPractice j= new Inheritance();//it create object for inheritance class it also takes members in javaprac class
		System.out.println(j.a);//it prints the value of "a" present in java practice class
		Inheritance i = new Inheritance();
		System.out.println(i.a);
//System.out.println(i.ss[0]); this line provides error because i change access modifier to private in java practice class
		i.arr();// by using method we can access the private variable
		System.out.println(i.arr());
		System.out.println(i.method());
		i.inheritmethod();
		System.out.println(Inheritance.s);//s is a static variable so i can call using clasname
		
	}

}
