/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.LoginBean;
import utils.JDBCUtils;

public class LoginDao {
	public static int id1;

    public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from users where username = ? and password = ? ")) {
            preparedStatement.setString(1, loginBean.getUsername());
            preparedStatement.setString(2, loginBean.getPassword());

//            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
            if(status) {
            	Statement stmt=connection.createStatement();
            	String s="select id from users where username= '"+loginBean.getUsername()+"';";
            	ResultSet rs1=stmt.executeQuery(s);
            	while(rs1.next())
            	{
            		id1=rs1.getInt("id");
            	}
            }
            	

        } catch (SQLException e) {
            // process sql exception
            JDBCUtils.printSQLException(e);
        }
        return status;
    }
    public static int getid()
    {
    	return id1;
    }
}