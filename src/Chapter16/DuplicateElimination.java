package Chapter16;

/*(Duplicate Elimination) Write a program that reads in a series of first names and eliminates
        duplicates by storing them in a Set. Allow the user to search for a first name. */

import java.util.*;

public class DuplicateElimination {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter First Name: ");
            names[i] = input.nextLine();
        }

        List<String> fName = Arrays.asList(names);

//        System.out.printf("%s ", fName);
        System.out.println();


        removeDuplicates(fName);

    }


    private static void removeDuplicates(Collection<String> values) {


        Set<String> set = new HashSet<String>(values);


        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();

    }



    }


