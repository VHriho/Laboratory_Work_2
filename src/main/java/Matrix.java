import java.util.Objects;
import java.util.Random;

public class Matrix {
    static int m;
    static int n;
    static int[][] arr;

    //make empty matrix
    public Matrix() {
        m = 0;
        n = 0;
        arr = new int[m][n];
    }

    //self-made matrix
    public Matrix(int row, int colum) {
        m = row;
        n = colum;
        arr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++)
                arr[i][j] = 0;
        }
    }

    public Matrix(Matrix mtx){
        int[][] copyMatrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++)
                copyMatrix[i][j] = mtx.takeElem(i,j);
        }
    }

    //method for random fill matrix
    public void fillRandomElem() {
        Random fillRandom = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = fillRandom.nextInt(10);
        }
    }

    //method for take element from matrix
    public int takeElem(int row, int colum) {
        if (row <= m && colum <= n)
            return arr[row][colum];
        else{
            System.out.println("INPUT INCORRECT!: row or colum out of range");
            return 0;
        }
    }

    //take row of matrix
    public String takeRow(int row) {
        StringBuilder Row = new StringBuilder();
        if (row <= m) {
            for (int j = 0; j < n; j++) {
                Row.append(takeElem(row, j)).append(" ");
            }
        }
        else
           System.out.println("INPUT INCORRECT!: row value out of range");
        return Row.toString();
    }

    //take colum of matrix
    public String takeColum(int colum) {
        StringBuilder Colum = new StringBuilder();
        if (colum <= n) {
            for (int i = 0; i < m; i++) {
                Colum.append(takeElem(i, colum)).append(" ");
            }
        } else
            System.out.println("INPUT INCORRECT!: colum value out of range\n");
        return Colum.toString();
    }

    //dimension of matrix
    public String dimension() {
        return ("Dimension: " + m + "x" + n);
    }

    //dimension of matrix
    public int[] dimensionLst() {
        return new int[]{m, n};
    }

    //method equals
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if (obj instanceof Matrix) {
            Matrix otherMatrix = (Matrix) obj;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    isEquals = (arr[i] == otherMatrix.arr[i] && arr[j] == otherMatrix.arr[j]);
            }
        }
        return isEquals;
    }

    //hashcode
    public int hashCode() {
        int hash = Objects.hash(Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(takeElem(0, 0)), 31);
        return hash;
    }

    //single matrix
    public static String singleMatrix(int row, int colum) {
        StringBuilder matrix = new StringBuilder();
        int [][] single = new int [row][colum];
        if (row == colum) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    if (i < j || i > j)
                        single[i][j] = 0;
                    else
                        single[i][j] = 1;
                    matrix.append(single[i][j]).append(" ");
                }
                matrix.append("\n");
            }
        }
        else
            System.out.println("INVALID MATRIX!: not square matrix");
        return matrix.toString();
    }

    //transpose matrix
    public String transposeMatrix(){
        StringBuilder transpose = new StringBuilder();
        int row = arr.length;
        int colum = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                transpose.append(arr[j][i]).append(" ");
            }
            transpose.append("\n");
        }
        return transpose.toString();
    }

    //method for printing matrix
    public int message() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

}
