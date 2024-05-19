
//extends para poner como herencia padre a USER
public class Patient extends User {
    // Atributos
    private String birthday;
    private Double weight;
    private  Double height;
    private String blood;
//constructor
    Patient(String name , String email){
        super(name, email);
        
    }
//getters and setters de los atributos

    public void setWeight( double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + "Mts";
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public String getBlood() {
        return blood;
    }


    public void setBlood(String blood) {
        this.blood = blood;
    }
//Modificacion del metodo con toString
    public String toString(){
        return super.toString() + "\nAge: " + birthday + "\n Weight: "+ getWeight() + "\nHeight: " + getHeight()+"\nBlood: " + blood;
    }
    
}
