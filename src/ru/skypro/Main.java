package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// задание 1
        int dog = 7;
        byte cat = 1;
        short mouse =3;
        long elephant = 110L;
        double sugarWeight =4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;
        System.out.println(dogIsAdult);

    // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

    // Задание 3
        var bananasWeiht = 80 * 5;
        var milkWeight = 105 * 2;
        var icemilk = 100 * 2;
        var eggs = 4 * 70;
        var productWeight = bananasWeiht + milkWeight + icemilk + eggs ;
        int grPerKg = 1000;
        float weightKg = productWeight/(float)grPerKg;


                System.out.println ("Общий вес " + weightKg + " кг ");


    }
}
