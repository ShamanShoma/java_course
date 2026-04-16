package two_dimensional_arrays;

public class ArraysFacts {
    void main() {
        int[][] ints1 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                System.out.println(ints1[i][j]);
            }
        }
    }
}
