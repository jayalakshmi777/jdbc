package collections;

public class Book {
	String bname;
	String bauthor;
	double bcost;
	String desc;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public double getBcost() {
		return bcost;
	}
	public void setBcost(double bcost) {
		this.bcost = bcost;
	}
	public Book(String bname, String bauthor, double bcost) {
		super();
		this.bname = bname;
		this.bauthor = bauthor;
		this.bcost = bcost;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", bauthor=" + bauthor + ", bcost=" + bcost + "]";
	}
	

}
