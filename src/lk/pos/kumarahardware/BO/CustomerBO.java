package lk.pos.kumarahardware.BO;

import lk.pos.kumarahardware.DTO.CustomerDTO;
import lk.pos.kumarahardware.Entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO {
    public boolean AddCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public String MakeCusID() throws SQLException, ClassNotFoundException;

    public ArrayList<String> loadAllCusNames() throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerDTO> getAllCustomerDetils(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
}
