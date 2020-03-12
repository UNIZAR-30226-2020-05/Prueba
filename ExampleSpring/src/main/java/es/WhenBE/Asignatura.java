package es.WhenBE;

import es.WhenBE.request.AsignaturaRequest;

import javax.persistence.*;
import java.util.List;

@Entity
public class Asignatura {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private String curso;

    private String descripcion;

    @OneToMany(mappedBy = "asignatura")
    private List<Tarea> tareas;

    @OneToMany(mappedBy = "asignatura")
    private List<Examen> examenes;

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

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void addTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    public void addExamen(Examen examen) {
        this.examenes.add(examen);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AsignaturaRequest toRequest() {
        AsignaturaRequest asignatura = new AsignaturaRequest();
        asignatura.setNombre(nombre);
        asignatura.setDescripcion(descripcion);
        asignatura.setCurso(curso);
        return asignatura;
    }

}
