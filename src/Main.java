import java.util.*;
import Modelo.Task;
import Modelo.System;

public class Main {
    public static void main(String[] args) {
        System sistema = new System();

        sistema.addTask(new Task(1,5, "Informe final"));
        sistema.addTask(new Task(2,2, "Revisar codigo"));
        sistema.addTask(new Task(3,7, "Presentación"));
        sistema.addTask(new Task(4,1, "Reunión urgente"));

        sistema.processTask();
        sistema.processTask();
    }
}