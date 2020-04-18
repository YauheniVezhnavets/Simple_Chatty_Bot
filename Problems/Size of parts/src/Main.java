import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int large = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                perfect++;
            } else if (mas[i] > 0) {
                large++;
            } else {
                smaller++;
            }
        }
        System.out.println(perfect + " " + large + " " + smaller);
    }
}