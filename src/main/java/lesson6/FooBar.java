package lesson6;

public class FooBar {
    public static void main(String[] args) {
//        System.out.println(1124);//це int
//        System.out.println(3423F);// це флоат
//        System.out.println(213D);// це double
//        System.out.println(2.1);// це double

//        int a = (int) 2.9999999999999;
//        System.out.println(a);

//        System.out.println(5 / 2);

//        System.out.println(5 % 2); // 4 + 1 -> поверне 1
//
//        System.out.println(234 % 5 == 0);//чи дорівнює 4 числу 0

//        if (240 % 5 == 0) {
//            System.out.println("true");
//        }else {
//            System.out.println("if не спрацював");
//        }

        int money = 20;

        if (money < 0) {
            System.out.println("Є борг");
        } else if (money == 20) {
            System.out.println("Давай купимо пива");
        } else if (money == 0) {
            System.out.println("нема грошей");
        } else if (money > 0) {
            System.out.println("Є гроші");
        }

        for (int i = 0; i < 45; i = i + 1) {

            if(i == 20){
                System.out.println(i);
            } else if (i > 40) {
                System.out.println("лол я більше 40 =" + i);
            }
        }

    }
}
