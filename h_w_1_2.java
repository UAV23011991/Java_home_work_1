/*
 * Написать метод, которому в качестве параметра передается целое число, 
 * метод должен напечатать в консоль, положительное ли число передали или 
 * отрицательное. Замечание: ноль считаем положительным числом. 
 */

public class h_w_1_2 {
    public static void main(String[] args) {
        arg(23);
    }
    public static void arg(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }
}