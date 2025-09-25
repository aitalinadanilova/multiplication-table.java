import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер таблицы: ");
        int size = scanner.nextInt();
        if (size < 1 || size > 32) {
            System.out.println("Размер таблицы должен быть от 1 до 32");
            return;
        } else {
            PrintTable print = new PrintTable(size);
            print.print();
        }
        scanner.close();

    }
}
