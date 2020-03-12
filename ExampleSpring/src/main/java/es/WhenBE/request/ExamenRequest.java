package es.WhenBE.request;

import es.WhenBE.Examen;

import javax.persistence.*;

public class ExamenRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

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

    public Examen toEntity() {
        Examen examen = new Examen();
        examen.setNombre(nombre);
        examen.setDescripcion(descripcion);
        return examen;
    }
}
