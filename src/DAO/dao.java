/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author axel
 */
//System.out.println("Subproyecto: "+rs.getString(1)+" ,Poligono: "+rs.getString(2)+" ,Unidad Geografica: "+rs.getString(3)+" ,Zona de Estudio: "+rs.getString(4)+" ,Fecha: "+rs.getString(5)+" ,Estacion: "+rs.getString(6)+" ,Zona UTM: "+rs.getString(7)+" ,Este: "+rs.getFloat(8)+" ,Norte: "+rs.getFloat(9)+" ,Coord concatenada: "+rs.getFloat(8)+"-"+rs.getFloat(9)+" ,Profundidad: "+rs.getInt(10)+" ,Sustrato: "+rs.getString(11)+" ,Ecosistema: "+rs.getString(12)+" ,Presencia de Replicas: "+rs.getString(13)+" ,N replicas: "+rs.getInt(14)+" ,Replica: "+rs.getString(15)+" ,SP: "+rs.getString(16)+" ,NC: "+rs.getString(17)+" ,ECL: "+rs.getString(18)+" ,ECR: "+rs.getString(19)+" ,medida: "+rs.getString(20)+" ,unidad medida: "+rs.getString(21)+" ,valor: "+rs.getFloat(22));
public class dao {
    private final String subProyecto;
    private final String poligono;
    private final String unidad_geografica;
    private final String zona_de_estudio;
    private final String fecha;
    private final String estacion;
    private final String zona_utm;
    private final float este;
    private final float norte;
    private final String coord_concatenada;
    private final int profundidad;
    private final String sustrato;
    private final String ecosistema;
    private final String presencia_replicas;
    private final int n_replicas;
    private final String replica;
    private final String sp;
    private final String nc;
    private final String ecl;
    private final String ecr;
    private final String medida;
    private final String unidad_medida;
    private final float valor;

    public dao(String subProyecto, String poligono, String unidad_geografica, String zona_de_estudio, String fecha, String estacion, String zona_utm, float este, float norte, String coord_concatenada, int profundidad, String sustrato, String ecosistema, String presencia_replicas, int n_replicas, String replica, String sp, String nc, String ecl, String ecr, String medida, String unidad_medida, float valor) {
        this.subProyecto = subProyecto;
        this.poligono = poligono;
        this.unidad_geografica = unidad_geografica;
        this.zona_de_estudio = zona_de_estudio;
        this.fecha = fecha;
        this.estacion = estacion;
        this.zona_utm = zona_utm;
        this.este = este;
        this.norte = norte;
        this.coord_concatenada = coord_concatenada;
        this.profundidad = profundidad;
        this.sustrato = sustrato;
        this.ecosistema = ecosistema;
        this.presencia_replicas = presencia_replicas;
        this.n_replicas = n_replicas;
        this.replica = replica;
        this.sp = sp;
        this.nc = nc;
        this.ecl = ecl;
        this.ecr = ecr;
        this.medida = medida;
        this.unidad_medida = unidad_medida;
        this.valor = valor;
    }

    public String getSubProyecto() {
        return subProyecto;
    }

    public String getPoligono() {
        return poligono;
    }

    public String getUnidad_geografica() {
        return unidad_geografica;
    }

    public String getZona_de_estudio() {
        return zona_de_estudio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstacion() {
        return estacion;
    }

    public String getZona_utm() {
        return zona_utm;
    }

    public float getEste() {
        return este;
    }

    public float getNorte() {
        return norte;
    }

    public String getCoord_concatenada() {
        return coord_concatenada;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public String getSustrato() {
        return sustrato;
    }

    public String getEcosistema() {
        return ecosistema;
    }

    public String getPresencia_replicas() {
        return presencia_replicas;
    }

    public int getN_replicas() {
        return n_replicas;
    }

    public String getReplica() {
        return replica;
    }

    public String getSp() {
        return sp;
    }

    public String getNc() {
        return nc;
    }

    public String getEcl() {
        return ecl;
    }

    public String getEcr() {
        return ecr;
    }

    public String getMedida() {
        return medida;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public float getValor() {
        return valor;
    }
    
    
    
}
