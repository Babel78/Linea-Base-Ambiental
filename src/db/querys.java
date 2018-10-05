/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import DAO.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author axel
 */
public class querys {
    
    Connection cnx;
    
    public static final String SQL_JOIN_ALL = "SELECT sub_proyecto.Subproyecto,poligono.Polígono,uni_geo.`Unidad Geográfica`,zon_est.Zona_de_estudio,estacion.Fecha,estacion.Estacion,sub_proyecto.utm,coord.Este,coord.Norte,coord.Profundidad,sustrato.Sustrato,ecosistema.Ecosistema,coord.`Presencia de réplicas`,coord.`Numero de muestras`,replica.Réplica,especies.Especie,especies.`Nombre comun`,ecl.ECL,especies.ECR,medidas.medidas,unidad_medida.unidad_medida,valor.Valor FROM sub_proyecto "
                            + "INNER JOIN poligono ON poligono.IDSubproyecto = sub_proyecto.IDSubproyecto "
                            + "INNER JOIN zon_est ON poligono.IDPolígono = zon_est.IDPoligono "
                            + "INNER JOIN uni_geo ON zon_est.IDUG = uni_geo.IDUG "
                            + "INNER JOIN estacion ON zon_est.IDZE = estacion.IDZE "
                            + "INNER JOIN coord ON estacion.IDE = coord.IDE "
                            + "INNER JOIN replica ON coord.IDC = replica.IDC "
                            + "INNER JOIN sustrato ON replica.IDSustr = sustrato.IDSustr "
                            + "INNER JOIN ecosistema ON coord.IDEcos = ecosistema.IDEcos "
                            + "INNER JOIN especies_replica ON replica.IDR = especies_replica.IDR "
                            + "INNER JOIN especies ON especies_replica.IDEsp = especies.IDEsp "
                            + "INNER JOIN ecl ON poligono.IDPolígono = ecl.IDPolígono "
                            + "INNER JOIN valor ON especies_replica.IDESR = valor.IDESR "
                            + "INNER JOIN medidas ON valor.IDM = medidas.IDM "
                            + "INNER JOIN unidad_medida ON valor.IDUM = unidad_medida.IDUM ";
    public static final String SQL_SUBPROYECTO ="WHERE sub_proyecto.Subproyecto = ?";
    public static final String SQL_POLIGONO ="WHERE poligono.Polígono = ?";
    public static final String SQL_UNIDAD_GEOGRAFICA ="WHERE uni_geo.`Unidad Geográfica` = ?";
    public static final String SQL_ZONA_ESTUDIO ="WHERE zon_est.Zona_de_estudio = ?";
    public static final String SQL_ESPECIE ="WHERE especies.Especie = ?";
    public static final String SQL_ESPECIE_NC ="WHERE especies.`Nombre comun` = ?";
    public static final String SQL_ECR ="WHERE especies.ECR = ?";
    public static final String SQL_AND_SUBPROYECTO =" AND sub_proyecto.Subproyecto = ?";
    public static final String SQL_AND_POLIGONO =" AND poligono.Polígono = ?";
    public static final String SQL_AND_UNIDAD_GEOGRAFICA =" AND uni_geo.`Unidad Geográfica` = ?";
    public static final String SQL_AND_ZONA_ESTUDIO =" AND zon_est.Zona_de_estudio = ?";
    public static final String SQL_AND_ESPECIE =" AND especies.Especie = ?";
    public static final String SQL_AND_ESPECIE_NC =" AND especies.`Nombre comun` = ?";
    public static final String SQL_AND_ECR =" AND especies.ECR = ?";

    public querys(db DB) throws SQLException {
        this.cnx = DB.getConnection();
    }
}
