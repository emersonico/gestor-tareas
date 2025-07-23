import Modelo.Task;
import Modelo.Sistema;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();



        sistema.addTask(new Task(10, 1, "Corrección de errores"));
        sistema.addTask(new Task(11, 2, "Entrega del reporte"));
        sistema.addTask(new Task(12, 3, "Planificación semanal"));
        sistema.addTask(new Task(13, 4, "Diseño del sistema"));
        sistema.addTask(new Task(14, 5, "Actualizar documentación"));

        sistema.processTask();
        sistema.processTask();
        sistema.processTask();
        sistema.processTask();
        sistema.processTask();

    }
}