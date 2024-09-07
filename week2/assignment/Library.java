package week2.assignment;

public class Library {

	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
		
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
		
	}
	
	public static void main(String argss[])
	{
		Library Novel= new Library();
		Novel.addBook("The fault in our stars");
		Novel.issueBook();
	}
	
	
	
}
