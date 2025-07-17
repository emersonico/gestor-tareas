package Modelo;

public class NodeAVL {
    Task task;
    NodeAVL left, right;
    int height;

    public NodeAVL(Task t) {
        task = t;
        height = 1;
    }
}
