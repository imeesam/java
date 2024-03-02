import java.util.*; // for collection framework for linked list we import from java 
class LI {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>(); // to create an empty linked list we use it  
   
        // now we dont have to write  functions in it just simply add it 
        list.addFirst("a");      //addfirst to add elements in first
        list.addFirst("is");
        System.out.println(list);
        
        list.addLast("list");   //addlast is to add element in last
        System.out.println(list);
        
        list.addFirst("this");
        System.out.println(list);
        
        System.out.println(list.size()); // to print size put .size in print call 

        for(int i = 0 ; i<list.size(); i++ ){  
            // we can search ethier by comparing it
            // using loop to print elements list ki elements ko leny ky lie list.get lety hein 
            System.out.print(list.get(i)+ "->");
        }
        System.out.println("null");
        
        list.removeFirst();     // to remove first element of list 
        System.out.println(list);
        
        list.removeLast();      // to remove last element of list 
        System.out.println(list);
        
        list.remove(1 );   // to remove a list from an index 
        System.out.println(list);

    }
}
