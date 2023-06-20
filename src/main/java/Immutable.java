import java.util.Objects;
import java.util.Random;

public  final class Immutable{
    private static Matrix fmtx;

    //make immutable matrix
    public Immutable (Matrix mtx){
        this.fmtx = new Matrix(mtx);
    }

    public Immutable (int row, int colum) {
        try {
            throw new UnsupportedOperationException("Immutable matrix unsupport changes! ");
        }
        catch (java.lang.UnsupportedOperationException e) {
            System.out.println("Invalid operation for immutable matrix! ");
        }
    }

    //make immutable copy of immutable matrix
    public Immutable(Immutable mtx){
        int[][] copyMatrix = new int[mtx.dimensionLstImmut()[0]][mtx.dimensionLstImmut()[1]];
        for (int i = 0; i < mtx.dimensionLstImmut()[0]; i++){
            for (int j = 0; j < mtx.dimensionLstImmut()[1]; j++)
                copyMatrix[i][j] = mtx.takeElemImmut(i,j);
        }
    }

    //take element from immutable matrix
    public int takeElemImmut(int row, int colum){
        return (this.fmtx.takeElem(row, colum));
    }

    //take row from immutable matrix
    public String takeRowImmut(int row) {
        StringBuilder Row = new StringBuilder();
        if (row <= fmtx.m) {
            for (int j = 0; j < fmtx.n; j++) {
                Row.append(takeElemImmut(row, j)).append(" ");
            }
        }
        else
            System.out.println("INPUT INCORRECT!: row value out of range");
        return Row.toString();
    }

    //take colum from immutable matrix
    public String takeColumImmut(int colum) {
        StringBuilder Colum = new StringBuilder();
        if (colum <= fmtx.n) {
            for (int i = 0; i < fmtx.m; i++) {
                Colum.append(takeElemImmut(i, colum)).append(" ");
            }
        } else
            System.out.println("INPUT INCORRECT!: colum value out of range\n");
        return Colum.toString();
    }

    //dimension of immutable matrix
    public int[] dimensionLstImmut(){
        return new int []{this.fmtx.dimensionLst()[0], this.fmtx.dimensionLst()[1]};
    }

    //equals method of immutable matrix
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof Immutable) {
            Immutable otherMatrix = (Immutable) obj;
            for (int i = 0; i < fmtx.m; i++) {
                for (int j = 0; j < fmtx.n; j++)
                    isEqual = (fmtx.arr[i] == otherMatrix.fmtx.arr[i] && fmtx.arr[j] == otherMatrix.fmtx.arr[j]);
            }
        }
        return isEqual;
    }

    //hashCode method of immutable matrix
    public int hashCode() {
        int hash = Objects.hash(Integer.valueOf(fmtx.m), Integer.valueOf(fmtx.n), Integer.valueOf(takeElemImmut(0, 0)), 31);
        return hash;
    }

    //make immutable single matrix
    public static String singleMatrixImmut(int row, int colum) {
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

    //transpose immutable matrix
    public String transposeMatrix(){
        StringBuilder transpose = new StringBuilder();
        int row = fmtx.arr.length;
        int colum = fmtx.arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                transpose.append(fmtx.arr[j][i]).append(" ");
            }
            transpose.append("\n");
        }
        return transpose.toString();
    }

    //display method for immutable matrix
    public int messageImmut() {
        for (int i = 0; i < Matrix.m; i++) {
            for (int j = 0; j < Matrix.n; j++) {
                System.out.print(Matrix.arr[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

}
