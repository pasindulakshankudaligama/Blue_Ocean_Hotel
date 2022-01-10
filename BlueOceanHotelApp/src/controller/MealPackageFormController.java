package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealPackageFormController {
    public AnchorPane mealPackageFormContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToRoomPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomPackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
