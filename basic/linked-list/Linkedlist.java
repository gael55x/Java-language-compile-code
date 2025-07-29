public class Linkedlist{
    private static class Node{
        int val; 
        Node next; 

        Node(int val) {
            this.val = val; 
            this.next = null; 
        }
    }

    private Node head; 

    public void insert(int val, int idx){
        Node newN = new Node(val);

        if (idx == 0){
            newN.next = head; 
            head = newN; 
            return; 
        }

        Node curr = head; 
        int c = 0; 

        while (curr != null && c < idx - 1){
            curr = curr.next; 
            c++; 
        }
        // 1 -> 2 -> 3 -> 4
        // insert: 1.2 idx: 2
        // 1 -> 2 -> 1.2 -> 3 -> 4
        newN.next = curr.next; 
        curr.next = newN; 

    }

    public int delete(Node node){

    }

    public void printlist(){

    }

    public static void main(String[] args){

    }
}