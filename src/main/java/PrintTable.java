public class PrintTable {
    private final int size;
    private final int cellWidth;
    private final int firstColWidth;

    public PrintTable(int size) {
        this.size = size;
        this.cellWidth = digitLength(size * size) + 1;
        this.firstColWidth = digitLength(size) + 1;
    }

    public void print() {
        printHeader();
        printSeparator();
        for (int i = 1; i <= size; i++) {
            printRow(i);
            printSeparator();
        }
    }

    private void printHeader() {
        System.out.printf("%" + firstColWidth + "s", " ");
        for (int j = 1; j <= size; j++) {
            System.out.printf("|%" + cellWidth + "d", j);
        }
        System.out.println(); // конец строки
    }

    private void printSeparator() {
        System.out.print("+");
        for (int i = 0; i < firstColWidth; i++) System.out.print("-");
        System.out.print("+");
        for (int j = 1; j <= size; j++) {
            for (int k = 0; k < cellWidth; k++) System.out.print("-");
            System.out.print("+");
        }
        System.out.println();
    }

    private void printRow(int i) {
        System.out.printf("%" + firstColWidth + "d", i);
        for (int j = 1; j <= size; j++) {
            System.out.printf("|%" + cellWidth + "d", i * j);
        }
        System.out.println();
    }

    private int digitLength(int number) {
        int length = 0;
        do {
            number /= 10;
            length++;
        } while (number > 0);
        return length;
    }
}