import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberOne = scanner.nextLong();
        String symbol = scanner.next();
        long numberTwo = scanner.nextLong();

        switch (symbol) {
            case "+":
                System.out.println(numberOne + numberTwo);
                break;
            case "-":
                System.out.println(numberOne - numberTwo);
                break;
            case "*":
                System.out.println(numberOne * numberTwo);
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(numberOne / numberTwo);
                    break;
                }
            default:
                System.out.println("Unknown operator ");
                break;
        }
    }
}