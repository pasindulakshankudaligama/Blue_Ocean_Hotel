package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane dashBoardFormContext;
    public AnchorPane dashboardFormInContext;

    public void openDashBoardFormOne(ActionEvent actionEvent) throws IOException {
        loadUI("DashBoardFormOne");
    }

    public void openBookingFormOnAction(ActionEvent actionEvent) throws IOException {
        loadUI("BookingForm");

    }


    public void openViewFormOnAction(ActionEvent actionEvent) throws IOException {
        loadUI("ViewForm");
    }

    public void openPackageFormOnAction(ActionEvent actionEvent) throws IOException {
        loadUI("RoomPackagesForm");



    }
    void loadUI(String fileName) throws IOException {
        URL resource = getClass().getResource("../view/"+fileName+".fxml");
        Parent load = FXMLLoader.load(resource);
        dashboardFormInContext.getChildren().clear();
        dashboardFormInContext.getChildren().add(load);

    }
}
