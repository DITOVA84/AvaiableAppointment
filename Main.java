//Archivo principal que se agregan las nuevos moldes para qcrrear el objeto 
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //UIMenu.showMenu();

        Doctor myDoctor= new Doctor("Diego betancourt ","Ditoba@gmail.com");

        myDoctor.addAvailableAppointment(new Date(), "4pm ");
        myDoctor.addAvailableAppointment(new Date(), "10am ");
        myDoctor.addAvailableAppointment(new Date(), "1pm ");
        System.out.println(myDoctor);
        /* 
        for (Doctor.AvailableAppointment aA  : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */
        Patient patient =new Patient("Diego", "ditova8@gmail.com");
        
        System.out.println(patient);
        
    }
   
  
}
