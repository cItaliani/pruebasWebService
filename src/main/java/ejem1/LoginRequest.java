package ejem1;

public class LoginRequest {
    private String alias;
    private String contrasena;

    public LoginRequest() {}

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias= alias;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
