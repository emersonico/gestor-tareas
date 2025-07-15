package Modelo;

import java.util.ArrayList;

public class Heap {

    private ArrayList<Task> heaps;
    public Heap() {
        heaps = new ArrayList<>();
    }

    public void insert(Task task) {
        heaps.add(task);
        heapifyUp(heaps.size() - 1);

    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heaps.get(index).priority < heaps.get(parent).priority) {
                exchange(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void exchange(int index1, int index2) {
        Task temp = heaps.get(index1);
        heaps.set(index1, heaps.get(index2));
        heaps.set(index2, temp);
    }

    private void heapifyDown(int index) {
        int size = heaps.size();

        while (true) {
            int left = index * 2 + 1;
            int right = left + 1;
            int lowest = index;

        }
    }


}
