package day02; 

public class Car {

//members
private String registration; 
private String colour; 
private int year; 
private boolean started; 

//constructors
public Car(){
    //default constructor
    this.colour = "white"; 
}

public Car (String colour, String registration){
    this.colour = colour; 
    this.registration = registration;
}

//getters and setters
public String getRegistration () {return this.registration; }
public void setRegistration (String r){this.registration = r;}

public String getColour(){
    return colour;
}
public void setColour(String colour){this.colour = colour;}
public int getYear() {return year;}

public void start() {
}

public Object isStarted() {
    return null;
}

public void getOutOfMyWay() {
}

} 