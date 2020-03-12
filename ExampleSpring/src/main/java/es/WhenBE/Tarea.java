package es.WhenBE;

import es.WhenBE.request.TareaRequest;

import javax.persistence.*;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

    private Integer tiempoEst;

    @ManyToOne
    private Asignatura asignatura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEst() {
        return tiempoEst;
    }

    public void setTiempoEst(Integer tiempoEst) {
        this.tiempoEst = tiempoEst;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public TareaRequest toRequest() {
        TareaRequest tarea = new TareaRequest();
        tarea.setNombre(nombre);
        tarea.setDescripcion(descripcion);
        tarea.setTiempoEst(tiempoEst);
        return tarea;
    }
}
