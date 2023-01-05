package day02; 

public class CarMain {

    //entry point 
    public static void main(String [] args){
        // Instantiate an instance of car
        Car c = new Car(); 
        c.setColour("grey"); 
        c.setRegistration("sdf1234B"); 
        c.start();
        System.out.printf("Is the car started? %b\n", c.isStarted());

        c.getOutOfMyWay();

        // Car d = new
    }
    
}
