class Dog{
	protected int cost=50000;
}

class Puppy extends Dog{
	int selling=20000;
}

public class Inheritance {
	
	public static void main(String[] args) {
		Puppy p=new Puppy();
		System.out.println("Cost = " +p.cost);
		System.out.println("Selling = " +p.selling);
	}

}

