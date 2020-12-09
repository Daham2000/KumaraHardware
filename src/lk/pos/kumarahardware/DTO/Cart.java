package lk.pos.kumarahardware.DTO;

public class Cart {
    private String Cus_id;
    private String Cus_name;
    private int Cus_num;
    private String Cus_address;
    private String OrderID;

    public Cart() {
    }

    public Cart(String cus_id, String cus_name, int cus_num, String cus_address, String orderID) {
        Cus_id = cus_id;
        Cus_name = cus_name;
        Cus_num = cus_num;
        Cus_address = cus_address;
        OrderID = orderID;
    }

    public String getCus_id() {
        return Cus_id;
    }

    public void setCus_id(String cus_id) {
        Cus_id = cus_id;
    }

    public String getCus_name() {
        return Cus_name;
    }

    public void setCus_name(String cus_name) {
        Cus_name = cus_name;
    }

    public int getCus_num() {
        return Cus_num;
    }

    public void setCus_num(int cus_num) {
        Cus_num = cus_num;
    }

    public String getCus_address() {
        return Cus_address;
    }

    public void setCus_address(String cus_address) {
        Cus_address = cus_address;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }
}
