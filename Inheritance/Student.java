
public class Student extends Citizen {
	private int rollno;
	private String sname;
	
	public void set_rollno(int rollno) {
		this.rollno=rollno;
	}
	
	public int get_rollno(){
		return rollno;
	}
	
	public void set_sname(String sname) {
		this.sname=sname;
	}
	
	public String get_sname() {
		return sname;
	}
}

