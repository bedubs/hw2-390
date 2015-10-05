import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Created by william on 10/4/15.
 */
public class TestMatrix {

    public static void main(String[] args) {
        SparseMatrix gravy = new SparseMatrix();

        System.out.println("gravy is empty:\t" + gravy.isEmpty());
        String matrixA = "matrixA.dat";
//        String matrixB = "matrixB.dat";
//
        inputMatrix(matrixA, gravy);
//        inputMatrix(matrixB);

        System.out.println("gravy is empty:\t" + gravy.isEmpty());

    }


    private static void inputMatrix(String matrixFile, SparseMatrix sparseMatrix) {
        try {
            File dataFile = new File(matrixFile);
            Scanner input = new Scanner(dataFile);
            int lineCount = 1;
            while (input.hasNextLine()) {
                if (lineCount != 1 && lineCount != 2) {
                    String s = input.nextLine();
                    System.out.println(s);
                } else if (lineCount == 1) {
                    sparseMatrix.setRowHeadNode(input.nextInt());
//                    System.out.printf("This matrix has %s rows.\n", input.nextInt());
                } else {
                    sparseMatrix.setColumnHeadNode(input.nextInt());
//                    System.out.printf("This matrix has %s columns.\n", input.nextInt());
                }
                lineCount++;
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
