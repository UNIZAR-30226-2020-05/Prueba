package es.WhenBE.request;

import es.WhenBE.Tarea;

import javax.persistence.*;

public class TareaRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String descripcion;

    private Integer tiempoEst;

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

    public Tarea toEntity() {
        Tarea tarea = new Tarea();
        tarea.setNombre(nombre);
        tarea.setDescripcion(descripcion);
        tarea.setTiempoEst(tiempoEst);
        return tarea;
    }
}
