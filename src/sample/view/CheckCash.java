package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.classes.Main;

import java.io.IOException;

public class CheckCash {

    @FXML
    private Button exitButton;

    @FXML
    void initialize() throws ClassNotFoundException {

        exitButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/ChooseOp.fxml"));
                Stage stage = (Stage) exitButton.getScene().getWindow();
                stage.setTitle("Choose");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
