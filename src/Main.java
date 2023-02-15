public class Main {
    public static void main(String[] args) {
        /** СПАРТАНЦЫ ДЕГЕН КЛАСС ТУЗУНУЗ,
         АНЫН ЛУЧНИКИ,РЫЦАРИ, ВСАДНИКИ, ФИЛОСОФЫ ДЕГЕН САБКЛАССТАРЫ БОЛСУН,
         АР КИМДИН АР КАНДАЙ 2 ДЕН ПОЛЯЛАРЫ БОЛСУН, ЖАНА 2 ДЕН
         МЕТОДДОРУ БОЛСУН,
         СПАРТАНЦЫ КЛАССЫНДА БААРЫ ТИЕШЕЛУУ NAME, COUNT  ДЕГЕН
         ПОЛЯЛАРЫ АНАН 1 МЕТОД БОЛСУН, ПОЛИМОРФИЗМ КОЛДОНУП БААРЫН
         КОНСОЛЬГО ЧЫГАРГЫЛА.
         COUNT МЕНЕН СОРТИРОВКА КЫЛГАН МЕТОД ТУЗУНУЗ*/


        Spartans philosopher = new Philosophers("Socrat", "philosophers", "Green", 86.9);
        Spartans theRider = new TheRider("Demis", "the rider", "Black", "213.4");
        Spartans knights = new Knights("Agamemnon", "knights", "Chain mail", "sword");
        Spartans archers = new Archers("Afagon", "archers", 26, 153.4);
        Spartans[] spartans = {philosopher, theRider, knights, archers};
        for (Spartans spartans2 : spartans) {
            System.out.println(spartans2.toString());

        }
        System.out.println();
        for (int i = 0; i <spartans.length ; i++) {
            count(spartans[i].getStatus());
        }



    }

    public static void count(String status) {
        int countPhilosophers = 0;
        int countRider = 0;
        int countKnights = 0;
        int countArchers = 0;
        if (status.equals("philosophers")) {
            countPhilosophers++;
            System.out.println("Philosophers " + countPhilosophers);
        }
        if (status.equals("the rider")) {
            countRider++;
            System.out.println("The rider " + countRider);
        }
        if (status.equals("knights")) {
            countKnights++;
            System.out.println("Knights " + countKnights);
        }
        if (status.equals("archers")) {
            countArchers++;
            System.out.println("Archers " + countArchers);
        }
    }
    }