
public class Link {
	
	public String bookName;
	public Link next;
	
	 public Link(){
	    	
	    }

    public Link(String bookName){
    	this.bookName = bookName;
    }
    
    public void display(){
//    	System.out.print("BookName: " + bookName);
    	System.out.print(bookName + "->");
    }
    
    public String toString(){
    	return bookName;
    }
    	
 }
