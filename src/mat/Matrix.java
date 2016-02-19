package mat;

/**
 * Created by Yuriy on 15.02.2016.
 */
public class Matrix {
    private int[][] arr;

    //sum of matrixes
    public int[][] add(int[][] arr1, int[][] arr2) { // оголошуємо method який приймає два двумірні масиви.
        int[][] result = new int[2][2]; //виділяємо память під новостворени масив суми.
        for (int i = 0; i < result.length; i++) {//якщо масив одномірний, то один фор, якщо двомірний - 2, тримірний - 3.
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }//показує помилку доки не буде написано return

    public int[][] multiplication(int[][] arr1, int[][] arr2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < result.length; i++) {//якщо масив одномірний, то один фор, якщо двомірний - 2, тримірний - 3.
            for (int j = 0; j < result[i].length; j++) {
                int multiplication = 0;
                for (int r = 0; r < arr1.length; r++) {
                    multiplication += arr1[i][r] * arr2[r][j];
                }
                arr1[i][j] = multiplication;
            }
        }
        return result;
    }
}