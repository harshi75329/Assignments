<<<<<<< HEAD
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

=======
package Assignment3;

import java.util.*;

public class Ques1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		//Add five city names to the set
		hs.add("Hyderabad");
		hs.add("Mumbai");
		hs.add("Pune");
		hs.add("Chennai");
		hs.add("Pune");
		
		//Display the elements to show that duplicates are not allowed
		for(String city : hs) {
			System.out.print(city + " ");
		}
		
		//Check if a particular city exists in the set
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city :");
		String city = sc.nextLine();
		if(hs.contains(city)) {
			System.out.println(city+" is there in the hashset");
		}
		else {
			System.out.println(city+" is not there in the hashset");
		}
		
		//Remove a city and display the updated set
		hs.remove("Chennai");
		System.out.println("HashSet after removing a city");
		for(String cit : hs) {
			System.out.print(cit+" ");
		}

	}

}
>>>>>>> a4860b3 (A3)
