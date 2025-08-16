import java.util.Scanner; 

class Node {
    int val; 
    Node next; 

    Node(int val){
        this.val = val;
        this.next = null;
    }
}


public class Linkedlist{
    static Node head = null; 
    
    static Node insert(Node head, int n){
        Node ne = new Node(n); 
        if (head == null){
            head = ne; 
            return head; 
        }
        Node curr = head; 
        while (curr.next != null){
            curr = curr.next; 
        }
        curr.next = ne; 
        return head; 
    }

    static Node deleteIdx(Node head, int idx){
        if (idx == 0){
            if (head == null) return head; 
            head = head.next; 
            return head; 
        }

        Node curr = head; 
        int i = 0; 
        while (curr != null && curr.next != null && i < idx - 1){
            curr = curr.next; 
            i++; 
        }
        if (curr == null || curr.next == null) return head; 

        curr.next = curr.next.next;
        return head; 

    }

    static void print(Node head){
        System.out.printf("Linked list: "); 
        Node curr = head; 
        while(curr != null){
            System.out.printf("%d ", curr.val); 
            curr = curr.next; 
        }
    }

    public static void main(String[] args){
        Scanner s  = new Scanner(System.in); 
        System.out.printf("Enter the number of elements: "); 
        int n = s.nextInt(); 
        for (int i = 0; i < n; i++){
            int val; 
            System.out.printf("Enter element %d: ", i+1); 
            val = s.nextInt(); 
            head = insert(head, val); 
        }
        print(head); 
        int idx; 
        System.out.printf("Enter idx to delete: "); 
        idx = s.nextInt(); 
        head = deleteIdx(head, idx); 
        print(head); 
    }

}   