// This class implements a Stack using a Linked List structure
public class DischargeStack {

    // Node class for stack elements
    private class Node {
        DischargeRecord data; // Discharge data
        Node next;            // Reference to next node

        Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor initializes empty stack
    public DischargeStack() {
        top = null;
    }

    // Push operation: adds a record to the top of the stack
    public void push(DischargeRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation: removes and returns the top record
    public DischargeRecord pop() {
        if (top == null) {
            return null;
        }

        DischargeRecord removed = top.data;
        top = top.next;
        return removed;
    }

    // Peek operation: returns top record without removing
    public DischargeRecord peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    // Prints all discharge records in the stack
    public void printStack() {
        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
