package br.org.faetectcc2018.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexaoJDBC {

    private static ConexaoJDBC conexaoJDBC;
    private ResourceBundle config;
    private String banco = "postgresql";

    private ConexaoJDBC() {
        config = ResourceBundle.getBundle("config");
    }

    public static ConexaoJDBC getInstance(){
        if (conexaoJDBC == null) conexaoJDBC = new ConexaoJDBC();
        return conexaoJDBC;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(config.getString("db.driver." + banco));
        return DriverManager.getConnection(config.getString("db.url." + banco), config.getString("db.user." + banco), config.getString("db.password." + banco));
    }
}
