import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int val = 100; // 100
        change(val); // try to change val
        System.out.println(val); // it prints "100", because the method changed a copy of the val
    }

    /**
     * The method changes a given value
     */
    public static void change(int val) {
        val = 400; // now, the copy is 400
    }
}