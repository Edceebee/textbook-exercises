package chapter3;

  /* In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should
  include the person’s first name, last name, gender, date of birth (consisting of separate attributes for the
  month, day and year of birth), height (in inches) and weight (in pounds). Your class should have a constructor
  that receives this data. For each attribute, provide set and get methods. The class also should include methods
  that calculate and return the user’s age in years, maximum heart rate and target-heart-rate range Exercise 2.33).
   Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile for
   that person and prints the information from that object—including the person’s first name, last name, gender,
   date of birth, height and weight—then calculates and prints the person’s age in years, BMI, maximum heart rate
   and target-heart-rate range.



BMI = weightInPounds × 703 / heightInInches × heightInInches

BMI = weightInKilograms /
        heightInMeters × heightInMeters
        */

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private int heightInInches;
    private double weightInPounds;



    public HealthProfile(String firstName, String lastName, String gender, String monthOfBirth,
                         int dayOfBirth, int yearOfBirth, int heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public int age(){

        int age = 2020 - yearOfBirth;
        return age;
    }
    public int maximumHeartRate() {

        int maximumHeartRate = 220 - (2020 - yearOfBirth);
        return maximumHeartRate;
    }
    public float targetHeartRate() {
        float targetHeartRate = 85 / 100 * (220 - (220 - yearOfBirth));
        return targetHeartRate;
    }
    public double BMI(){
        double BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
        return BMI;

    }


}


