package toString;

public class Pages {
	private int pg;
	private String type;
	private String paper;
	
	public Pages (int pg, String type, String paper) {
		this.pg = pg;
		this.type = type;
		this.paper = paper;
	}
	
	public String toString() {
		return pg+" "+type+" "+paper;
	}

}
