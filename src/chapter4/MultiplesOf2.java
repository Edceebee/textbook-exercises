package chapter4;

/* (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
        command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
        should not terminate (i.e., it should create an infinite loop). What happens when you run this program? */




public class MultiplesOf2 {
    public static void main(String[] args) {

        int multiple = 1;
        int counter = 1;

        while (counter > 0) {
            multiple += counter;

            System.out.println(multiple);
            counter = multiple;
        }
    }
}


/*  my loop terminated cuz it got to the point where the data type used couldn't take any more numbers. */