package Modelo;

public class Tarea {
    int id; // el identificados unico
    int prioridad;
    String descripcion;

    public Tarea(int id, int prioridad, String descripcion) {
        this.id = id;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", prioridad=" + prioridad + ", descripcion='" + descripcion + '\'' + '}';
    }


}
