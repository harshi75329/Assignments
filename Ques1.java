package Assignment2;

class Item{
	
	String title;
	String author;
	int publicationYear;
	
	public Item(String title,String author,int publicationYear) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	void display() {
		
		System.out.println("Title : "+ title);
		System.out.println("author : "+ author);
		System.out.println("PublicationYear : "+ publicationYear);
	}
	
}
class Book extends Item{
	String genre;
	public Book(String title,String author,int publicationYear,String genre) {
		super(title,author,publicationYear);
		this.genre=genre;
	}
	void displayDetails(){
		super.display();
		System.out.println("Genre : "+ genre);
		System.out.println("--------------------");
	}
}
class Magazine extends Item{
	int issueNumber;
	public Magazine(String title,String author,int publicationYear,int issueNumber) {
		super(title,author,publicationYear);
		this.issueNumber=issueNumber;
	}
	void displayDetails() {
		super.display();
		System.out.println("issueNumber : "+issueNumber);
		System.out.println("--------------------");
	}
}
class Ques1{
	public static void main(String args[]) {
		Book book = new Book("Higure","Shinchan",2025,"comic");
		Magazine mag = new Magazine("Doremon","Dora",2025,100);
		
		book.displayDetails();
		mag.displayDetails();
	}
}

