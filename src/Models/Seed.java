package Models;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Seed {
    public void changeImage(ImageView imageView, String newImagePath) {
        imageView.setImage(new Image(getClass().getResourceAsStream(newImagePath)));
    }
}