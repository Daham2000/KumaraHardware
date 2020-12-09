package lk.pos.kumarahardware.BO;

import lk.pos.kumarahardware.BO.Impl.CustomerBOImpl;
import lk.pos.kumarahardware.DAO.CustomerDAO;

public class BOFactory {
    private static BOFactory boFactory;

    public BOFactory() {
    }

    public static BOFactory getInstance(){
        if(boFactory==null){boFactory=new BOFactory();}return boFactory;
    }

    public CustomerBO getBO(){
        return new CustomerBOImpl();
    }
}
