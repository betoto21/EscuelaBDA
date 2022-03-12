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
@Table(name = "TblAlumnos")
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "IdAlumno")
    private Long id;
    private String Nombre;
    private long IdAula;
    private int Activo;

    public Alumno() {
    }

    public Alumno(String Nombre, long IdAula, int Activo) {
        this.Nombre = Nombre;
        this.IdAula = IdAula;
        this.Activo = Activo;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getIdAula() {
        return IdAula;
    }

    public void setIdAula(int IdAula) {
        this.IdAula = IdAula;
    }

    public int getActivo() {
        return Activo;
    }

    public void setActivo(int Activo) {
        this.Activo = Activo;
    }
    
    public boolean isActivo(){
        boolean status = true;
        if (this.Activo == 1) {
            status = true;
        } else {
            status = false;
        }
        
        return status;
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
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Alumno[ id=" + id + " ]";
    }
    
}
