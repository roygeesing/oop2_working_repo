package oop2.module03.bottleanddrink;

public class BottleExperiments {
    public static void main(String[] args) {

        //Wine Bottle
        Bottle<Wine> wineBottle = new Bottle<>();
        wineBottle.fill(new Rufus()); // Works, because Rufus is a subclass of Wine
        //wineBottle.fill(new Beer()); // Does not work, because Beer is not a subclass of Wine

        Bottle<Rufus> rufusBottle = new Bottle<>();
        rufusBottle.fill(new Rufus()); // works because the types match
        //rufusBottle.fill(new Wine()); // Does not work, because Wine is the superclass of Rufus

    }
}
