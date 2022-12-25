/*
 * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его 
 * значениями 1 2 3 4 5 6 7 8 … 100. 
 */

public class h_w_1_7 {
    public static void main(String[] args) {
        arg(100);   
    }
    public static void arg(int size) {
        int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;

                System.out.print(arr[i] + " ");
        }
    }
}
