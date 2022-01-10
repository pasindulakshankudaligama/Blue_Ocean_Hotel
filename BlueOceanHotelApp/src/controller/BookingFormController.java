package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class BookingFormController {
    public AnchorPane bookingFormContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) bookingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }



    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void backToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) bookingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


}

