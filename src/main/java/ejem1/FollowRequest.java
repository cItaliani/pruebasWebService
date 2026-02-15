// FollowRequest.java
package ejem1;

import java.sql.Date;

public class FollowRequest {
    private String id_seguidor;
    private String id_seguido;
    private Date fecha_inicio_follow;

    // Constructor vacío
    public FollowRequest() {
    }

    // Constructor con parámetro
    public FollowRequest(String id_seguidor, String id_seguido, Date fecha_inicio_follow) {
        this.id_seguidor = id_seguidor;
        this.id_seguido = id_seguido;
        this.fecha_inicio_follow = fecha_inicio_follow;
    }

    // Getters y Setters
    public String getId_seguidor() {
        return id_seguidor;
    }

    public String getId_seguido() {
        return id_seguido;
    }
    public Date getFecha_inicio_follow() {
        return fecha_inicio_follow;
    }

    public void setId_seguidor(String id_seguidor) {
        this.id_seguidor = id_seguidor;
    }

    public void setId_seguido(String id_seguido) {
        this.id_seguido = id_seguido;
    }
        public void setFecha_inicio_follow(Date fecha_inicio_follow) {
        this.fecha_inicio_follow=fecha_inicio_follow;
    }
}
