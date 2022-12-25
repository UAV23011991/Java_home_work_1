/*
 * Написать метод, принимающий на вход два аргумента: len и initialValue, и 
 * возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна 
 * initialValue.
 */

public class h_w_1_10 {
    public static void main(String[] args) {
        arg(4,8);
    }
    public static void arg(int len, int initialValue){
        int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.println("[" + arr[i] + "]" + " ");
        }
    }
}
