package by.mitsko.library;

public class mainApp {
	public static void main(String[] args) {
		
		Book b1 = new Book ("Vij", "Gogol N. V.", 1976 );
		Book b2 = new Book ("Harry Potter and the prisoner of Azkaban", "Roling J. K.", 2005 );
		Book b3 = new Book ("The healthy food", "Petrova A. K.", 2015 );
		Book b4 = new Book ("General geology", "Komarov V. I., Belov A. D.", 1999 );
		Book b5 = new Book ("JAVA Methods Programming", "Blinov I. N., Romanchik V. S.", 2013);
				
		Library lib = new Library();
		Book [] books = new Book[]{};
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		lib.addBook(b5);
		
		lib.showCount();
		lib.showBooks();
	 
		//lib.findBook();
	    //lib.deleteBook();
		lib.bubbleSort();
		
	    lib.showBooks();
	}
}
