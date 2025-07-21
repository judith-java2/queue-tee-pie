package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class QueueTeesTest {

    private QueueTees<Cutie> queue;
    private Puppy puppy;
    private Kitty kitty;
    private PygmyMarmoset marmoset;

    @BeforeEach
    public void setup() {
        queue = new QueueTees<>(3);
        puppy = new Puppy();
        kitty = new Kitty();
        marmoset = new PygmyMarmoset();
    }

    @Test
    public void testInitialSizeIsZero() {
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueIncreasesSize() {
        queue.enqueue(puppy);
        assertEquals(1, queue.size());
        queue.enqueue(kitty);
        assertEquals(2, queue.size());
    }

    @Test
    public void testEnqueueWhenFull() {
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);
        assertEquals(3, queue.size());

        queue.enqueue(new Puppy());
        assertEquals(3, queue.size());
    }

    @Test
    public void testDequeueReturnsInCorrectOrder() {
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        assertEquals(puppy, queue.dequeue());
        assertEquals(kitty, queue.dequeue());
        assertEquals(marmoset, queue.dequeue());
    }

    @Test
    public void testDequeueOnEmptyQueueThrows() {
        assertThrows(NoSuchElementException.class, () -> queue.dequeue());
    }

    @Test
    public void testClearEmptiesQueue() {
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        assertEquals(2, queue.size());
        queue.clear();
        assertEquals(0, queue.size());
    }
}
