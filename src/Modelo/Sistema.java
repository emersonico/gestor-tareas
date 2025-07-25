package Modelo;

public class Sistema {
    Heap heap;
    TreeAVL tree;

    public Sistema() {
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
            System.out.println("Procesando: " + task);
            tree.remove(task);
        }
    }

    public void searchTask(int id)  {
        Task t = tree.search(id);

        if (t != null) {
            System.out.println("Encontrado: " + t );
        } else {
            System.out.println("No encontrado");
        }
    }

}
