import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long c = 1;
        for (long i=a; i<b; i++){
            c *= i;
        }
        System.out.println(c);
    }
}