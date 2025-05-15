package Bank.Management.System;

import java.sql.*;

public class Conn {

    Connection connection;

    Statement statement;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Severus_1313");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
