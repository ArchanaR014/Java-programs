class Salary{
	protected float salary;
	
	public Salary() {                  //Default//
		salary=40000;
	}
	
	public Salary(float s) {           //parameter//
		salary=s;
	}
}
class Employee extends Salary{
	int bonus;
	String name;
	
	public Employee() {                 //Default//
		bonus=2000;
		name="archana";
	}
	
	public Employee(float s, int b, String name) {         //Parameter//
		super(s);
	}
}
public class Inheritanc1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		System.out.println("Default const");
		System.out.println("Salary = " +e1.salary);
		System.out.println("Bonus = " +e1.bonus);
		
		System.out.println("------------------------");
		
		Employee e2=new Employee();
		System.out.println("Parameter const");
		System.out.println("Salary = " +e2.salary);
		System.out.println("Bonus = " +e2.bonus);
		System.out.println("Name = " +e2.name);

	}

}
