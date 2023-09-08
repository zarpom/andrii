package lesson5;

public class SearchMin {
    public static void main(String[] args) {
//        int number = 3;
//        int[] numbers = {1, 23, -5};
////        System.out.println(numbers[0]);
////        System.out.println(numbers[1]);
////        System.out.println(numbers[2]);
//        for (int i = 0; i < 3; i++) { //0 1 2
//            System.out.println("Коли в нас i=" + i +
//                    " тоді  підставляється в numbers[i] число "
//                    + i + " тобто виходить "
//                    + "numbers[" + i + "] має значення в массиві = "
//                    + numbers[i]);
//        }

//        System.out.println("Перевіряємо залишко від ділення 16 на 5: " + (16 % 5 == 0));
//
//        int[] numbers2 = {11, -2, 7, 55, 49};
//        System.out.println("Довжина массиву " + numbers2.length);
//
//        for (int i = 0; i < numbers2.length; i++) {
//            if (numbers2[i] % 7 == 0) {
//                System.out.println(numbers2[i]);
//            }
//        }
        /// коли ми ділемо i % 2 == 0 ми перевіряємо просто число i котре змінюється кожен крок
        // коли ми ділемо ЗНАЧЕННЯ МАССИВУ, тобто numbers2[i] % 2 == 0 ми перевіряємо що саме елемент парний, а не його порядок в массиві


        int[] queueToBar = {22, 33, 9, 21, 55, 14, 15};

        for (int i = 0; i < queueToBar.length; i++) {
            if ( queueToBar[i]  < 18) {
                System.out.println("Йоб вашу мать саня по коням в нас піздец у бара!!!! тут піздюк з віком " + queueToBar[i]);
            }
        }

    }
}
