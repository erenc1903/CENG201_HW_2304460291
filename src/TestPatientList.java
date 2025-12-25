public class TestPatientList {
    public static void main(String[] args) {
        PatientList list = new PatientList();
        list.addPatient(new patient(1, "Ali Yılmaz", 5, 30));
        list.addPatient(new patient(2, "Ayşe Demir", 8, 45));
        list.addPatient(new patient(3, "Mehmet Kaya", 3, 25));
        list.addPatient(new patient(4, "Zeynep Çelik", 7, 60));
        list.addPatient(new patient(5, "Can Aydın", 4, 35));
        list.removePatient(3);
        patient found = list.findPatient(2);
        if (found != null) {
            System.out.println("Found: " + found);
        }
        System.out.println("Patient List:");
        list.printList();
    }
}
