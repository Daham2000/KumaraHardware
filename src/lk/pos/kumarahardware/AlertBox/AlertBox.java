package lk.pos.kumarahardware.AlertBox;

import javafx.scene.control.Alert;

public class AlertBox {
    private static Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
    private static AlertBox alertBox;
    public AlertBox() {

    }

    public static AlertBox getInstance(){
        if (alertBox==null){
            alertBox=new AlertBox();
        }
        return alertBox;
    }

    public void getSimpleAlert(String text){
        alert.setContentText(text);
        alert.show();
    }

    public void getErrorAlert(String text){
        alert.setAlertType(Alert.AlertType.ERROR);
        alert.setContentText(text);
        alert.show();
    }
}
