
public class LinkedList {

	/**
	 * @param args
	 */
	
	public Link firstLink;
	
	 public LinkedList(){
		 firstLink = null;
	 }
	 
	 public boolean isEmpty(){
		
		 return firstLink ==  null;	 
	 }
	 
	 
	 /// Insert new element at First
	 
	 public void insertAtFirst(String bookName){
		 Link newLink = new Link(bookName);
		 newLink.next = firstLink;
		 firstLink = newLink;
		 
	 }
	 
	 public Link removeFirst(){
		 Link theLink = firstLink;
		 if(!isEmpty()){
			 firstLink = firstLink.next;
		 } else {
			 System.out.println("empty list");
			 
		 }
		 
		 System.out.println(" removed " + theLink);
		 return theLink; 
	 }
	 //Display the LinkedList
	 public void display(){
		 Link list = firstLink;
		 
		 
		 while (list!= null){
			 
			 list.display();
			 
//			 System.out.println( "next link:" + list.next);
			 list = list.next;
			 
//			 System.out.println(" ");
			 
		 }
		 
		 System.out.println("|||size  " + size());
		 
	 }
	 
    public int size(){
    	Link list = firstLink;
    	int count = 0;
            while (list!= null){		 
			 list = list.next;
			 count++;

		 }
            System.out.println(" ");
            return count;
            
    	
    }
	 
	 // find a link in Linkedlist
	 
	 public Link find(String bookName){
		 Link theLink = firstLink;
		 if (!isEmpty()){
			 while(theLink.bookName != bookName){
				 if(theLink.next == null){
				    return null;
				 } else {
					 theLink = theLink.next;	 
				 }
			 }
		 } else {
			 System.out.println("list is empty");
		 }
		 return theLink;
	 }
	 
	 
	 // find a link in Linkedlist and remove it
	 
	 public Link removeLink(String bookName){
		 Link prevLink = firstLink;
		 Link currLink = firstLink;
		 
		 while(currLink.bookName!= bookName){
			 if(currLink.next==null){
				 return null;
				 
			 } else {
				 prevLink = currLink;
				 currLink = currLink.next;
			 }
		 }
		 
		 if (currLink == firstLink){
			 firstLink = firstLink.next;
			 
		 } else {
			 prevLink.next = currLink.next;
		 }
		 
		 return currLink;
		 
	 }
	 
//	 public void insertPosition(int i, String bookName){
//		 Link newLink = new Link(bookName);
//		 Link currLink = firstLink;
//		int currIndex = 0;
//		 int targetIndex = i - 1;
//		 
//		 if(currLink!=null){
//			 while(currIndex < targetIndex && currLink.next != null ){
//				 currIndex++;
//				 currLink = currLink.next;
//				 
//			 }
//			 
//			 if (currIndex == targetIndex ){
//				 
//				 newLink.next=currLink.next;
//				 currLink.next = newLink;
//				 
//				 
//			 } else if(i==0){
//				 newLink.next= firstLink;
//				 firstLink = newLink;
//				 
//			 }
//		 } else if( i == 0){
//			 firstLink = newLink;
//		 }
//		 
//		 
//		 
//	 }
	 
	 public void insertn(String bookName, int position){
		 
		 Link newLink = new Link();
		 newLink.bookName=bookName;
		 
		 if(position == 0){
			 newLink.next=firstLink;
			 firstLink = newLink;
			 return;
		 }
		 
		 
	     Link curr = firstLink;
	    if(position < size()){
	
	     for(int i = 0;i< position-2; i++){
	    	 curr = curr.next;
	     }
	     
	     
	     newLink.next = curr.next;
	     curr.next=newLink;
	     }
	    else {
	    	System.out.println("cannot insert , Invalid position");
	    }
		 
	 }
	 
	 public Link removeAtPostion(int i){
		
		 Link currLink = firstLink; 
		 Link prevLink = firstLink;
		 int currIndex = 0;
		 int targetIndex = i-1; 
		 
		 if(i==1){
			 firstLink = firstLink.next;
		 }

		 while(currIndex < targetIndex && currLink.next != null ){
			 currIndex++;
			 prevLink = currLink;
			 currLink = currLink.next;
		 }
		 
		 if(currIndex == targetIndex){
			 
			 prevLink.next = currLink.next;
			 
		 }		 
		 return currLink;
	
	 }
	 
	 // reverse a list
	 
	 public Link reverseList(){
		 Link currLink = firstLink;
		 Link prevLink = null;
		 Link temp;
		 while(currLink!=null){
			  temp = currLink.next;
			  currLink.next = prevLink;
			  prevLink= currLink;
			  currLink = temp;
			 
		 }
		 
		 firstLink = prevLink;
		 return firstLink;
	 }
	
	 
	 
	 void ReversePrintRecur() {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		   Link head = firstLink;
		   if(head == null){
			   return;
		   }
		   else {
			    ReversePrintRecursive(head);
		   }
	 }
	 
		 void ReversePrintRecursive(Link head){
		   if (head == null) {
		        return;
		    }
		   System.out.println(head.bookName + " -> " );
		    ReversePrintRecursive(head.next);
		    System.out.print(head.bookName + " -> " );

		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList ll = new LinkedList();
        ll.insertAtFirst("Once upon a time");
        ll.insertAtFirst("The secret");
        ll.insertAtFirst("You can win");
        ll.insertn("C programming", 5);
 
        ll.removeFirst();
        ll.display();
       
        ll.ReversePrintRecur();
        
        System.out.println("found ? :" + ll.find("The secret"));
        System.out.println("remove the given ? :" +       ll.removeLink("The secret"));
       ll.display();
     ll.insertPosition(0, "Positive words");
       System.out.println("-----------------");
     ll.display();
     
   System.out.println("-----------------+ " + ll.removeAtPostion(3));
    ll.display();
             System.out.println("Reverse a List-----------------+ " + ll.reverseList());
      ll.display();
        
	}

}
