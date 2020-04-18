import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        int [] mas = new int [number];
        for (int i=0; i<mas.length;i++){
            mas[i]=scanner.nextInt();
        }
        Arrays.sort(mas);
        int foundnumber=0;
        for (int i=0; i<mas.length;i++) {
           if(mas[i] % 4 == 0) {
                foundnumber=mas[i];
            }
        }
        System.out.println(foundnumber);
    }
}