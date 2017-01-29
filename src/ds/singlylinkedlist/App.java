package ds.singlylinkedlist;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        
        myList.insertLast(9999999);
        
        myList.displayList();

    }

}


/*
 * Output:

List (first --> last) 
{ 88 }
{ 99 }
{ 50 }
{ 100 }
{ 9999999 }

*/