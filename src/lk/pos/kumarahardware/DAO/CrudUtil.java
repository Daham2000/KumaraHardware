package lk.pos.kumarahardware.DAO;

import lk.pos.kumarahardware.DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUtil {
    public static boolean executeUpdate(String sql, Object... params) throws SQLException, ClassNotFoundException {
        Connection connection= DBConnection.getInstance().getConnection();
        PreparedStatement ptm=connection.prepareStatement(sql);
        for (int i=0; i<params.length;i++){
            ptm.setObject(i+1,params[i]);
        }
        return ptm.executeUpdate()>0;
    }

    public static ResultSet executeQuery(String sql,Object... params) throws SQLException, ClassNotFoundException {
        Connection connection= DBConnection.getInstance().getConnection();
        PreparedStatement ptm=connection.prepareStatement(sql);
        for (int i=0; i<params.length;i++){
            ptm.setObject(i+1,params[i]);
        }
        return ptm.executeQuery();
    }
}
