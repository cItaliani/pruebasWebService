// Post.java
package ejem1;

import java.sql.Date;


public class Post {
    private String id;
    private String id_autor;
    private String contenido;
    private String urlMultimedia;
    private String idPostPadre;
    private Date fecha_creacion;

    // Constructor vacío
    public Post() {
    }

    // Constructor completo
    public Post(String id, String id_autor, String contenido, String urlMultimedia, String idPostPadre,
            Date fecha_creacion) {
        this.id = id;
        this.id_autor = id_autor;
        this.contenido = contenido;
        this.urlMultimedia = urlMultimedia;
        this.idPostPadre = idPostPadre;
        this.fecha_creacion = fecha_creacion;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrlMultimedia() {
        return urlMultimedia;
    }

    public void setUrlMultimedia(String urlMultimedia) {
        this.urlMultimedia = urlMultimedia;
    }

    public String getIdPostPadre() {
        return idPostPadre;
    }

    public void setIdPostPadre(String idPostPadre) {
        this.idPostPadre = idPostPadre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}