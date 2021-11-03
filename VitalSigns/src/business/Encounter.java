package business;

import java.util.ArrayList;
/**
 *
 * @author nickk
 */
public class Encounter {
    
    private ArrayList<VitalSign> history;
    
    public Encounter() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSign> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign createAndAddVitalSign() {
        VitalSign vitalSign = new VitalSign();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        history.remove(vitalSign);
    }
}
