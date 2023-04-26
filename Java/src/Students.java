class Student2{
	private int roll_no;
	private String name,address;
	private long phone_no;
	
	public Student2 (int r,String n,long p,String a) {
		roll_no=r;
		name=n;
		phone_no=p;
		address=a;
	}
	
	public void print() {
		System.out.println("Roll_no = " +roll_no+ " and Name = " +name);
		System.out.println("Phone_no = " +phone_no+ " and Address = " +address);
	}
}
public class Students {

	public static void main(String[] args) {
		
		Student2 s1=new Student2(1,"Sam",914828497,"Bangalore");
		s1.print();
		
		System.out.println("--------------------------------");
		
		Student2 s2=new Student2(2, "John", 587744550, "Delhi");
        s2.print();
	}

}
