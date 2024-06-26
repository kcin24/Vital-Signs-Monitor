package business;

/**
 *
 * @author nickk
 */
public class Patient {
    
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private Encounter vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new Encounter();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
    public Encounter getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(Encounter vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
