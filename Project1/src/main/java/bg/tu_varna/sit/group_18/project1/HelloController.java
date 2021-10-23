package bg.tu_varna.sit.group_18.project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick(ActionEvent e) throws IOException {
        Parent home_page_parent =   FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        Scene home_page_scene = new Scene(home_page_parent, 1000, 700);
        Stage app_stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
}