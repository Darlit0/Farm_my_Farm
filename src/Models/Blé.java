package Models;

import javafx.scene.image.ImageView;

public class Blé extends Seed {
    private int price_blé = 50;
    private String name_blé = "Blé";
    private int total_blé;
    private int time_to_grow_blé = 60;
    private int give_money_blé = 60;

    public Blé(int total_blé) {
        this.total_blé = total_blé;
    }

    public int getPrice_blé() {
        return price_blé;
    }

    public String getName_blé() {
        return name_blé;
    }

    public int getTotal_blé() {
        return total_blé;
    }

    public int getTime_to_grow() {
        return time_to_grow_blé;
    }

    public int getGive_money_blé() {
        return give_money_blé;
    }

    public void plantBlé(ImageView imageView) {
        changeImage(imageView, "/img/plant_blé.png");
    }
}
