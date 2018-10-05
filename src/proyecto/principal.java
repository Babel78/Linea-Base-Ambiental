/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.SQLException;

/**
 *
 * @author axel
 */
public class principal {
    public static void main(String[] args) throws SQLException {
        conexiondb c = new conexiondb();
        c.show(true);
        
    }
}
