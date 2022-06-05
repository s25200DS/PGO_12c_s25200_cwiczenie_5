//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Ingredients.Alcohol;
import Ingredients.Crystal;
import Ingredients.Flower;
import Ingredients.Water;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Eliksir beverage = new Eliksir("Whisky with coca cola");
        Alcohol alcohol = new Alcohol("Whisky", 10000, 50, 45);
        Water coke = new Water("Coca cola", 1000, 50, false);
        Flower lemon = new Flower("Lemon", 5000, 1);
        Crystal ice = new Crystal("Ice", 100000, 10, 1);
        beverage.setCatalyst(alcohol);
        beverage.addIngredient(coke);
        beverage.addIngredient(lemon);
        beverage.addIngredient(ice);
        beverage.addIngredient(ice);
        beverage.removeIngredient(ice);
        beverage.Create();
        System.out.println("Power: " + beverage.getPower());
    }
}
