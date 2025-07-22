package Modelo;

public class System {
    Heap heap;
    TreeAVL tree;

    public System() {
        heap = new Heap();
        tree = new TreeAVL();
    }

    public void addTask(Task task) {
        heap.insert(task);
        tree.insert(task);
    }

    public void processTask() {
        Task task = heap.extractMin();
        if (task != null) {
            java.lang.System.out.println("Procesando: " + task);
            tree.remove(task);
        }
    }

    public void searchTask(int id)  {
        Task t = tree.search(id);

        if (t != null) {
            java.lang.System.out.println("Encontrado: " + t );
        } else {
            java.lang.System.out.println("No encontrado");
        }
    }

}
