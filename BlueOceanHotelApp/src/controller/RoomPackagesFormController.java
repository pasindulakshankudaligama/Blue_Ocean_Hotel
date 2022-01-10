package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomPackagesFormController {
    public AnchorPane roomPackageFormContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomPackageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMealPlansOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomPackageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void backToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)  roomPackageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
