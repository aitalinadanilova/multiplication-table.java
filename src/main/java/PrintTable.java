public class PrintTable {
    private final int size;
    private final int cellWidth;

    public PrintTable(int size) {
        this.size = size;
        this.cellWidth = String.valueOf(size * size).length() + 1;
    }

    public void print() {
        printSeparator();
        printHeader();
        printSeparator();
        printRows();
    }

    private void printHeader() {
        System.out.printf("|%" + cellWidth + "s", "");
        for (int i = 1; i <= size; i++) {
            System.out.printf("|%" + cellWidth + "d", i);
        }
        System.out.println("|");
    }

    private void printSeparator() {
        for (int i = 0; i <= size; i++) {
            System.out.print("+");
            for (int j = 0; j < cellWidth; j++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    private void printRows() {
        for (int i = 1; i <= size; i++) {
            System.out.printf("|%" + cellWidth + "d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("|%" + cellWidth + "d", i * j);
            }
            System.out.println("|");
            printSeparator();
        }
    }
}

