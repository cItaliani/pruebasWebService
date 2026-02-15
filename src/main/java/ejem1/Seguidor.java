// Seguidor.java
package ejem1;

import java.sql.Date;

public class Seguidor {
    private int idSeguidor;
    private int idSeguido;
    private Date fecha;

    // Constructor vacío
    public Seguidor() {}

    // Constructor completo
    public Seguidor(int idSeguidor, int idSeguido, Date fecha) {
        this.idSeguidor = idSeguidor;
        this.idSeguido = idSeguido;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getIdSeguidor() { 
        return idSeguidor; 
    }
    public void setIdSeguidor(int idSeguidor) { 
        this.idSeguidor = idSeguidor; 
    }

    public int getIdSeguido() { 
        return idSeguido; 
    }
    public void setIdSeguido(int idSeguido) { 
        this.idSeguido = idSeguido; 
    }

    public Date getFecha() { 
        return fecha; 
    }
    public void setFecha(Date fecha) { 
        this.fecha = fecha; 
    }
}