public class Sample_inheritance {

	public static void main(String[] args) {
		Student s=new Student();
		
		s.set_name("archana");
		s.set_addr("Bangalore");
		
		System.out.println("Name is " +s.get_name()+ " and Address is " +s.get_addr());
		
		
		
		s.set_sname("aishu");
		s.set_rollno(5);
		
		System.out.println("Student name is " +s.get_sname() + " and Roll no is " +s.get_rollno());
		
	}
}