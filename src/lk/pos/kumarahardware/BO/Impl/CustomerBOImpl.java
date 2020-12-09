package lk.pos.kumarahardware.BO.Impl;

import lk.pos.kumarahardware.BO.CustomerBO;
import lk.pos.kumarahardware.DAO.CustomerDAO;
import lk.pos.kumarahardware.DAO.DAOFactory;
import lk.pos.kumarahardware.DTO.CustomerDTO;
import lk.pos.kumarahardware.Entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO{

    Customer customerEntity;
    ArrayList<String> list;

    public CustomerBOImpl() {
    }

    CustomerDAO customerDAO= DAOFactory.getInstance().getDAO();

    @Override
    public boolean AddCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException {
        customerEntity=new Customer(customer.getCus_id(),customer.getCus_name(),
                customer.getCus_num(),customer.getCus_address());
        return customerDAO.saveCustomer(customerEntity);
    }

    public String MakeCusID() throws SQLException, ClassNotFoundException{
        String Cid="C0001";
        ResultSet resultSet = customerDAO.getCusCount();
        while (resultSet.next()){
            Cid="C00"+(resultSet.getInt(1)+1);
        }
        return Cid;
    }

    @Override
    public ArrayList<String> loadAllCusNames() throws SQLException, ClassNotFoundException {
        ResultSet set = customerDAO.getAllCusNames();
        list=new ArrayList<>();
        while(set.next()){
            list.add(set.getString(1));
        }
        return list;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomerDetils(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        customerEntity=new Customer(customerDTO.getCus_name());
        ArrayList<CustomerDTO> customelist=new ArrayList<>();
        ResultSet set = customerDAO.getCusDetails(customerEntity);
        while(set.next()){
            customelist.add((CustomerDTO) set.getObject(1));
        }
        return customelist;
    }

}
