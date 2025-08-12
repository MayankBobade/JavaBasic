public class classtwentysenven {
    Node head; // head of the list

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head; // fixed: use dot instead of arrow
        head = newnode;
    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
// write the functions to delete from front last and middle by yourself for practice
    public static void main(String[] args) {
        classtwentysenven list = new classtwentysenven(); // creating an object

        list.addfirst("a");
        list.addfirst("b");
        list.addlast("c");

        list.printlist(); // Output: b -> a -> c -> null
    }
}

// aray list is implemented inside memory with help of a dynamic array,once the size of dynamic sized array is filled then the new larger sized array is created and original elements are copied inside it
// in array lsit the TC to insert at start and middle is O(n) and time complexity to search the elment is O(1)
// linkedlist is made up of data and pointers which point to next elements
// in linkedlist the TC of insertion at start is O(1) where as the TC for searching the element in the linkedlist is O(n). linkedlist is variable in size and occupiies non-contigious memeory location


 