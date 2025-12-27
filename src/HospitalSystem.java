import java.util.HashMap;

public class HospitalSystem {

    private PatientList patientList;          // Task 1
    private PriorityTreatmentQueue queue;     // Task 4
    private DischargeStack dischargeStack;    // Task 3
    private HashMap<Integer, patient> map;    // Hızlı erişim

    public HospitalSystem() {
        patientList = new PatientList();
        queue = new PriorityTreatmentQueue();
        dischargeStack = new DischargeStack();
        map = new HashMap<>();
    }

    public void addPatient(patient p) {
        patientList.addPatient(p);
        map.put(p.id, p);
    }

    public void addTreatmentRequest(int patientId, boolean priority) {
        queue.enqueue(new TreatmentRequest(patientId, priority));
    }

    public void processTreatment() {
        TreatmentRequest req = queue.dequeue();
        if (req != null) {
            dischargeStack.push(new DischargeRecord(req.patientId));
        }
    }

    public void printSystemState() {
        patientList.printList();
        dischargeStack.printStack();
    }

        public static void main(String[] args) {

            // Create hospital system
            HospitalSystem system = new HospitalSystem();

            System.out.println("=== ADDING PATIENTS ===");

            // 1️⃣ Add 10 patients
            system.addPatient(new patient(1, "Ali Yilmaz", 5, 30));
            system.addPatient(new patient(2, "Ayse Demir", 9, 45));
            system.addPatient(new patient(3, "Mehmet Kaya", 3, 25));
            system.addPatient(new patient(4, "Zeynep Celik", 8, 60));
            system.addPatient(new patient(5, "Can Aydin", 4, 35));
            system.addPatient(new patient(6, "Elif Arslan", 10, 50));
            system.addPatient(new patient(7, "Murat Koc", 6, 40));
            system.addPatient(new patient(8, "Selin Oz", 7, 28));
            system.addPatient(new patient(9, "Burak Tas", 2, 22));
            system.addPatient(new patient(10, "Ece Gunes", 1, 18));

            // 2️⃣ Add treatment requests
            System.out.println("\n=== ADDING TREATMENT REQUESTS ===");

            // 5 normal requests
            system.addTreatmentRequest(1, false);
            system.addTreatmentRequest(3, false);
            system.addTreatmentRequest(5, false);
            system.addTreatmentRequest(7, false);
            system.addTreatmentRequest(9, false);

            // 3 priority requests
            system.addTreatmentRequest(2, true);
            system.addTreatmentRequest(4, true);
            system.addTreatmentRequest(6, true);

            // 3️⃣ Add 2 discharge records manually
            System.out.println("\n=== ADDING DISCHARGE RECORDS ===");
            system.processTreatment();
            system.processTreatment();

            // 4️⃣ Process 4 treatment requests (priority first)
            System.out.println("\n=== FINAL SYSTEM STATE ===");
            system.printSystemState();

        }}
