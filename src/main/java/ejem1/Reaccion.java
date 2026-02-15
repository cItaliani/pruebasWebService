// Reaccion.java
package ejem1;

import java.sql.Date;

public class Reaccion {
    private String idUsuario;
    private String id_post;
    private Date fecha_creaccion;

    // Constructor vacío
    public Reaccion() {
    }

    // Constructor con parámetro
    public Reaccion(String idUsuario, String id_post, Date fecha_reaccion) {
        this.idUsuario = idUsuario;
        this.id_post = id_post;
        this.fecha_creaccion = fecha_reaccion;
    }

    // Getters y Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getId_post() {
        return id_post;
    }

    public void setId_post(String id_post) {
        this.id_post = id_post;
    }

    public Date getFecha_creacion() {
        return fecha_creaccion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creaccion = fecha_creacion;
    }

}