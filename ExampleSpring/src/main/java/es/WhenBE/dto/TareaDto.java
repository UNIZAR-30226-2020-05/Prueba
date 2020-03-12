package es.WhenBE.dto;

import es.WhenBE.Tarea;

public class TareaDto {

    public TareaDto(Tarea tarea) {
        this.id = tarea.getId();
        this.nombre = tarea.getNombre();
        this.descripcion = tarea.getDescripcion();
        this.tiempoEst = tarea.getTiempoEst();
        this.asignatura = new AsignaturaDto(tarea.getAsignatura());
    }

    private Integer id;

    private String nombre;

    private String descripcion;

    private Integer tiempoEst;

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

    public Integer getTiempoEst() {
        return tiempoEst;
    }

    public void setTiempoEst(Integer tiempoEst) {
        this.tiempoEst = tiempoEst;
    }

    public AsignaturaDto getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturaDto asignatura) {
        this.asignatura = asignatura;
    }

}
