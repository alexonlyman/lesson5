public class Main {
    public static void main(String[] args) {
        int capacity = 102;
        int standingSits = 42;
        int sedentarySits = 60;
        if (capacity >= 102) {
            System.out.println(" Мест нет");
        } else {
            System.out.println(" места есть");
        }
        if (sedentarySits >= 60) {
            System.out.println(" сидячих мест нет");
        } else {
            System.out.println(" есть сидячие места ");
        }
        if (standingSits >= 42) {System.out.println(" стоячих мест нет ");}
        else {System.out.println(" стоячие места есть"); }


        // задание 2

            int age5 = 7;
        if (age5 >= 7 ) {System.out.println("ребенок ходит в школу");}
        else {System.out.println(" не ходит"); }

        int age1 = 18;
        if (age1 >= 18 ) {System.out.println("можно поступать в универ");}
        else {System.out.println(" рано для поступления"); }

        int age2 = 24;
        if (age2 >= 24 ) {System.out.println("пора искать работу");}
        else {System.out.println(" с работой можно пододать"); }



        int age =19;
        if (age >=2 && age <6) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в детский сад");
        }


        else if (age >=7 && age <18) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу");
        }
         else if (age >=18 && age <24) {
            System.out.println("Если человеку " + age + " , то ему нужно ходить в университет");
        }
        else if (age >24) {
            System.out.println("Если человеку больше " + age + " лет, то ему нужно ходить на работу");
        }

        if (age <5) {
            System.out.println("Ребенок не может каться на аттракционе");
        }
        else if (age >=5 && age < 14) {
            System.out.println(" Ребенок может кататься в сопровождении взрослых, если взрослых нет, то кататься нельзя");
        }
        else if (age > 15) {
            System.out.println("Кататься можно без сопровождения взрослых");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two)
        if (one>three){
            System.out.println("число "+ one + " самое большое" );
        }
        if (two>one)
            if (two>three) {
                System.out.println("Число "+ two + " самое большое");
            }
        if (three>two)
            if (three>one) {
                System.out.println("число "+ three + " самое большое" );
            }














    }

}