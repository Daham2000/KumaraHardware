package lk.pos.kumarahardware.DAO;

import lk.pos.kumarahardware.Entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CustomerDAO {
    public boolean saveCustomer(Customer customer) throws SQLException, ClassNotFoundException;

    public ResultSet getCusCount() throws SQLException, ClassNotFoundException;

    public ResultSet getAllCusNames() throws SQLException, ClassNotFoundException;

    public ResultSet getCusDetails(Customer customer) throws SQLException, ClassNotFoundException;
}
