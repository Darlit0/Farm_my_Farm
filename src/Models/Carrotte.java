package Models;

import javafx.scene.image.ImageView;

public class Carrotte extends Seed {
    private int price_carrotte = 70;
    private String name_carrotte = "Carrotte";
    private int total_carrotte;
    private int time_to_grow_carrotte = 80;
    private int give_money_carrotte = 100;

    public Carrotte(int total_carrotte) {
        this.total_carrotte = total_carrotte;
    }

    public int getPrice_carrotte() {
        return price_carrotte;
    }

    public String getName_carrotte() {
        return name_carrotte;
    }

    public int getTotal_carrotte() {
        return total_carrotte;
    }

    public int getTime_to_grow_carrotte() {
        return time_to_grow_carrotte;
    }

    public int getGive_money_carrotte() {
        return give_money_carrotte;
    }

    public void plantCarrot(ImageView imageView) {
        changeImage(imageView, "/img/plant_carrotte.png");
    }
}