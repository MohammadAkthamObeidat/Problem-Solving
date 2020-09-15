import java.util.*;

class Arrays {

    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 5, 6 };
        // Moahmmad Aktham Obeidat
        int miss = getMissingNo(a, 5);
        System.out.println(miss);

        int miss2 = getMissingNo_2(a, 5);
        System.out.println(miss2);

        String find = findEvenOrOdd(a);
        System.out.println(find);
    }

    // Function to find missing number using SUM
    static int getMissingNo(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    // Function to find missing number using XOR
    static int getMissingNo_2(int a[], int n) {
        int x1 = a[0];
        int x2 = 1;

        /*
         * For xor of all the elements in array
         */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /*
         * For xor of all the elements from 1 to n+1
         */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }

    static String findEvenOrOdd(int a[]) {

        int firstItem = 0, lastItem = 0, sum;
        for (int i = 0; i < a.length; i++) {
            firstItem = a[0];
            if(i==(a.length-1)){
                lastItem = a[i];
            }
        }
        sum = firstItem + lastItem;
        if (sum % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }

    }
}