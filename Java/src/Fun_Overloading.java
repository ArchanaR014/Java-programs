class Cars{
	public void Land_Rover() {
		System.out.println("I love to ride this car");
	}
	public void Land_Rover(String name) {
		System.out.println("I love to ride this " +name+ " Car");
	}
	
}
public class Fun_Overloading {

	public static void main(String[] args) {
		Cars c=new Cars();
		c.Land_Rover();
		c.Land_Rover("Range_Rover");

	}

}
