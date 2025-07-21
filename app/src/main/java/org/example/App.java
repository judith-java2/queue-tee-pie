package org.example;

public class App {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        QueueTees<Cutie> queue = new QueueTees<>(3);

        System.out.println("Queue size (should be 0): " + queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        System.out.println("Queue size (should be 3): " + queue.size());

        queue.enqueue(new Puppy()); 
        
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Queue size (should be 0): " + queue.size());

        queue.enqueue(puppy);
        System.out.println("Queue size (should be 1): " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear (should be 0): " + queue.size());
    }
}
