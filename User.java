
//clase padre de loas clases Doctor y patient
public class User {
    private int id;
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;
//constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

//getters and setters de los atributos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()>8){
            System.out.println("Elnumero telefonico debe ser de 8 digitos maximo");
        }else if (phoneNumber.length() == 8 ){
            this.phoneNumber = phoneNumber;
        }
        
    }

//modificacion de metodo con toString
    @Override
    public String toString(){
        return "User: " + name + ", Email: " + email + "\n Address: " + adress +".phone: "+ phoneNumber;
    }



}
