package libraryPackage;
import java.util.Scanner;

public class Library {
	
	private Book[] myBooks = new Book[2];
	//private Book myBook1;
	//private Book myBook2;
	private Scanner scan = new Scanner(System.in);
	
	public Library(){
		for(int i=0; i<2; i++) myBooks[i] = new Book();
		//myBook1 = new Book();
		//myBook2 = new Book();
	}
	
	public void addBooks(){
		/*System.out.print("Input the title of book1:");
		myBook1.setTitle(scan.next());
		System.out.print("\nInput the author of book1:");
		myBook1.setAuthor(scan.next());
		
		System.out.print("\nInput the title of book1:");
		myBook2.setTitle(scan.next());
		System.out.print("\nInput the author of book1:");
		myBook2.setAuthor(scan.next());*/
		
		for(int i=0; i<2; i++){
			System.out.print("Input the title of book" + i + ":");
			myBooks[i].setTitle(scan.nextLine());
			System.out.print("Input the author of book" + i + ":");
			myBooks[i].setAuthor(scan.nextLine());
		}
	}
	
	public void printBooks(){
		System.out.println("\nYour books are:");
		for(int i=0; i<2; i++){
			System.out.println(myBooks[i].getTitle() + " by " + myBooks[i].getAuthor());
		}
	}

}
