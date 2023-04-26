import base_pack.*;
public class Test1 {

	public static void main(String[] args) {
		
		First f=new First();
		System.out.println("Addition = " +f.getAdd(2,4));
		System.out.println("Subtraction = " +f.getSub(4, 2));
		
		Second s=new Second();
		s.Hello();

	}

}
