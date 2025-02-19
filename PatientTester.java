public class PatientTester {
    public static void main(String args[]){
        PatientManager PatientManager = new PatientManager();
        System.out.println(PatientManager);
        
        Patient p1 = new Patient(1, 200);
        PatientManager.addPatient(p1);

        Patient p2 = new Patient(2, 400);
        PatientManager.addPatient(p2);

        Patient p3 = new Patient(3, 600);
        PatientManager.addPatient(p3);

        Patient p4 = new Patient(4, 800);
        PatientManager.addPatient(p4);

        System.out.println(PatientManager);

        PatientManager.caffeineAbsorption();
        PatientManager.caffeineAbsorption();
        
        System.out.println(PatientManager);

        PatientManager.removePatient(PatientManager.HighestCaffeine());
        
        System.out.println(PatientManager);
    }
}
