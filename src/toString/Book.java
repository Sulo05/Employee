package toString;

public class Book {
	private String brand;
	private int rate;
	private String content;
	private Pages Pages;
	
	public Book (String brand,int rate,String content,Pages Pages) {
		
		this.brand = brand;
		this.rate = rate;
		this.content = content;
		this.Pages = Pages;
	}
	
	public String toString() {
		return brand+" "+rate+" "+content+" "+Pages;
	}

}
