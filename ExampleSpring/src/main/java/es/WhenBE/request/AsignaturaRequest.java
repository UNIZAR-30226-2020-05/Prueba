package es.WhenBE.request;

import es.WhenBE.Asignatura;

import javax.persistence.*;

public class AsignaturaRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String curso;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Asignatura toEntity() {
        Asignatura asignatura = new Asignatura();
        asignatura.setNombre(nombre);
        asignatura.setDescripcion(descripcion);
        asignatura.setCurso(curso);
        return asignatura;
    }

}
