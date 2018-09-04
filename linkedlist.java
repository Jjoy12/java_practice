 public class link{
     public String bookName;
     public int millionsSold;

     public Link next;

     public Link(String bookName, int millionsSold){
         this.bookName = bookName;
         this.millionsSold = millionsSold;
     }


    public void display(){
        System.out.println(bookName + ":" + millionsSold + ",000,000");
    }   

    public StringtoString(){
        return bookName;
    }

     public static void main(string[] args){
         LinkedList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of The Rings", 150);
        theLinkedList.insertFirstLink("Harry poter", 107);

        theLinkedList.display();

        theLinkedList.removeFirst();

        System.out.println();

        theLinkedList.removeLink("The Lord of the Rings");
        
        theLinkedList.display();

     }
 }

 class LinkList{
     public Link firstLink;

     LinkList(){
         firstLink = null;
     }
     public boolean isEmpty(){
         retrun(firstLink == null);
     }

     public void insertFirstLink(String bookName, int millionsSold){
         Link newLink = new Link(bookName, millionsSold);

         newLink.next = firstLink;

         firstLink = newLink;
     }

     public Link removeFirst(){
         Link linkReference = firstLink;

         if(!isEmpty()){
             firstLink = firstLink.next;
         } else { 
             System.out.println("Empty LinkedList");
         }
         return linkReference
     }

     public void display(){
         Link theLink = firstLink;
         while(theLink != null){
             theLink.display();
             System.out.println("Next Link: " + theLink.next );
             theLink = theLink.next;
         }
     }
     public Link find(String bookName){
         link theLink = firstLink;
         
         if(!isEmpty()){
             while(theLink.bookName != bookName){
                 if(theLink.next = null){
                     retrun null;
                 } else{
                     theLink = theLink.next
                 }
             }
         } else{
             System.out.println("Empty LinkedList");
         }
         return theLink;
     }

     public link removeLink(String bookName){
         Link currentLink = firstLink;
         Link previousLink = firstLink;

         while(currentLink.bookName != bookName){
             if(currentLink.next == null){
                 return null;
             } else{
                 previousLink = currentLink;

                 currentLink = currentLink.next;
             }
         }
         if(currentLink == firstLink){
             firstLink = firstLink.next;

         } else{
             previousLink.next = currentLink.next
         }
         return currentLink;
     }
 }