package hackerrank;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] values = new long[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextLong();
            for (int j = 0; j < n; j++) {
                try {
                    long x = values[j];
                    System.out.println(x + " can be fitted in-");
                    if (x >= -128 && x <= 127) System.out.println("*byte");
                    if (x >= -32768 && x <= 32767) System.out.println("*short");
                    if (x >= -2147483648 && x <= 2147483647) System.out.println("*int");
                    if (x >= -9_223_372_036_854_775_808L && x <= 9223372036854775807L) System.out.println("*long");

                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
        }


        sc.close();
    }
}
