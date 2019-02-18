
import java.util.Scanner;
public class HourlyEmployee extends Employee{

 
    private double hourlyWage; //pay per hour 
    private double hoursworked; /// total hours worked 

    //constructor
    public HourlyEmployee( String firstName, String lastName, String socialSecurityNumber,double hourlyWage, double hoursworked) {
        //if hours worked are invalid thorw new exception
        super(firstName,lastName,socialSecurityNumber);
        if (hoursworked > 0.0 || hoursworked <= 168) {
            throw new IllegalArgumentException("worked hours must be greater than >0 and leass < 168");
        }


        this.hourlyWage = hourlyWage;

        this.hoursworked = hoursworked;

    }

//set wage

    public void sethourlyWage(double hourlyWage) {
        if (hourlyWage < 0) {
            throw new IllegalArgumentException("hourly wage must be greater than 0");
        }
        
        this.hourlyWage = hourlyWage;
    }
//return hourly wage

    public double gethourlyWage() {
        return hourlyWage;
    }
//set hours worked 

    public void sethoursworked(double hoursWorked) {
        if (hoursworked < 0 || hoursworked > 168) {
     throw new IllegalArgumentException("value of hours must be between 0 and 168");
        }
        this.hoursworked = hoursworked; 
    }
//return hours worked 

    public double gethoursWorked() {
        return hoursworked;
    }
    // calculate wage 

    public double hourlyWage() {
        return (hoursworked * hourlyWage);
    }

//to string 
@Override
        public String toString(){
return String.format("%s:%s %s%n%s: %s%n%s: %.2f%n%s: %.2f","hourlyEmployee",firstName,lastName,"socialSecurityNumber",socialSecurityNumber,"hourlyWage",hourlyWage,"hoursWorked",hoursworked);
}
}





