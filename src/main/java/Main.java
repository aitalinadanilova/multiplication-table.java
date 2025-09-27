import java.util.Scanner;

public class Main {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер таблицы: ");
        int size = scanner.nextInt();

        if (size < MIN_SIZE || size > MAX_SIZE) {
            System.out.println("Размер таблицы должен быть от " + MIN_SIZE + " до " + MAX_SIZE);
        } else {
            PrintTable table = new PrintTable(size);
            table.print();
        }
        scanner.close();
    }

}
