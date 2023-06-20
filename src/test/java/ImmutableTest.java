import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableTest {

    @Test
    public void test_1(){
        System.out.println("\n--Test of empty immutable matrix--");
        Matrix matrixForTest = new Matrix();
        Immutable immutMatrixForTest = new Immutable(matrixForTest);
        immutMatrixForTest.messageImmut();
    }

    @Test
    public void test_2(){
        System.out.println("\n--Test of self-made immutable matrix 4x4--");
        Matrix matrixForTest = new Matrix(4,4);
        Immutable immutMatrixForTest = new Immutable(matrixForTest);
        immutMatrixForTest.messageImmut();
    }

    @Test
    public void test_3(){
        System.out.println("\n--Test of copy immutable matrix--");
        Matrix matrixForTest = new Matrix(4,4);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("-------");
        Immutable immutCopyOfTestMatrix = new Immutable(immutTestMatrix);
        immutCopyOfTestMatrix.messageImmut();
        System.out.println("First matrix: " +  immutTestMatrix.getClass());
        System.out.println("Second matrix: " + immutCopyOfTestMatrix.getClass());
    }

    @Test
    public void test_4(){
        System.out.println("\n--Test of fill value in immutable matrix--");
        Immutable testImmutMatrix = new Immutable(4,4);
    }

    @Test
    public void test_5(){
        System.out.println("\n--Test of take element of immutable matrix--");
        Matrix matrixForTest = new Matrix(4,4);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("First element: "+ immutTestMatrix.takeElemImmut(0,0));
        assertEquals(0, immutTestMatrix.takeElemImmut(3,5));
    }

    @Test
    public void test_6(){
        System.out.println("\n--Test of take row--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("First row: "+  immutTestMatrix.takeRowImmut(0));
        System.out.println("Second row: "+  immutTestMatrix.takeRowImmut(1));
        System.out.println("Third row: "+  immutTestMatrix.takeRowImmut(2));
        assertEquals("",  immutTestMatrix.takeRowImmut(4));
    }

    @Test
    public void test_7(){
        System.out.println("\n--Test of take colum--");
        Matrix matrixForTest = new Matrix(3,3);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("First row: "+  immutTestMatrix.takeColumImmut(0));
        System.out.println("Second row: "+  immutTestMatrix.takeColumImmut(1));
        System.out.println("Third row: "+  immutTestMatrix.takeColumImmut(2));
        assertEquals("",  immutTestMatrix.takeColumImmut(4));
    }

    @Test
    public void test_8(){
        System.out.println("--Test of dimension--");
        Matrix matrixForTest = new Matrix(4,4);
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        System.out.println("DimensionImmut: " + immutTestMatrix.dimensionLstImmut()[0] + "x" + immutTestMatrix.dimensionLstImmut()[1]);
    }

    @Test
    public void test_9(){
        System.out.println("\n--Test of equals--");
        Matrix matrixForTest = new Matrix(2,2);
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        Immutable copyImmutTestMatrix = new Immutable(immutTestMatrix);
        System.out.println(matrixForTest.equals(immutTestMatrix));
        System.out.println(matrixForTest.equals(copyImmutTestMatrix));
        System.out.println(copyImmutTestMatrix.equals(immutTestMatrix));
    }

    @Test
    public void test_10(){
        System.out.println("\n--Test of hashCode--");
        Matrix matrixForTest = new Matrix(4,4);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("HashCode: " + immutTestMatrix.hashCode());
    }

    @Test
    public void test_11(){
        System.out.println("\n--Test of single immutable matrix--");
        System.out.println(Immutable.singleMatrixImmut(5,5));
        assertEquals("", Immutable.singleMatrixImmut(2,3));
    }

    @Test
    public void test_12(){
        System.out.println("\n--Test of transpose--");
        Matrix matrixForTest = new Matrix(4,4);
        matrixForTest.fillRandomElem();
        Immutable immutTestMatrix = new Immutable(matrixForTest);
        immutTestMatrix.messageImmut();
        System.out.println("Transpose: \n" + immutTestMatrix.transposeMatrix());

    }
}