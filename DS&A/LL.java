class LL {
    // linked list in the form very sturctual form
    Node head; // creaating node of type head
    private int size;

    LL() {
        this.size = 0;
    }

    class Node { // sb sy phely linked list ka node class banya h or node ky andr hum data or
                 // next point store krsty hein we represent this in form of class
        String data; // the thing which we have to store is data whose type is String
        Node next; // and to store next point we use node becuase next ka mtlb h next wala node to
                   // usko store bhi node ky andr krwayen gye

        Node(String data) { // is ky andr node ka hi constructor form krdiya h (constructor in Java is a
                            // special method that is used to initialize objects)
            this.data = data; // "this" keyword can be used to invoke one constructor from another constructor
                              // within the same class,
            this.next = null; // jo next hoga wo humahesa null hoga start m
            size++;
        }
    }
    // node class complete over here

    // there are two types of add in first or in last

    // add - first , last
    public void addFirst(String data) { // first of all writing function of adding first
        Node newNode = new Node(data); // first of all creating new node
        if (head == null) { // sb sy phely ye check krna h ky head null h mtlb koi LL bhi exist krti h
            head = newNode; // agar head null h tu ek node bana h or ussy head banana dena h
            return; // return krjyen gye phir dubara
        }
        newNode.next = head; // agr already ek list exist krti h mtlb head null nhi h tu newNode ka jo next h
                             // wo head ki trf point kry ga
        head = newNode; // new node ko head bandiya / ya head ki value banjyegyi new node
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data); // first of all creating new node
        if (head == null) { // sb sy phely ye check krna h ky head null h mtlb koi LL bhi exist krti h
            head = newNode; // agar head null h tu ek node bana h or ussy head banana dena h
            return; // return krjyen gye phir dubara
        }
        Node curNode = head; // nodes ky across travel krny lie sb sy phely ek node bann h or usko head ki
                             // trf point krwana h
        while (curNode.next != null) { // jab tk ky curr node ka next null nhi hojata tb tk travel krna h
            curNode = curNode.next; // or current node ko current node ka next ban dyenye
            // agar hum head ko update kryen toh starting point of linked list jo h wo shaat
            // hojye ga we are updating cuurent node
        }
        curNode.next = newNode; // or jesy hi hum travel krty huywe last m ponchye tu cuurent node jo last m tha
                                // us ko point krwadiya new node ki traf jis ka next null h

    }

    // print
    public void printList() {
        // agar linkeed list hi shaat h tu us ky lie cndition dekhni h ky head agr null
        // ki trf h tu list ko empty print krdo
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // ye case tb ka h jab humari linked list phely sy majood hogyi
        Node curNode = head; // nodes ky across travel krny lie sb sy phely ek node bann h or usko head ki
                             // trf point krwana h
        while (curNode != null) { // jab tk ky curr node ka next null nhi hojata tb tk travel krna h
            System.out.print(curNode.data + "->"); // or phbbir usko print krwa rhy rhyein [current node ky data ko
                                                   // print krwaya ]
            curNode = curNode.next; // or current node ko update krwadiya

        }
        System.out.println("Null"); // last m null print

    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseit() {
        if(head == null || head.next == null){
            return;

        }
        // cndition will be in loop cuz we have to go forward by 3
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode =  currNode.next;
            currNode = prevNode;
            

            // update
             prevNode = currNode ;
             currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public static void main(String[] args) {
        LL list = new LL(); // linked list bana ky lie apni hi class ki object banai pry gyi
        // list.addFirst("a");
        // list.printList();

        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deletelast();
        // list.printList();

        // System.out.println(list.getSize());

        // list.addFirst("this");
        // list.printList();

        // System.out.println(list.getSize());

        // list.addLast("list");
        // list.printList();

        // System.out.println(list.getSize());

        // reversing string shit

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        list.reverseit();
        list.printList();
    }
}