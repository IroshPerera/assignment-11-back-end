package lk.ijse.assigment11backend.api;


import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.sql.Connection;

@WebServlet(name = "customer", urlPatterns = "/customer",
initParams = {
  @WebInitParam(name = "db-user", value = "root"),
    @WebInitParam(name = "db-pw", value = "1234"),
    @WebInitParam(name = "db-url", value = "jdbc:mysql://localhost:3306/"),
    @WebInitParam(name = "db-class", value = "com.mysql.cj.jdbc.Driver")

})

public class Customer extends HttpServlet {

    Connection connection;


}
