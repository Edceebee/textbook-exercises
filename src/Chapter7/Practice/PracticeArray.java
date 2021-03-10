package Chapter7.Practice;

public class PracticeArray {
    public static void main(String[] args) {

        int [][] multi1 = {{0,2,4,6,8}, {1,2,5,7,9}};
        String [][] multi2 = {{"Esther", "Matthew", "Samuel", "John"},{"Nonibee"},{"Toyota", "Honda","Mitsubishi", "Ford"}};

//        System.out.println("The elements in multi array are :");
//        arrayOutput(multi1);
        System.out.println("The elements in multi2 array are :");
        arrayOutput(multi2);
    }

    private static void arrayOutput(String[][] array) {
        for(int rows = 0; rows < array.length; rows++){

            for(int column= 0; column < array[rows].length; column++)
                System.out.printf("%s ", array[rows][column]);

            System.out.println();

        }

    }

}
