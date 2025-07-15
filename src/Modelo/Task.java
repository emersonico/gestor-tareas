package Modelo;

public class Task {
    int id; // el identificados unico
    int priority;
    String description;

    public Task(int id, int priority, String description) {
        this.id = id;
        this.priority = priority;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", prioridad=" + priority + ", descripcion='" + description + '\'' + '}';
    }


}
