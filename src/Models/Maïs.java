package Models;

import javafx.scene.image.ImageView;

public class Maïs extends Seed {
    private int price_maïs = 40;
    private String name_maïs = "Maïs";
    private int total_maïs;
    private int time_to_grow_maïs = 50;
    private int give_money_maïs = 60;

    public Maïs(int total_maïs) {
        this.total_maïs = total_maïs;
        this.price_maïs = price_maïs;
        this.name_maïs = name_maïs;
        this.time_to_grow_maïs = time_to_grow_maïs;
        this.give_money_maïs = give_money_maïs;
    }

    public int getPrice_maïs() {
        return price_maïs;
    }

    public String getName_maïs() {
        return name_maïs;
    }

    public int getTotal_maïs() {
        return total_maïs;
    }

    public int getTime_to_grow_maïs() {
        return time_to_grow_maïs;
    }

    public int getGive_money_maïs() {
        return give_money_maïs;
    }

    public void plantMaïs(ImageView imageView) {
        changeImage(imageView, "/img/plant_maïs.png");
    }
}
