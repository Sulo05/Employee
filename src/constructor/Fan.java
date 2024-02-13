package constructor;

public class Fan {
	public String brand;
	public int price;
	public int wings;
	public String color;
	public Coil coil;
	
	public Fan(String brand,int price,int wings,String color,Coil coil) {
		this.brand = brand;
		this.price = price;
		this.wings = wings;
		this.color = color;
		this.coil = coil;
	}
	public String toString() {
		return brand+" "+price+" "+wings+" "+color+" "+coil;
	}

}
