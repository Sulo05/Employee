package constructor;

public class Coil {
	private String brand;
	private int price;
	private int volt;
	
	public Coil(String brand , int price , int volt) {
		
		this.brand = brand;
		this.price = price;
		this.volt = volt;
	}
	public String toString() {
		return brand+" "+price+" "+volt;
	}

}
