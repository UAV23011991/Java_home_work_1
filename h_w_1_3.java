/*
 * Написать метод, которому в качестве параметра передается целое число. 
 * Метод должен вернуть true, если число отрицательное, и вернуть false если 
 * положительное. 
 */

public class h_w_1_3 {
    public static void main(String[] args) {
        System.out.println(arg(1));
    }
    public static boolean arg(int x) {
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
