import java.util.ArrayList;
public class PatientManager {

    //declares a empty patient arraylist
    ArrayList<Patient> patients = new ArrayList<Patient>();

    //constructor makes the arraylist 10 spots and set every spot to null
    public PatientManager(){
        
        for(int i = 0; i < 10;i++){
            patients.add(i,null);
            }
    }

    //add a patient to a index, and returns that index
    public int addPatient(Patient patient){

        //looks through each spot in the arraylist
        for(int i = 0; i < 10;i++){
            if(patients.get(i) == null){
                patients.set(i,patient);
                return i;
            }
        }
        return -1;
    }

    //removes a patient at the given index
    public Patient removePatient(int i){

        //get the object at given index, and set the index to null
        Patient patient = patients.get(i);
        patients.set(i,null);
        return patient; 
    }

    //reduces the caffeine levels of all spot by 160
    public void caffeineAbsorption(){

        //create a place holder object named spot
        Patient spot;

        //looks through all spot in the arraylist
        for(int i = 0; i < patients.size();i++){
            
            //spot becomes the object at that index
            spot = patients.get(i);

            if (spot != null){
                spot.CaffeineLevel = spot.CaffeineLevel - 160;

                if(spot.CaffeineLevel <= 0){
                patients.set(i,null);
                }
            }
        }
    }


    //this method finds the patient with the highest caffeine and returns the index
    public int HighestCaffeine(){

        //value is a placeholder to compare the caffeine levels
        double value = 0;
        //index keeps track of the position of the highest patient
        int index = 0;
        //placeholder spot to hold the patient objects
        Patient spot;

        //looks through each spot in the arraylist
        for(int i = 0; i < patients.size();i++){

            spot = patients.get(i);

            if (spot != null){
                if (spot.CaffeineLevel > value){
                //if it is higher then it's caffeine level takes place of value
                //As well as index becomes it's position
                value = spot.CaffeineLevel;
                index = i;}}
            }
        //returns the highest caffeine patient index value
        return index;
    }

    //makes a method that will be called when the PatientManager object is printed
    public String toString(){

        //creates a placeholder object spot
        Patient spot;

        //looks through each spot in the arraylist
        for(int i = 0; i < patients.size();i++){

            spot = patients.get(i);
            //if this is deemed true at any point, it means there is something in the arrayList
            if (spot != null){
                //initizalize a variable result
                String result = "";
                //looks through each value in the arrayList
                for(int j = 0; j < patients.size();j++){
                    
                    spot = patients.get(j);
                    if (spot != null){
                        result = result + " " + spot.IdNumber + " " + spot.CaffeineLevel + "\n";
                    }
                } 
                return result;
            }
        }
        //all the spots were empty, returns empty
        return " Empty";
}
}
