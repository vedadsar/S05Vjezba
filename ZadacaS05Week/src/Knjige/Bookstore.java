package Knjige;

public class Bookstore {
    private String bookstoreName;
	private Knjiga[] books;
	private int numOfBooks;
   
	
	public Bookstore(){
		this.bookstoreName= "unknown";
		books = new Knjiga[2];
		numOfBooks=0;
		
	}
	
	public Bookstore(String bookstoreName){
		this.bookstoreName= bookstoreName;
		books = new Knjiga[2];
		numOfBooks=0;
	}
	
	
	public void addABook(String name, int price , int num){
		
		books[numOfBooks] = new Knjiga(name, price, num);
		numOfBooks++;
		
		if(numOfBooks == books.length){
		resizeBookstore();	
		}
	}
	public void resizeBookstore() {
		
		int newLenght = 2*books.length;
		Knjiga[] temp = new Knjiga[newLenght];
		
		for(int i=0; i< books.length;i++){
			temp[i] = books[i];
		}
		
		books = temp;
		
	}
	
	
	public String toString(){
		
		String bookstoreToString ="";
				
		System.out.println("U knjizari " +this.bookstoreName +" nalaze se: \n ");
		
		for(int i=0; i<numOfBooks;i++){
			bookstoreToString += books[i].toString();
			
		}
		return bookstoreToString;
	}
	
}