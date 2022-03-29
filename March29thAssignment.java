import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class March29thAssignment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashSet<Book> hs=new HashSet<Book>();
		Book book1=new Book(10, "Harry Potter", "JK Rowling", 2000, 2021, 2500);
		Book book2=new Book(2, "The Roaring Lambs", "Sreedhar", 2000, 2021, 2500);
		Book book3=new Book(30, "Relentless", "Sreedhar", 2000, 2021, 2500);
		Book book4=new Book(4, "two states", "fgh", 2000, 2021, 2500);
		
		
		hs.add(book1);
		hs.add(book2);
		hs.add(book3);
		hs.add(book4);
		
		Iterator<Book> itr=hs.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			
		}
		
		/*TreeSet<String> treeSet=new TreeSet<>(Comparator.reverseOrder());
		treeSet.add("Onion");
		treeSet.add("Potato");
		treeSet.add("Tomato");	
		System.out.println(treeSet);*/
		
		System.out.println("------------------------------------------------------");
		TreeSet<Book> treeSetID=new TreeSet<Book>(new BookIdComparator() );
		treeSetID.add(book1);
		treeSetID.add(book2);
		treeSetID.add(book3);
		treeSetID.add(book4);
		Iterator<Book> itr1=treeSetID.iterator();
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
			
		}
		
		
		
		
		
		
		
	}
	
	

}
class Book
{
	int bookNumber;
	String bookName;
	String author;
	int noOfPages;
	int edition;
	int Price;
	public Book(int bookNumber, String bookName, String author, int noOfPages, int edition, int price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.edition = edition;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", noOfPages="
				+ noOfPages + ", edition=" + edition + ", Price=" + Price + "]";
	}
	
	@Override
 public boolean equals(Object o) 
	{
      if (this == o) return true;
     // if (o == null || getClass() != o.getClass()) return false;
      Book b = (Book) o;
      return bookNumber==b.bookNumber;
    }
	
	@Override
    public int hashCode() 
	{
        return this.bookNumber;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
        
	
	
	
}
class BookIdComparator implements Comparator<Book>
{
   
    public int compare(Book s1, Book s2)
    {
        return s1.getBookNumber()-s2.getBookNumber();
    }
}
 
