package lk.pos.kumarahardware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppInitializer extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/lk/pos/kumarahardware/view/Dashboard.fxml"))));
        primaryStage.setTitle("User Login");
        primaryStage.getIcons().add(new Image("lk/pos/kumarahardware/assects/img/icons8-openstack-128.png"));
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
