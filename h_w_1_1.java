/*
 * Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – 
 * вернуть true, в противном случае – false.
 */

public class h_w_1_1 {
    public static void main(String[] args) {
        System.out.println(args(3, 15));
    }
    public static boolean args(int a, int b) {
        int sum = a + b;
            if (sum >= 10 && sum <=20) {
                return true;
        }
                return false;
    }
}
    
