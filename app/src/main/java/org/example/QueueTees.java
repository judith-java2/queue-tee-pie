package org.example;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class QueueTees<T> {
    private final ArrayList<T> elements;
    private final int maxSize;

    public QueueTees(int maxSize) {
        if (maxSize <= 0) throw new IllegalArgumentException("Max size must be > 0");
        this.maxSize = maxSize;
        this.elements = new ArrayList<>(maxSize);
    }

    public void enqueue(T element) {
        if (elements.size() == maxSize) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return;
        }
        elements.add(element);
    }

    public T dequeue() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue.");
        }
        return elements.remove(0);
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        elements.clear();
    }
}
