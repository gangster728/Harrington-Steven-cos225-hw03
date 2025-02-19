import java.util.ArrayList;
public class PatientManager {

    ArrayList<Patient> patients = new ArrayList<Patient>();
    public PatientManager(){
        
        for(int i = 0; i < 10;i++){
            patients.add(i,null);
            }
    }

    public int addPatient(Patient patient){
        for(int i = 0; i < 10;i++){
            if(patients.get(i) == null){
                patients.set(i,patient);
                return i;
            }
        }
        return -1;
    }

    public Patient removePatient(int i){
        Patient patient = patients.get(i);
        patients.set(i,null);
        return patient; 
    }

    public void caffeineAbsorption(){
        Patient spot;
        for(int i = 0; i < patients.size();i++){
            
            spot = patients.get(i);
            if (spot != null){
                spot.CaffeineLevel = spot.CaffeineLevel - 160;
                if(spot.CaffeineLevel <= 0){
                patients.set(i,null);
                }
            }
        }
    }

    public int HighestCaffeine(){
        double value = 0;
        int index = 0;
        Patient spot;
        for(int i = 0; i < patients.size();i++){
            spot = patients.get(i);
            if (spot != null){
                if (spot.CaffeineLevel > value){
                value = spot.CaffeineLevel;
                index = i;}
                else{
                    index = index;
                }}
            }
            
        return index;
    }

    public String toString(){
        Patient spot;

        for(int i = 0; i < patients.size();i++){

            spot = patients.get(i);

            if (spot != null){
                String result = "";

                for(int j = 0; j < patients.size();j++){
                    
                    spot = patients.get(j);
                    if (spot != null){
                        result = result + " " + spot.IdNumber + " " + spot.CaffeineLevel + "\n";
                    }
                }  
            return result;
            }
        }
        return " Empty";
            
    
}
}
