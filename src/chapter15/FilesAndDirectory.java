package chapter15;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesAndDirectory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name");
        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.println(path.getFileName());
            System.out.println( Files.isDirectory(path));
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
        }
        else{
            System.err.println("file does not exist");
        }
    }



}
