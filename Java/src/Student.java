import java.util.*;
class Student1{
	
	private int UID;
	private String name;
	
	
	public void set_UID(int u_id){
		UID = u_id;
	}
	
	public void set_name(String name1) {
		name = name1;
	}
	
	public int get_UId() {
		return UID;
		
	}
	
	public String get_name() {
		return name;
	}
	
}

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student1 s1=new Student1();
		
		s1.set_UID(21);
		
		String sname1=sc.nextLine();
		s1.set_name(sname1);
		System.out.println("UID = " +s1.get_UId() + " name = " + s1.get_name());
		}

}

/*Student1 s1=new Student1();

s1.set_UID(21);
System.out.println(s1.get_UId());

Scanner sc=new Scanner(System.in);
String sname1=sc.nextLine();
s1.set_name(sname1);
System.out.println( "name = " + s1.get_name());*/
