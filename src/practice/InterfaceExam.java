package practice;

public class InterfaceExam implements CentralTraffic,ContinentalTraffic {
	public void siva() {
		System.out.println("this is indiantraffic class method");
		System.out.println("for getting this method in main we need to create object for indian traffic");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new InterfaceExam();// it means it create object for indiantra and use methods in centraltraffic
		InterfaceExam b= new InterfaceExam();//this object is used to get the class method named siva()
		ContinentalTraffic c=new InterfaceExam();//for getting methods in continental interface
		a.greenGo();
		a.redStop();
		a.FlashYellow();
		b.siva();
		c.trainsymbol();
	}

	@Override
	public void greenGo() {//method in central traffic interface
		// TODO Auto-generated method stub
	System.out.println("move the vehicles");	
	}

	@Override
	public void redStop() {//method in central traffic interface
		// TODO Auto-generated method stub
	System.out.println("stop");	
	}

	@Override
	public void FlashYellow() {//method in central traffic interface
		// TODO Auto-generated method stub
		System.out.println("wait");
	}

	@Override
	public void trainsymbol() {//this method is for contitraffic interface
		// TODO Auto-generated method stub
		System.out.println("multiple inheritance acheived using interface");
	}

}
