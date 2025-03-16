package DataStructure.LinkedList;

public class ReverseLList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1 = reverseLinkedList(n1);
        printLinkedList(n1);

    }

    private static Node reverseLinkedList(Node n1) {
        Node cur = n1;
        Node prv = null;
        Node nxt;
        while (cur != null) {
            nxt = cur.next;

            cur.next = prv;
            prv = cur;
            cur = nxt;
        }
        return prv;
    }

    private static void printLinkedList(Node n1) {
        Node cur = n1;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
