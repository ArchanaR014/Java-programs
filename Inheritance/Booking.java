
public class Booking {

	public static void main(String[] args) {
		People p=new People();
		
		p.set_bname("Iravatha");
		p.set_route("Bangalore");
		System.out.println("Bus name is " +p.get_bname() + " route is " +p.get_route());
		
		p.set_pname("Aishu");
		p.set_phoneno(914528736);
		System.out.println("person name is " +p.get_pname() + " phone no is " +p.get_phoneno());
		
		
	}

}
