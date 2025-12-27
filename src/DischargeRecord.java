// This class represents a discharge record in the hospital system
public class DischargeRecord {

    // ID of the discharged patient
    int patientId;

    // Time when the patient is discharged
    long dischargeTime;

    // Constructor initializes patient ID and discharge time
    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    // Prints discharge record information
    @Override
    public String toString() {
        return "Patient ID: " + patientId +
                ", Discharge Time: " + dischargeTime;
    }
}

