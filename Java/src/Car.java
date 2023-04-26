class car1{
	private String brand;
	
	public car1() {
		brand="Ford";
	}
	
	public void get_brand() {
		System.out.println("Brand = " + brand);
	}
}
public class Car {

	public static void main(String[] args) {
		car1 c=new car1();
		c.get_brand();

	}

}
