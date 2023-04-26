class Animal{
	 static int cost=20000;
	 static void method() {
	        System.out.println("Static Method");
	}
}
class Dog extends Animal{
	
	public void display() {
		System.out.println("Beagle will be selling");
	}
}
public class Static_Inheri {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.method();
		System.out.println("Cost = " +d.cost);
		d.display();
		
	}
}

