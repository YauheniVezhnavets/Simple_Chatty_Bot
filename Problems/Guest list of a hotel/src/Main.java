import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String line4 = scanner.nextLine();
        String [] room1= line1.split(" ");
        String [] room2= line2.split(" ");
        String [] room3= line3.split(" ");
        String [] room4= line4.split(" ");


        print(room4);
        print(room3);
        print(room2);
        print(room1);

    }

    public static void print (String ... mas ){
        for (int i=mas.length-1; i>=0; i--){
            System.out.println(mas[i]);
        }
    }
}