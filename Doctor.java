// se crea la clase doctor para que sea como molde  paar utilizarla en el archivo principal como Modulo

import java.util.ArrayList;
import java.util.Date;

//extends para poner como herencia padre a USER
public class Doctor extends User {
//Atributos
   private String speciality;
//constructor
   Doctor(String name , String email){
        super(name, email);
        this.speciality=speciality;
        System.out.println("El nombre del Doctor asignado es : " + name);
       
    }

    public String getSpeciality() {
    return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



//arraylist lo genera para que contenga las citas 
    ArrayList<AvailableAppointment> availableAppoinment = new ArrayList<>();

//metodo de addAvailableAppointment para agregar y crear citas  tipo clase en el array
    public void addAvailableAppointment(Date date, String time){
        availableAppoinment.add(new Doctor.AvailableAppointment(date, time));
    }
//metodo con el get para devolver el contenido del array availableAppointment
        public ArrayList<AvailableAppointment> getAvailableAppointments(){
            return availableAppoinment;
        }
    @Override
     public String toString (){
        return super.toString() + "\nSpeciality:" + speciality + "\nAvailable: " + availableAppoinment.toString();
     }    

    public static class AvailableAppointment{    
    private int id;
    private Date date;
    private String time;
    
    public AvailableAppointment(Date date, String time) {
        this.date = date;
        this.time = time;
    }

//getters and setters de los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString (){
        return "Available Appointment \n Date: " + date + "\nTime: " + time ;   
     }

    }
}
