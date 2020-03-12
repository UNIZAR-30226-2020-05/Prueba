package es.WhenBE.dto;

import es.WhenBE.Asignatura;
import es.WhenBE.Examen;

public class ExamenDto {

    public ExamenDto(Examen examen) {
        this.id = examen.getId();
        this.nombre = examen.getNombre();
        this.descripcion = examen.getDescripcion();
        this.asignatura = new AsignaturaDto(examen.getAsignatura());
    }

    private Integer id;

    private String nombre;

    private String descripcion;

    private AsignaturaDto asignatura;

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

    public AsignaturaDto getAsignatura() { return asignatura; }

    public void setAsignatura(AsignaturaDto asignatura) { this.asignatura = asignatura; }

}
