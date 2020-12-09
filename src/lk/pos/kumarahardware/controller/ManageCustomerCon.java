package lk.pos.kumarahardware.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.pos.kumarahardware.AlertBox.AlertBox;
import lk.pos.kumarahardware.BO.BOFactory;
import lk.pos.kumarahardware.BO.CustomerBO;
import lk.pos.kumarahardware.DTO.Cart;
import lk.pos.kumarahardware.DTO.CustomerDTO;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManageCustomerCon implements Initializable{

    private static CustomerBO customerBO;
    public TextField C_nameFeild;
    public TextField C_addFeild;
    public TextField C_numFeild;
    public TextField C_idFeild;
    public AnchorPane root;
    public ComboBox CustomerNames;

    ObservableList<Cart> tableCart = FXCollections.observableArrayList();

    ArrayList<String> list;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        customerBO= BOFactory.getInstance().getBO();
        try {
            C_idFeild.setText(customerBO.MakeCusID());
            list = customerBO.loadAllCusNames();
            loadAllCusName();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException {
        boolean result=customerBO.AddCustomer(customer);
        if (result){
            AlertBox.getInstance().getSimpleAlert("Customer Added Successfull!!!");
        }else{
            AlertBox.getInstance().getErrorAlert("Customer Added unsuccessfull!!!");
        }
    }

    public void AddCustomerEvent(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String C_id=C_idFeild.getText();
        String C_name=C_nameFeild.getText();
        String C_add=C_addFeild.getText();
        int C_num= Integer.parseInt(C_numFeild.getText());
        saveCustomer(new CustomerDTO(C_id,C_name,C_num,C_add));
    }

    public void Refreash(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage)root.getScene().getWindow();
        root.getChildren().addAll((Node)(FXMLLoader.load(this.getClass().getResource("ManageCustomer.fxml"))));
    }

    private void loadAllCusName(){
        for (int i=0; i<list.size();i++){
            CustomerNames.getItems().add(list.get(i));
        }
    }

    public void loadCusDetails(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        CustomerDTO customerDTO=new CustomerDTO(CustomerNames.getValue().toString());
        ArrayList<CustomerDTO> list = customerBO.getAllCustomerDetils(customerDTO);
        for (int i=0;i<list.size();i++){

        }
    }

}
