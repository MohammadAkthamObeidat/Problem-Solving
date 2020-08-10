import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;


public class Test {
    //static int x = 50;

/*
    int x = y;
    static int y = 10;
    static {y = 15;}
*/
    //void Test(){}


    public static void main(String[] args) {

        /*char c [] = new char[]{'a', 'b', 'c'};
        String cd = "abcdef".substring(4);
        String s = new String(c);
        System.out.println(s +=cd);*/

        /*String s = new String("Moh");
        s.toLowerCase();
        System.out.println(s);*/

        /*LocalDate d = LocalDate.ofYearDay(2015, 363);
        d.plusWeeks(2);
        System.out.print(d + ":" + d.isLeapYear());*/

        /*Long l = 3;
        Double d =10;
        Float f = 1.3;
        Float k = 3;
        Non of above is valid.*/

    /*int x = 0, y = 100;
    System.out.println(x);*/

    /*long [][] l2d ;
    long [] l1d = {1,2,3};
    Object o = l1d; // It's possible to store an array inside reference of type Object.
    l2d = new long[3][3];
    l2d[0][0] = (long[])o;*/

        //todo:########################################################################################################################

    /*int[] a1 = {2, -1, 4, 5, 3};
    int[] a2 = {2, -1, 4, 5, 3};

    int[][] a3 = {{2, -1}, {4, 5, 3}};
    int[][] a4 = {{2, -1}, {4, 5, 3}};

    System.out.print((a1 == a2)+" ");
    System.out.print(Arrays.equals(a1, a2) +" ");
    System.out.print(Arrays.deepEquals(a3, a4) +" "); // deepEquals take 2D Arrays as a parameters; The compilation will fail if passed 1D Arrays to it.*/

        //todo:########################################################################################################################

        /* ONE : try {
            method();
        } catch (FileNotFoundException f) {
            System.out.print("File Not Found");
        } catch (IOException e) {
            System.out.print("IO Exception");
        }*/

        //todo:########################################################################################################################

        /* TWO : try{
            print();
        } catch (Exception e){

        }*/
    }

   /* ONE : public static void method() throws IOException {
        throw new FileNotFoundException();
    }*/

    /* TWO : static void print() throws NullPointerException{
        try{
            throw new NullPointerException();
        } catch(ClassCastException e){
            System.out.print("Class Cast ");
        } finally{
            System.out.print("Final");
        }
        System.out.print("OCAJP");
    }*/

}
