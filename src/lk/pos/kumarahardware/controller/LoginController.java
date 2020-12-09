package lk.pos.kumarahardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.pos.kumarahardware.Preferences.Preferences;

import java.io.IOException;

public class LoginController {

    public TextField userName;
    public TextField passwordField;
    public AnchorPane root;
    public Label Notice;

    public void SigninAction(ActionEvent actionEvent) throws IOException {
        if(userName.getText().equals(Preferences.getInstance().getUsername()) &
                passwordField.getText().equals(Preferences.getInstance().getPassword())) {
            Stage stage = (Stage) this.root.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Dashboard.fxml"))));
            stage.setTitle("Dashboard");
        }
        else{
            Notice.setText("Invalid UserName or Password");
        }
    }
}
