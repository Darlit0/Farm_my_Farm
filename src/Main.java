import Buttons.*;
import Databases.*;
import Models.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    private boolean isCarrotteButtonClicked = false;
    private boolean isBléButtonClicked = false;
    private boolean isMaïsButtonClicked = false;
    private boolean isBettraveButtonClicked = false;
    private boolean isSaladeButtonClicked = false;
    private boolean isCanneSucreButtonClicked = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/fxml/Interface.fxml")));
        Parent root = loader.load();
        primaryStage.setTitle("Farm my Farm");
        primaryStage.setScene(new Scene(root, 1240, 1000));
        primaryStage.show();

        // Add event handler for the "Market" button
        Button marketButton = (Button) loader.getNamespace().get("marketButton");
        marketButton.setOnAction(event -> openMarket());

        // Add event handler for the "Carotte" button
        Button carrotteButton = (Button) loader.getNamespace().get("carrotteButton");
        carrotteButton.setOnAction(event -> isCarrotteButtonClicked = true);

        // Add event handler for the "Blé" button
        Button bléButton = (Button) loader.getNamespace().get("bléButton");
        bléButton.setOnAction(event -> isBléButtonClicked = true);

        // Add event handler for the "Maïs" button
        Button maïsButton = (Button) loader.getNamespace().get("maïsButton");
        maïsButton.setOnAction(event -> isMaïsButtonClicked = true);

        // Add event handler for the "Bettrave" button
        Button bettraveButton = (Button) loader.getNamespace().get("bettraveButton");
        bettraveButton.setOnAction(event -> isBettraveButtonClicked = true);

        // Add event handler for the "Salade" button
        Button saladeButton = (Button) loader.getNamespace().get("saladeButton");
        saladeButton.setOnAction(event -> isSaladeButtonClicked = true);

        // Add event handler for the "CanneSucre" button
        Button canneSucreButton = (Button) loader.getNamespace().get("canneSucreButton");
        canneSucreButton.setOnAction(event -> isCanneSucreButtonClicked = true);

        // Set up event handlers for the grid cells
        GridPane gridPane = (GridPane) root.lookup("#gridPane");
        if (gridPane != null) {
            setupGridEventHandlers(gridPane);
        }
    }

    private void openMarket() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Market.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Market");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);

            // Add event handler for the "X" button
            Button closeButton = (Button) loader.getNamespace().get("closeButton");
            closeButton.setOnAction(event -> stage.close());

            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupGridEventHandlers(GridPane gridPane) {
        for (Node node : gridPane.getChildren()) {
            if (node instanceof ImageView) {
                node.setOnMouseClicked(event -> {
                    if (isCarrotteButtonClicked) {
                        Carrotte carrotte = new Carrotte(1);
                        carrotte.plantCarrot((ImageView) node);
                        isCarrotteButtonClicked = false; // Reset the flag after planting
                    } else if (isBléButtonClicked) {
                        Blé blé = new Blé(1);
                        blé.plantBlé((ImageView) node);
                        isBléButtonClicked = false; // Reset the flag after planting
                    } else if (isMaïsButtonClicked) {
                        Maïs maïs = new Maïs(1);
                        maïs.plantMaïs((ImageView) node);
                        isMaïsButtonClicked = false; // Reset the flag after planting
                    } else if (isBettraveButtonClicked) {
                        Bettrave bettrave = new Bettrave(1);
                        bettrave.plantBettrave((ImageView) node);
                        isBettraveButtonClicked = false; // Reset the flag after planting
                    } else if (isSaladeButtonClicked) {
                        Salade salade = new Salade(1);
                        salade.plantSalade((ImageView) node);
                        isSaladeButtonClicked = false; // Reset the flag after planting
                    } else if (isCanneSucreButtonClicked) {
                        CanneSucre canneSucre = new CanneSucre(1);
                        canneSucre.plantCanneSucre((ImageView) node);
                        isCanneSucreButtonClicked = false; // Reset the flag after planting
                    }
                });
            }
        }
    }
}