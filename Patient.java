package p;
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (A patient's name, address, phone number, and emergency contact information are all 
 * represented by the Patient class. The patient's data is stored and managed by this class, which also offers 
 * methods for constructing and retrieving the patient's complete name, address, and emergency contact details.
 *  With the use of getter and setter methods, it wraps all patient data and guarantees controlled access.)
 * Due: 10/08/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Borhawwe Debelo
*/

public class Patient {
    private String TheFirstName;
    private String TheMiddleName;
    private String TheLastName;
    private String TheAddress;
    private String TheCity;
    private String TheState;
    private String TheZipCode;
    private String TheEmergencyContactName;
    private String TheEmergencyContactPhonenum;

    // This parameterized constructor accepts and helps assign the information of the patient 
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zip, String emergencyContactName, String emergencyContactPhone) {
        this.TheFirstName = firstName;
        this.TheMiddleName = middleName;
        this.TheLastName = lastName;
        this.TheAddress = address;
        this.TheCity = city;
        this.TheState = state;
        this.TheZipCode = zip;
        this.TheEmergencyContactName = emergencyContactName;
        this.TheEmergencyContactPhonenum = emergencyContactPhone;
    }

    // This method allows us to make the name of the patient 
    public String buildFullName() {
        return TheFirstName + " " + TheMiddleName + " " + TheLastName;
    }

    // This method allows us to to make the address of the patient 
    public String buildAddress() {
        return TheAddress + " " + TheCity + " " + TheState + " " + TheZipCode;
    }

    // This method is used to make the emergency contact name for the patient 
    public String buildEmergencyContact() {
        return TheEmergencyContactName + " " + TheEmergencyContactPhonenum;
    }

    // This method is going to allow us to display the information of the patient(name,address,emergency contact)
    public void displayInfo() {
        System.out.println("Patient info:");
        System.out.println("Name: " + buildFullName());
        System.out.println("Address: " + buildAddress());
        System.out.println("EmergencyContact: " + buildEmergencyContact());
        System.out.println();
    }
}
