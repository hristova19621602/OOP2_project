package bg.tu_varna.sit.group_18.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuControler {
    public void onOperatorsButtonClick(ActionEvent e) throws IOException {
        Parent home_page_parent =   FXMLLoader.load(getClass().getResource("operators-view.fxml"));
        Scene home_page_scene = new Scene(home_page_parent, 1000, 700);
        Stage app_stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    public void onSuppliersButtonClick(ActionEvent actionEvent) {
    }

    public void onClientsButtonClick(ActionEvent actionEvent) {
    }

    public void onCashRegisterButtonClick(ActionEvent actionEvent) {
    }

    public void onWarehouseButtonClick(ActionEvent actionEvent) {
    }

    public void onExitButtonClick(ActionEvent e) {
        Stage app_stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        app_stage.hide();
    }
}
