package lk.pos.kumarahardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable{


    public AnchorPane ManageCustomers;
    public Pane dashboard;
    public Pane StorePane;
    public Pane PaneMakeOrder;
    public Pane PanePayment;
    public Pane PaneReports;
    public Pane PaneHelp;

    public void ManageCus(ActionEvent actionEvent) throws IOException {
        hideAll();
        ManageCustomers.setVisible(true);
    }

    public void backtoDash(ActionEvent actionEvent) {
        hideAll();
        dashboard.setVisible(true);
    }

    public void loadStoreView(ActionEvent actionEvent) {
        hideAll();
        StorePane.setVisible(true);
    }

    public void loadMakeOrder(ActionEvent actionEvent) {
        hideAll();
        PaneMakeOrder.setVisible(true);
    }

    public void loadPayment(ActionEvent actionEvent) {
        hideAll();
        PanePayment.setVisible(true);
    }

    public void loadReports(ActionEvent actionEvent) {
        hideAll();
        PaneReports.setVisible(true);
    }

    public void loadHelp(ActionEvent actionEvent) {
        hideAll();
        PaneHelp.setVisible(true);
    }

    public void logOut(ActionEvent actionEvent) {
    }

    private void hideAll(){
        ManageCustomers.setVisible(false);
        dashboard.setVisible(false);
        StorePane.setVisible(false);
        PaneMakeOrder.setVisible(false);
        PanePayment.setVisible(false);
        PaneReports.setVisible(false);
        PaneHelp.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            ManageCustomers.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("ManageCustomer.fxml")));
//            StorePane.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("/view/ManageStore.fxml"+location)));
//            PaneMakeOrder.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("/view/MakeOrder.fxml"+location)));
////            PanePayment.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("/view/"+location)));
//            PaneReports.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("/view/Reports.fxml"+location)));
//            PaneHelp.getChildren().addAll((Node) FXMLLoader.load(getClass().getResource("/view/"+location)));
            hideAll();
            dashboard.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
