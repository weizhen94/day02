package day02;

public class CarMain2 {

    public static void main (String [] args){
        Porche p = new Porche(); 

        Car c = new Porche("yellow", "s1234z");
        
        System.out.printf(">>>> registration: %s\n", c.getRegistration()); 

        p = (Porche)c; 
        p.accelerate(); 

        System.out.printf(">>>> p.registration: %s\n", p.getRegistration(), p.getColour()); 

    }
    
}
