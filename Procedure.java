package p;
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (A medical process that a patient goes through is represented by the procedure class. 
 * It contains information on the procedure's name, date, performing physician, and related cost. 
 * Individual process handling falls under the purview of this class, which can also return the operation's 
 * cost or provide the procedure's details.
)
 * Due: 10/08/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Borhawwe Debelo 
*/
//This class is declaring these private variables that will be used throughout the program 
public class Procedure {
    private String TheName;
    private String TheDate;
    private String ThePractitioner;
    private double TheAmountCharged;

    // Constructor with parameter, this passes and assigns the procedure details for the patient  
    public Procedure(String ProcedureName, String ProcedureDate, String Practitioner, double Charge) {
        this.TheName = ProcedureName;
        this.TheDate = ProcedureDate;
        this.ThePractitioner = Practitioner;
        this.TheAmountCharged = Charge;
    }

    // Method to showcase the details of the procedures for the patients 
    public void displayProcedure() {
        System.out.println("Procedure: " + TheName);
        System.out.println("ProcedureDate:" + TheDate);
        System.out.println("Practitioner:" + ThePractitioner);
        System.out.println("Charge:" + TheAmountCharged);
        System.out.println();
    }

    // Accessor for the amount that is charged of how much the patient was
    public double getCharge() {
        return TheAmountCharged;
    }
}
