import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    public void test_1(){
        System.out.println("\n--Test of empty matrix--");
        Matrix matrixForTest = new Matrix();
        matrixForTest.message();
    }

    @Test
    public void test_2(){
        System.out.println("\n--Test of self-made matrix 3x3--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.message();
    }

    @Test
    public void test_3(){
        System.out.println("\n--Test of copy matrix--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("-----");
        Matrix copyOfTestMatrix = new Matrix(matrixForTest);
        copyOfTestMatrix.message();
    }

    @Test
    public void test_4(){
        System.out.println("\n--Test of fill value in matrix--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
    }

    @Test
    public void test_5(){
        System.out.println("\n--Test of take element in matrix--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("First element: "+ matrixForTest.takeElem(0,0));
        assertEquals(0, matrixForTest.takeElem(3,4));
    }

    @Test
    public void test_6(){
        System.out.println("\n--Test of take row--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("First row: "+ matrixForTest.takeRow(0));
        System.out.println("Second row: "+ matrixForTest.takeRow(1));
        System.out.println("Third row: "+ matrixForTest.takeRow(2));
        assertEquals("", matrixForTest.takeRow(4));
    }

    @Test
    public void test_7(){
        System.out.println("\n--Test of take colum--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("First colum: "+ matrixForTest.takeColum(0));
        System.out.println("Second colum: "+ matrixForTest.takeColum(1));
        System.out.println("Third colum: "+ matrixForTest.takeColum(2));
        assertEquals("", matrixForTest.takeColum(4));
    }

    @Test
    public void test_8(){
        System.out.println("--Test of dimension--");
        Matrix matrixForTest = new Matrix(3,3);
        assertEquals("Dimension: 3x3", matrixForTest.dimension());
    }

    @Test
    public void test_9(){
        System.out.println("\n--Test of equals--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("-----");
        Matrix newMatrixForTest = new Matrix(matrixForTest);
        newMatrixForTest.message();
        System.out.println("Is equal: " + newMatrixForTest.equals(matrixForTest));
    }

    @Test
    public void test_10(){
        System.out.println("\n--Test of hashCode--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("HashCode: " + matrixForTest.hashCode());
        System.out.println("-----");
        Matrix newMatrixForTest = new Matrix(3,3);
        newMatrixForTest.fillRandomElem();
        newMatrixForTest.message();
        System.out.println("HashCode: " + newMatrixForTest.hashCode());
    }

    @Test
    public void test_11(){
        System.out.println("\n--Test of single matrix--");
        System.out.println(Matrix.singleMatrix(3,3));
        assertEquals("", Matrix.singleMatrix(2,3));
    }

    @Test
    public void test_12(){
        System.out.println("\n--Test of transpose--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        matrixForTest.message();
        System.out.println("Transpose: \n" + matrixForTest.transposeMatrix());

    }

}