package dietelProject.chapterFive;

public class NestedLoop4 {
    public static void main(String[] args) {
        int k = 6;
        int column = 6;
        for (int num = 1; num <= column; ) {
            for (int space = 1; space <= (column - num);) {
                System.out.print("  ");
                space++;
            }
            for (int digit = 1; digit <= num; digit++){
                System.out.printf("%d ", 7 - k);
                k++;
            }
            System.out.println();
            k = column - num;
            num++;
        }
    }
}
