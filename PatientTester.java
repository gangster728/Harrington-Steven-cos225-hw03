public class PatientTester {
    public static void main(String args[]){
        
        //makes a PatientManager object holding the arrayList of size 10
        //prints the object out
        PatientManager PatientManager = new PatientManager();
        System.out.println(PatientManager);
        
        //creates 4 patient objects and adds them to the arrayList held by PatientManager
        Patient p1 = new Patient(1, 200);
        PatientManager.addPatient(p1);

        Patient p2 = new Patient(2, 400);
        PatientManager.addPatient(p2);

        Patient p3 = new Patient(3, 600);
        PatientManager.addPatient(p3);

        Patient p4 = new Patient(4, 800);
        PatientManager.addPatient(p4);

        //prints the PatientManager with the 4 objects
        System.out.println(PatientManager);

        //takes 320 caffeine away from all patients, removing as neccessary
        PatientManager.caffeineAbsorption();
        PatientManager.caffeineAbsorption();
        
        //prints out PatientManager object
        System.out.println(PatientManager);

        //removes the patient with the highest caffeine
        //the innermost function get a index, so that removePatient knows where to go
        PatientManager.removePatient(PatientManager.HighestCaffeine());
        
        //prints out PatientManager object
        System.out.println(PatientManager);
    }
}
