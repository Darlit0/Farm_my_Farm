package Models;

import javafx.scene.image.ImageView;

public class Salade extends Seed {
    private int price_salade = 20;
    private String name_salade = "Salade";
    private int total_salade;
    private int time_to_grow_salade = 30;
    private int give_money_salade = 30;

    public Salade(int total_salade) {
        this.total_salade = total_salade;
        this.price_salade = price_salade;
        this.name_salade = name_salade;
        this.time_to_grow_salade = time_to_grow_salade;
        this.give_money_salade = give_money_salade;
    }

    public int getPrice_salade() {
        return price_salade;
    }

    public String getName_salade() {
        return name_salade;
    }

    public int getTotal_salade() {
        return total_salade;
    }

    public int getTime_to_grow_salade() {
        return time_to_grow_salade;
    }

    public int getGive_money_salade() {
        return give_money_salade;
    }

    public void plantSalade(ImageView imageView) {
        changeImage(imageView, "/img/plant_salade.png");
    }
}
