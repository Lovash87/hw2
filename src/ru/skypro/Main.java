package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// задание 3

        var bananasWeight = 5* 80;
        var icecreamWeight = 105 * 2;
        var icemilkWeiht = 100 * 2;
        var eggsWeigt = 4 * 70;
        var productWeight = bananasWeight + icecreamWeight + icemilkWeiht + eggsWeigt;
        float grPerKg = 1000;
        float weihtKg = productWeight / (float)grPerKg;

        System.out.println("Общий вес " + weihtKg + "гр ");

    // задание 4

        var lightDiet = 0.250;
        var hardDiet = 0.500;
        var weightNeedPutsAway = 7;
        var boxerSecond = weightNeedPutsAway;
        var needWeight = boxerSecond - weightNeedPutsAway;
        var daysForLD = (boxerSecond /  lightDiet);
        var daysForHD = (boxerSecond / hardDiet);
        var middlePutsAwayWeights = (daysForLD + daysForHD) / 2;

        System.out.println("Нужный вес " + needWeight+" кг, " + daysForLD + " дней понадобится при потере веса 250 грамм в день или " + daysForHD +
                " дней при диете с потерей веса по 500 грамм на день, среднее количество дней " + middlePutsAwayWeights);

        //Задание №5:

        var SalaryForMasha = 67760 / 10 + 67760;
        var SalaryForDenis = 83690 / 10 + 83690;
        var SalaryForKristina = 76320 / 10 + 76320;
        var yearSalaryMasha = (SalaryForMasha - 67760) * 12;
        var yearSalaryForDenis = (SalaryForDenis - 83690) * 12;
        var yearSalaryForKristina = (SalaryForKristina - 76320) * 12;

        System.out.println("Маша теперь получает " + SalaryForMasha + " рублей. Годовой доход Маши вырос на "
                + yearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + SalaryForDenis + " рублей, его годовой доход вырос на "
                + yearSalaryForDenis + " рублей.");
        System.out.println("Кристина теперь получает " + SalaryForKristina + " рублей, её годовой доход вырос на "
                + yearSalaryForKristina + " рублей.");

    }
}
