package chapter3;

/* Create a class called HeartRates. The class attributes should include the person’s first name, last name and
    date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have
     a constructor that receives this data as parameters. For each attribute provide set and get methods. The
      class also should include a method that calculates and returns the person’s age (in years), a method that
      calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s
       target heart rate. Write a Java app that prompts for the person’s information, instantiates an object of
       class HeartRates and prints the information from that object—including the person’s first name, last name
       and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and
       target-heart-rate range */


public class HeartRates {

    private String firstName;
    private String lastName;
    private  String monthOfBirth;
    private String dayOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, String monthOfBirth, String dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int age(){
        int age = 2020 - yearOfBirth;
        return age;
    }

    public double maximumHeartRate(){

        double maximumHeartRate = 220 - (2020 - yearOfBirth);
        return maximumHeartRate;
    }

    public double targetHeartRate(){
    double targetHeartRate = 85/100 *(220 - (220 - yearOfBirth));
    return targetHeartRate;

    }



}
