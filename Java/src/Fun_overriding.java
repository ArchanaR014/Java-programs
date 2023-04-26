class Vehicle{
	public void run() {
		System.out.println("This is main class");
	}
}

class Bike extends Vehicle{
	public void run() {
		System.out.println("This is child class");
	}
}

public class Fun_overriding {

	public static void main(String[] args) {
		Bike b=new Bike();
		Vehicle v=new Bike();
		b.run();
		v.run();
	}

}
