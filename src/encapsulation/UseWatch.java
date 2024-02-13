package encapsulation;

public class UseWatch {
	public static void main(String args[]) {
		
		Battery b = new Battery();
		b.setbrand("tesla");
		b.setprice(500);
		b.setcapacity(50);
		
		
		Watch w = new Watch();
		w.setbrand("titan");
		w.setprice(2500);
		w.setcolor("black");
		w.settype("digital");
		w.setbattery(b);
		
		System.out.println(w.getbrand()+" "+w.getprice()+" "+w.getcolor()+" "+w.gettype()+" "+w.getbattery().getbrand()+" "+w.getbattery().getprice()+" "+w.getbattery().getcapacity());

}
}
