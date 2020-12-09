package lk.pos.kumarahardware.DAO;

import lk.pos.kumarahardware.DAO.impl.CustomerDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }

    public static DAOFactory getInstance(){
        if(daoFactory==null){daoFactory=new DAOFactory();}return daoFactory;
    }

    public CustomerDAO getDAO(){
        return new CustomerDAOImpl();
    }
}
