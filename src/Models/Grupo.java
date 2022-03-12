package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DANIEL FELIX
 */
@Entity
@Table( name = "TblAulas" )
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="IdAula" )
    private Long id;
    private String NombreAula;
    private int Capacidad;
    private int Disponibilidad;

    public Grupo() {
    }
    
    public Grupo(String Nombre, int Capacidad, int Disponibilidad) {
        this.NombreAula = Nombre;
        this.Capacidad = Capacidad;
        this.Disponibilidad = Disponibilidad;
    }

    public Grupo(Long id, String Nombre, int Capacidad, int Disponibilidad) {
        this.id = id;
        this.NombreAula = Nombre;
        this.Capacidad = Capacidad;
        this.Disponibilidad = Disponibilidad;
    }
    public boolean isDisponible(){
        boolean dis = true;
        if (this.Disponibilidad == 0) {
            dis = false;
        }
        return dis;
    }
    public String getNombre() {
        return NombreAula;
    }

    public void setNombre(String Nombre) {
        this.NombreAula = Nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(int Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Grupo[ id=" + id + " ]";
    }
    
}
