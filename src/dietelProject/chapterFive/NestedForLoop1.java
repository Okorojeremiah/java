package dietelProject.chapterFive;

//Using nested loop to display a pattern.

public class NestedForLoop1 {

    public static void main(String[] args) {

        int row;
        int column;
        int n = 1;

        for (row = 6; row>= n; row--) {
            for (column = 1; column<=row;column++) {
                System.out.print("  "+column);
            }
            System.out.println();
        }
    }
}
