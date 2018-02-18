package by.mitsko.library;

import java.util.Scanner;


public class Library {
  private Book [] books;
  private int bookCount;
  private int i;
  private String title;
  private String author;
  private int year;
     
  public void addBook (Book book){
		if (this.books != null){
		    if (bookCount < books.length){
		    	books[bookCount] = book;
		    	bookCount++;
		    }else{
		    	Book [] students = new Book[this.books.length + 1];
		    	for (i = 0; i <this.books.length; i++){
		    		students [i]  = this.books[i];
		    	}
		    	this.books = students;
		    	this.books[bookCount] = book;
		    	bookCount++;
		    	}
	}else{
			this.books = new Book[2];	
			this.books[bookCount] = book;
			bookCount++;
			}
  }

  public   void showBooks (){
	  if (this.books != null){
 	 for  (i = 0; i <this.books.length; i++){
 		 System.out.println(books[i].title + ", " + books[i].author + ", " + books[i].year);
  } }
}
  public  void showCount(){
	  System.out.println("Count of books in the library: " + bookCount);
  }
  public String findTitle () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title");
		String c = sc.next();
		return c;
		}

  public void findBook(){
	  title = findTitle ();
	  for (int i = 0; i < this.books.length; i++){
		if (books[i].title == title){
				System.out.println(books[i].title + ", " + books[i].author + ", " + books[i].year);
			}
	  }
			}
			
	public void deleteBook(){
		title = findTitle ();
		if (this.title == title){
			this.books = null;
			System.out.println("The book was deleted");
		}
	}
	public void bubbleSort (){
		System.out.println("===========================");
		for (int i =  this.books.length-1; i > 0; i--) {
			for (int j = 0; j<i; j++) { 
				if (books[j].year > books[j+1].year){
					Book tmp = books[j];
					books[j] = books[j+1];
					books[j+1] = tmp;
				}
			
			}
			
		}
}
	

	
 	
}
//

