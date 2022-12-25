/*
 * Написать метод, который определяет, является ли год високосным, и возвращает 
 * boolean (високосный - true, не високосный - false). Каждый 4-й год является 
 * високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. 
 */

public class h_w_1_5 {
    public static void main(String[] args) {
        System.out.println(arg(100));
    }
    public static boolean arg(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
