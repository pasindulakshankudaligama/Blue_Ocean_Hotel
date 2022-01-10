package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminFormController {
    public AnchorPane adminFormContext;
    public AnchorPane adminFormInContext;

    public void openAdminIncomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminReportsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        adminFormContext.getChildren().clear();
        adminFormContext.getChildren().add(load);

    }

    public void openAdminPackagesOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminPackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        adminFormContext.getChildren().clear();
        adminFormContext.getChildren().add(load);

    }

    public void backToLogInFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminFormContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
