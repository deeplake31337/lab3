package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDisc = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
	}
	
	public boolean isMatch(String title) {
		String keywords[] = title.split(",");
		for (String word : this.title.split(" ")) {
			for (String keyword : keywords) {
				if (word.equalsIgnoreCase(keyword)) return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}
	/*public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}*/
	
}