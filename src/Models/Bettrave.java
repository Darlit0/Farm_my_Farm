package Models;

import javafx.scene.image.ImageView;

public class Bettrave extends Seed {
    private int price_bettrave = 100;
    private String name_bettrave = "Bettrave";
    private int total_bettrave;
    private int time_to_grow_bettrave = 120;
    private int give_money_bettrave = 200;

    public Bettrave(int total_bettrave) {
        this.total_bettrave = total_bettrave;
        this.price_bettrave = price_bettrave;
        this.name_bettrave = name_bettrave;
        this.time_to_grow_bettrave = time_to_grow_bettrave;
        this.give_money_bettrave = give_money_bettrave;
    }

    public int getPrice_bettrave() {
        return price_bettrave;
    }

    public String getName_bettrave() {
        return name_bettrave;
    }

    public int getTotal_bettrave() {
        return total_bettrave;
    }

    public int getTime_to_grow() {
        return time_to_grow_bettrave;
    }

    public int getGive_money_bettrave() {
        return give_money_bettrave;
    }

    public void plantBettrave(ImageView imageView) {
        changeImage(imageView, "/img/plant_bettrave.png");
    }
}
