package day02;

public class Porche extends Car {
    
    private String turbo; 

    public Porche(){
        setColour("red");
    }

    public Porche (String colour, String registration) {
        setColour (colour); 
        setRegistration (registration);
    }

    //I can no longer 
    @Override
    public void setColour(String c){ }

    public String getTurb() { return turbo; }

    public void setColour (String c){ }

    public void accelerate () {
        this.accelerate++; 
        if(this.accerlerate > 4){
            this.turbo = "on"; 
        } 
    }

    public void decelerate (){
        this.accelerate--; 
        if (this.accelerate <=4){
            this.turbo = "off";
        }
    }
}
