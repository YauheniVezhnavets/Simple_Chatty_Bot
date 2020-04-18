import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] mas = new int[4];
        for (int i = mas.length-1; i >= 0; i--) {
            mas[i] = number % 10;
            number = number / 10;
        }

        if (mas[0] == mas[mas.length - 1] && mas[1] == mas[2]) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
    }
}