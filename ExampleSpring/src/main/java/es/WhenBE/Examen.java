package es.WhenBE;

import es.WhenBE.request.ExamenRequest;

import javax.persistence.*;

@Entity
public class Examen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

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

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public ExamenRequest toRequest() {
        ExamenRequest examen = new ExamenRequest();
        examen.setNombre(nombre);
        examen.setDescripcion(descripcion);
        return examen;
    }
}
