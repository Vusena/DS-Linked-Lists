package org.queues;


public class Main {
        public static void main(String[] args) {
            System.out.println("");

            Queue myQueue = new Queue(4);

//            myQueue.getFirst();
//            myQueue.getLast();
//            myQueue.getLength();
//            System.out.println("\nQueue:");
//            myQueue.printQueue();
            //ENQUEUE
            myQueue.enqueue(10);
            myQueue.enqueue(17);
//            myQueue.printQueue();

            //DEQUEUE
            myQueue.dequeue();
            myQueue.printQueue();
        }
}
