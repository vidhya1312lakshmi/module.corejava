import java.io.*;
import java.util.*;

public class Cars {
    String make;
    String model;
    int year;
    public Cars(String make, String model, int year) {
        this.make = make;   
        this.model = model; 
        this.year = year;   
    }
    public void displayDetails() {
        System.out.println("--- Car Details ---");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {       
        Cars myCar = new Cars("Toyota", "Camry", 2022);
        myCar.displayDetails();
        Cars anotherCar = new Cars("Honda", "Civic", 2023);
        anotherCar.displayDetails();
        System.out.println("\nAccessing attributes directly:");
        System.out.println("My car's make: " + myCar.make);
        System.out.println("Another car's model: " + anotherCar.model);
    }
}