package encapsulation;

public class Watch {
	private String brand;
	private int price;
	private String color;
	private String type;
	private Battery battery;
	
	
public void setbrand(String brand) {
	this.brand = brand;
}
public String getbrand() {
	return brand;
}
public void setprice(int price) {
	this.price = price;
}
public int getprice() {
	return price;
}
public void setcolor(String color) {
	this.color = color;
}
public String getcolor() {
	return color;
}
public void settype(String type) {
	this.type = type;
}
public String gettype() {
	return type;
}
public void setbattery(Battery battery) {
	this.battery = battery;
	
}
public Battery getbattery() {
	return battery;
	
}



}

