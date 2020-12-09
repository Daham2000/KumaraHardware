package lk.pos.kumarahardware.DAO.impl;

import lk.pos.kumarahardware.DAO.CrudUtil;
import lk.pos.kumarahardware.DAO.CustomerDAO;
import lk.pos.kumarahardware.Entity.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO{

    private static Connection connection;

    @Override
    public boolean saveCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("insert into Customer values(?,?,?,?)",customer.getCus_id(),customer.getCus_name(),
                customer.getCus_address(),customer.getCus_num());
    }

    @Override
    public ResultSet getCusCount() throws SQLException, ClassNotFoundException {
        return CrudUtil.executeQuery("select count(*) from Customer");
    }

    @Override
    public ResultSet getAllCusNames() throws SQLException, ClassNotFoundException {
        return CrudUtil.executeQuery("select Cus_name from customer");
    }

    @Override
    public ResultSet getCusDetails(Customer customer) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeQuery("select * from customer where Cus_name=(?)",customer.getCus_name());
    }
}
