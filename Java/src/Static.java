class Counter{
		static int count=0;
		public Counter(){
				count++;
				System.out.println(count);
			}
		}
public class Static {

	public static void main(String[] args) {
		
		Counter a=new Counter();
		Counter b=new Counter();
		Counter c=new Counter();
		

	}

}
