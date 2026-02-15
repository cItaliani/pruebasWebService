package ejem1;

public class User {
    private String alias;
    private String nombre_visible;
    private String correo_electronico;
    private String contrasena;
    private String biografia;
    private String fotografia;
    private String user_id;

    // region de setters
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre_visible(String nombre_visible) {
        this.nombre_visible = nombre_visible;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    // endregion
    // region de getters
    public String getAlias() {
        return alias;
    }

    public String getNombre_visible() {
        return nombre_visible;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getFotografia() {
        return fotografia;
    }

    public String getUser_id() {
        return user_id;
    }
    // endregion

    public User(){};
    
    public User(String user_id, String alias, String nombre_visible, String correo_electronico,String biografia, String fotografia) {
        this.user_id = user_id;
        this.alias = alias;
        this.nombre_visible = nombre_visible;
        this.correo_electronico = correo_electronico;
        this.biografia = biografia;
        this.fotografia = fotografia;
    }

}
