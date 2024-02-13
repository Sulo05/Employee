package toString;

public class UseBook {
	public static void main(String args[]) {
		Pages p = new Pages(30,"unruled","normal");
		Book b = new Book("tiger",18,"printed",p);
		System.out.println(b);
	
		
	}

}
