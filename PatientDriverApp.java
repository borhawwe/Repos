package p;
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (The driver class, the PatientDriverApp class, is in charge of generating and presenting patient and procedure data. 
 * By generating instances of the Patient and Procedure classes, initializing their data, and displaying the result, it ties everything together. 
 * The primary method, which serves as the program's entry point, is contained in this class. It just shows pre-defined patient and procedure details; 
 * it does not take user input.
)
 * Due: 10/04/2024
 * Platform/compiler:Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Borhawwe Debelo
*/

public class PatientDriverApp {
    public static void main(String[] args) {
    	
//This includes all of the information about the patient that will be displayed 
    	Patient patient = new Patient(
        		"Jenny", 
        		"Elaine", 
        		"Santori",
        		"123 Main Street", 
        		"MyTown", 
        		"CA", "01234",
                "Bill Santori", "777-555-1212"
        );

        Procedure p1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.00);
        Procedure p2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
        Procedure p3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);

        // This will showcase the patient information to the user 
        patient.displayInfo();

        // This below will showcase the procedure information of the patient to the user 
        p1.displayProcedure();
        p2.displayProcedure();
        p3.displayProcedure();

        // This will calculate the total charges
        double ThetotalCharges = p1.getCharge() + p2.getCharge() + p3.getCharge();
        System.out.printf("Total Charges: $%,.2f\n", ThetotalCharges);
        System.out.println();

        // Display student info
        System.out.println("Student Name: Borhawwe Debelo");
        System.out.println("MC#: M21148081");
        System.out.println("Due Date: 08/10/2024");
    }
}
