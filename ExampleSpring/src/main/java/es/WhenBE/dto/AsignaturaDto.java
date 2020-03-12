package es.WhenBE.dto;

import es.WhenBE.Asignatura;
import es.WhenBE.Examen;
import es.WhenBE.Tarea;

import java.util.List;
import java.util.stream.Collectors;

public class AsignaturaDto {

    public AsignaturaDto(Asignatura asignatura) {
        this.id = asignatura.getId();
        this.nombre = asignatura.getNombre();
        this.curso = asignatura.getCurso();
        this.descripcion = asignatura.getDescripcion();
        this.tareasId = asignatura.getTareas()
                .stream()
                .mapToInt(Tarea::getId)
                .boxed()
                .collect(Collectors.toList());
        this.examenesId = asignatura.getExamenes()
                .stream()
                .mapToInt(Examen::getId)
                .boxed()
                .collect(Collectors.toList());
    }

    private Integer id;

    private String nombre;

    private String curso;

    private String descripcion;

    private List<Integer> tareasId;

    private List<Integer> examenesId;

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

    public List<Integer> getTareasId() {
        return tareasId;
    }

    public void setTareasId(List<Integer> tareasId) {
        this.tareasId = tareasId;
    }

    public List<Integer> getExamenesId() {
        return examenesId;
    }

    public void setExamenesId(List<Integer> examenesId) {
        this.examenesId = examenesId;
    }

}
