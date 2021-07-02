package t2012e;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainThread {
    public static void main(String[] args) {
        try {
        Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/t2012e_connect", "root", "");
            Statement stt = cnn.createStatement();
            String identityNumber ="A001";
            String fullname ="Nguyen";
            String address ="Ha Noi";
            String dateOfBirth ="2021/06/30";
            String email ="hoangnguyen@gmail.com";
            String sql = String.format("insert into teachers (identityNumber , fullname, address, dateOfBirth, email) " +
                    "values ('%s', '%s', '%s', '%s', '%s')", identityNumber,fullname, address, dateOfBirth, email);
            stt.execute(sql);
            System.out.println("ok");
        } catch (SQLException throwables) {
           throwables.printStackTrace();
        }

    }
}
