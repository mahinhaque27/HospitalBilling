import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int id;
        String firstName;
        String lastName;
        String docFirst;
        String docLast;
        String docSpecial;

        Scanner input = new Scanner(System.in);

        //Read in information from user
        System.out.print("Enter patient's ID: ");
        id = input.nextInt();
        System.out.print("Enter patient's first name: ");
        firstName = input.nextLine();
        firstName = input.nextLine();
        System.out.print("Enter patient's last name: ");
        lastName = input.nextLine();
        System.out.print("Enter doctor's first name: ");
        docFirst = input.nextLine();
        System.out.print("Enter doctor's last name: ");
        docLast = input.nextLine();
        System.out.print("Enter doctor's specialty: ");
        docSpecial = input.nextLine();

        //Create Objects
        Patient pat1 = new Patient(firstName,lastName,id);
        Doctor doc1 = new Doctor(docFirst,docLast,docSpecial);
        Bill bill1 = new Bill(1000,2000,3000);

        //Print info to screen
        System.out.println();
        System.out.println("Patient Info");
        System.out.println("-------------------------------");
        System.out.println("Patient: " + pat1.getName());
        System.out.println("Attending Physician: " + doc1.getName() + " " + doc1.getSpecialty());
        System.out.println("Admit Date: " + pat1.admitDate.getDate());
        System.out.println("Discharge Date: " + pat1.dischargeDate.getDate());
        System.out.println("\n");
        bill1.printBill();
        System.out.println("----------------------------");
        System.out.println("Total Charges: $" + (bill1.pharCharge + bill1.docFee + bill1.roomCharge));

        //Write to .txt file

        try{
            FileWriter output = new FileWriter(firstName+lastName+".txt");
            output.write("Patient Info");
            output.write("-------------------------------");
            output.write("Patient: " + pat1.getName());
            output.write("Attending Physician: " + doc1.getName() + " " + doc1.getSpecialty());
            output.write("Admit Date: " + pat1.admitDate.getDate());
            output.write("Discharge Date: " + pat1.dischargeDate.getDate());
            output.write("\n\n");
            output.write("----------------------------");
            output.write("Total Charges: $" + (bill1.pharCharge + bill1.docFee + bill1.roomCharge));
            System.out.println("Written to file successfully");


        }
        catch(IOException e){
            System.out.println("Error trying to write to file");
        }
    }
}