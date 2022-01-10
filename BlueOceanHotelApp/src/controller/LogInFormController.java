package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class LogInFormController {
    public AnchorPane LogInFormContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StartLogInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) LogInFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openAdminReceptionFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminAndReceptionForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) LogInFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
