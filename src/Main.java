public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1 () {
        System.out.println("Задача 1");
            var dog = 8.0;
                System.out.println(dog);
            var cat = 3.6;
                System.out.println(cat);
            var paper = 763789;
                System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 2");
            var dog = 8.0 + 4;
                System.out.println(dog);
            var cat = 3.6 + 4;
                System.out.println(cat);
            var paper = 763789 + 4;
                System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
            var dog = 8.0 + 4 - 3.5;
                System.out.println(dog);
            var cat = 3.6 + 4 - 1.6;
                System.out.println(cat);
            var paper = 763789+4 - 7639;
                System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
            var friend = 19;
                System.out.println(friend);
                friend = 19 + 2;
                System.out.println(friend);
                friend = 21 / 7;
                System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
            var frog = 3.5;
                System.out.println(frog);
            frog = frog * 10;
                System.out.println(frog);
            frog = frog / 3.5;
                System.out.println(frog);
             frog = frog + 4;
                System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
            var boxerWeight1 = 78.2;
            var boxerWeight2 = 82.7;
                System.out.println(boxerWeight1 + boxerWeight2);
            boxerWeight1 = 78.2;
            boxerWeight2 = 82.7;
                System.out.println(boxerWeight2 - boxerWeight1);
    }

    public static void task7 () {
        System.out.println("Задача 7");
            var boxerWeight1 = 78.2;
            var boxerWeight2 = 82.7;
                System.out.println(boxerWeight2 - boxerWeight1);
            boxerWeight1 = 78.2;
            boxerWeight2 = 82.7;
                System.out.println(boxerWeight2 % boxerWeight1);
    }

    public static void task8 () {
        System.out.println("Задача 8");
            var workingHours = 640;
            var manHours = 8;
            var man = workingHours / manHours;
                System.out.println("Всего работников в компании " + man + " человек.");

}
}
