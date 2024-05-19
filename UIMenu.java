import java.util.Scanner;

public class UIMenu {
    public static final String []   MONTH = {"Enero ","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Dieciembre"};

    static void showMenu(){
        System.out.println("welcome to My Appointments");
        System.out.println("seleccion la opcion deseada");
        
        int response = 0;

        do{
            System.out.println("1. Doctor");
            System.out.println("2. patient");
            System.out.println("0. salir");

            Scanner sc = new Scanner(System.in);
            response  = Integer.valueOf(sc.nextLine());
            
            switch(response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("thank you for you visit ");
                    break;
                default:
                    System.out.println("plase select a correct answer");
            }

        }while (response != 0);

    }
   
    static void showPatientMenu(){
        int response = 0;
        
        do {
            System.out.println("/n/n");
            System.out.println("patient");
            System.out.println("1. Book an Appointment ");
            System.out.println("2. My Appointment");
            System.out.println("0. Return");
            Scanner  sc = new Scanner(System.in);
            response =Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    System.out.println(":: Book an appointment  ");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTH[i]);
                    }
                    break;
                case 2:
                    System.out.println(":: My appointments ");
                    break;
                case 0:
                    showMenu();
                    break;

            }
        }while(response != 0);
    
    }
     


    }

