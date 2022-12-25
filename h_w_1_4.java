/*
 * Написать метод, которому в качестве аргументов передается строка и число, 
 * метод должен отпечатать в консоль указанную строку, указанное количество раз. 
 */

public class h_w_1_4 {
    public static void main(String[] args) {
       args("work",7);}
    public static void args(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}
