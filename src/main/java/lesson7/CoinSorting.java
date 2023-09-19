package lesson7;

import java.util.Arrays;

public class CoinSorting {
    public static void main(String[] args) {
        int[] coins = {45, 25, 41, 56, -1, 10};
        int count = 0;

        for (int i = 0; i < coins.length - 1; i++) { //2 i

            for (int j = 0; j < coins.length - 1 - i; j++) { // 2 на місці вкінці{
                count++;
                if (coins[j] > coins[j + 1]) {
                    int temp = coins[j];
                    coins[j] = coins[j + 1];
                    coins[j + 1] = temp;
                }
            }
        }

        System.out.println("Кількість раз пройшли по циклу:" + count);
        System.out.println(Arrays.toString(coins));

//        int count = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Сходи в 3 магазини!! Кажу тобі це вже в " + i + " раз!");
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("Добре-добре, я пішов в " + i + " магазин!!");
//                count++;
//            }
//        }
//        System.out.println("ЯК ЖЕ Я ЗАЄБАВСЯ ХОДИТИ " + count + " раз в магазини!!");
//
    }
}
