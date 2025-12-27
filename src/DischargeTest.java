// Main class to test DischargeStack
public class DischargeTest {

    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        // Add 5 discharge records
        for (int i = 1; i <= 5; i++) {
            stack.push(new DischargeRecord(i));
        }

        // Process (pop) 2 discharge records
        stack.pop();
        stack.pop();

        // Print remaining discharge records
        System.out.println("Remaining Discharge Records:");
        stack.printStack();
    }
}

