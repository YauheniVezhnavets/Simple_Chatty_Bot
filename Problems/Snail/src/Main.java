import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = 0;
        int days = 0;
        boolean b = true;

        while (b) {
            K += A;
            if (K >= H) {
                b = false;
            } else {
                K -= B;
            }
            days++;
        }
        System.out.println(days);
    }
}