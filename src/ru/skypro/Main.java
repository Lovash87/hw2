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
    }
}
