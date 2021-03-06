package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.classes.Main;

import java.io.IOException;

public class GetCard {
    @FXML
    private Button acceptButton;

    @FXML
    void initialize() throws ClassNotFoundException {

        acceptButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/DeleteInfo.fxml"));
                Stage stage = (Stage) acceptButton.getScene().getWindow();
                stage.setTitle("get");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


}

