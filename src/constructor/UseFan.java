package constructor;

public class UseFan {
public static void main(String args[]) {
	Coil c = new Coil("lp",500,100);
	Fan f = new Fan("usha",4000,3,"brown",c);
//	System.out.println(f.brand);
	// we used toString method here just to know the method,we can also 
	
	System.out.println("brand = "+f.brand+" price = "+f.price+" wings = "+f.wings+" color = "+f.color +" coil details = "+c);
}
}
