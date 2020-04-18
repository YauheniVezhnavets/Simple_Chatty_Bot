import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = 1;

        while (Math.pow(square, 2) <= number) {
            System.out.println((int)Math.pow(square, 2));
            square++;
        }
    }
}