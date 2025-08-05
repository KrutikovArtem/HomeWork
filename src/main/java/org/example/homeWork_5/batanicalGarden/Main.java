package org.example.homeWork_5.batanicalGarden;

public class Main {

    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Cactus cactus = new Cactus();
        Orchid orchid = new Orchid();

        botanicalGarden.setPlant(orchid);

        botanicalGarden.showInfo(orchid);
        botanicalGarden.showInfo(cactus);
    }





}
