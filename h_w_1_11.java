/*
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы.
 */

public class h_w_1_11 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -11, 4, 58, 2, 4, 8, 9, 1};
            arg(arr);
    }
    public static void arg(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}