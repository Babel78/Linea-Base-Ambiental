/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author axel
 */
public class db {
    
    private static db instance;
    
    public Connection connection=null;
    
    private String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "";

    // Nombre de usuario
    public String username = "";

    // Clave de usuario
    public String password = "";

    private db() {
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database Connection Creation Failed : " + e.getMessage());
        }
    }
    
    public db(String username,String password,String database,String host){
        try {
            Class.forName(driver);
            this.username = username;
            this.password = password;
            this.database = database;
            this.hostname = host;
            this.url = "jdbc:mysql://" + this.hostname +"/" + this.database+"?useUnicode=true&characterEncoding=utf-8";
            this.connection = DriverManager.getConnection(url, this.username, this.password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database Connection Creation Failed : " + e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
    
    
    
    
}
