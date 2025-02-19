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

            //if the spot is equal to null, then nothing is occupying the spot
            if(patients.get(i) == null){

                //we add the patient to this spot and return the index
                patients.set(i,patient);
                return i;
            }
        }
        //incase it can't add anything a -1 is returned
        return -1;
    }


    //removes a patient at the given index
    public Patient removePatient(int i){

        //get the object at given index, set it to null
        Patient patient = patients.get(i);
        patients.set(i,null);

        //returns the patient object
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

            //if there is something in the spot, it reduces the caffeine level by 160
            if (spot != null){
                spot.CaffeineLevel = spot.CaffeineLevel - 160;

                //if it reaches 0, then it removes it from the arraylist
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

            //spot becomes the current patient object being looked at
            spot = patients.get(i);

            //if there is something there, then it is compared to the currently highest caffeine level
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

            //spot becomes the current patient object
            spot = patients.get(i);

            //if this is deemed true at any point, it means there is something in the arrayList
            if (spot != null){
                //initizalize a variable result
                String result = "";

                //looks through each value in the arrayList
                for(int j = 0; j < patients.size();j++){
                    
                    //spot becomes the current patient
                    spot = patients.get(j);

                    //if there is something at the position, it adds the ID and caffeine level to the variable result
                    if (spot != null){
                        result = result + " " + spot.IdNumber + " " + spot.CaffeineLevel + "\n";
                    }
                } 

                //returns the final result
                return result;
            }
        }
        //all the spots were not occupied, returns empty
        return " Empty";
            
    
}
}
